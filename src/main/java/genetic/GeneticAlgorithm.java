package genetic;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * Klasa GeneticAlgorithm jest do zarządzania
 * operacjami algorytmu genetycznego
 *
 */
public class GeneticAlgorithm {
    public int counterMutates = 0;
    private int populationSize;

    /**
     *
     * Stopień mutacji
     *
     *
     */
    private double mutationRate;

    /**
     * Crossover rate
     */
    private double crossoverRate;

    /**
     *   Elitaryzm najsilniejsi członkowie populacji których
     *   należy zachować z pokolenia na pokolenie. Jeśli osoba jest
     *   jedna z elit, nie będzie zmutowana ani skrzyżowana.
     */
    private int elitismCount;
    protected int tournamentSize;

    public GeneticAlgorithm(int populationSize, double mutationRate, double crossoverRate, int elitismCount, int tournamentSize) {
        this.populationSize = populationSize;
        this.mutationRate = mutationRate;
        this.crossoverRate = crossoverRate;
        this.elitismCount = elitismCount;
        this.tournamentSize = tournamentSize;
    }

    /**
     * Inicjalizuj populację
     *
     * @param chromosomeLength Długość pojedynczego chromosomu
     * @return populacja Wygenerowano początkową populację
     */
    public Population initPopulation(int chromosomeLength) {
        // Initialize population
        Population population = new Population(this.populationSize, chromosomeLength);
        return population;
    }

    /**
     * Calculate fitness for an individual.
     *
     * @param individual jednostka do oceny
     * @return double The fitness value for individual
     */
    public double calcFitness(Individual individual) {

        // Track number of correct genes
        int correctGenes = 0;

        // Loop over individual's genes
        for (int geneIndex = 0; geneIndex < individual.getChromosomeLength(); geneIndex++) {
            // Add one fitness point for each "1" found
            if (individual.getGene(geneIndex) == 1) {
                correctGenes += 1;
            }
        }

        // Calculate fitness
        double fitness = (double) correctGenes / individual.getChromosomeLength();

        // Store fitness
        individual.setFitness(fitness);

        return fitness;
    }

    /**
     * Evaluate the whole population
     * Oceń całą populację
     * <p>
     *
     * @param population populacja do oceny
     */
    public void evalPopulation(Population population) {
        double populationFitness = 0;

        // Loop over population evaluating individuals and suming population
        // fitness
        for (Individual individual : population.getIndividuals()) {
            if (individual == null) {
                System.out.println("NULL");
            }
            populationFitness += calcFitness(individual);
        }

        population.setPopulationFitness(populationFitness);
    }

    /**
     * Sprawdź, czy populacja spełniła warunek zakończenia
     *
     *
     * @param population
     * @return boolean Prawda, jeśli spełnione są warunki zakończenia, w przeciwnym razie fałsz
     */
    public boolean isTerminationConditionMet(Population population) {
        for (Individual individual : population.getIndividuals()) {
            if (individual.getFitness() == 1) {
                return true;
            }
        }

        return false;
    }

    /**
     * Select parent for crossover
     *
     * @param population The population to select parent from
     * @return The individual selected as a parent
     */
    public Individual selectParent(Population population) {
        // Create tournament
        Population tournament = new Population(this.tournamentSize);

        // Add random individuals to the tournament
        population.shuffle();
        for (int i = 0; i < this.tournamentSize; i++) {
            Individual tournamentIndividual = population.getIndividual(i);
            tournament.setIndividual(i, tournamentIndividual);
        }

        // Return the best
        return tournament.getFittest(0);
    }

    /**
     * Apply crossover to population
     *
     *
     * @param population The population to apply crossover to
     * @return The new population
     */
    public Population crossoverPopulation(Population population) {
        // Create new population
        Population newPopulation = new Population(population.size());
        Random rn = new Random();

        // Loop over current population by fitness
        for (int populationIndex = 0; populationIndex < population.size(); populationIndex++) {
            // Get parent1
            Individual parent1 = population.getFittest(populationIndex);

            // Apply crossover to this individual?
            if (this.crossoverRate > Math.random() && populationIndex >= this.elitismCount) {
                // Find parent2 with tournament selection
                Individual parent2 = this.selectParent(population);

                // Create blank offspring chromosome
                int offspringChromosome[] = new int[parent1.getChromosomeLength()];
                Arrays.fill(offspringChromosome, -1);
                Individual offspring = new Individual(offspringChromosome);
                offspring.setGene(0, 0);
                offspring.setGene(offspring.getChromosomeLength() - 1, 0);
                // Get subset of parent chromosomes
                int substrPos1 = rn.nextInt(parent1.getChromosomeLength());
                int substrPos2 = rn.nextInt(parent1.getChromosomeLength());

                // make the smaller the start and the larger the end
                final int startSubstr = Math.min(substrPos1, substrPos2);
                final int endSubstr = Math.max(substrPos1, substrPos2);

                // Loop and add the sub tour from parent1 to our child
                for (int i = startSubstr; i <= endSubstr; i++) {
                    offspring.setGene(i, parent1.getGene(i));
                }

                // Loop
                for (int i = 0; i < parent2.getChromosomeLength(); i++) {
                    int parent2Gene = i + endSubstr;
                    if (parent2Gene >= parent2.getChromosomeLength()) {
                        parent2Gene -= parent2.getChromosomeLength();
                    }

                    if (!offspring.containsGene(parent2.getGene(parent2Gene))) {
                        // Loop
                        for (int ii = 0; ii < offspring.getChromosomeLength(); ii++) {
                            // Spare position found
                            if (offspring.getGene(ii) == -1) {
                                offspring.setGene(ii, parent2.getGene(parent2Gene));
                                break;
                            }
                        }
                    }
                }

                // Add child
                newPopulation.setIndividual(populationIndex, offspring);
            } else {
                // Add individual to new population without applying crossover
                newPopulation.setIndividual(populationIndex, parent1);
            }
        }

        return newPopulation;
    }

    /**
     * Apply mutation to population
     *
     * Zastosuj mutację do populacji
     *
     *
     * @param population The population to apply mutation to
     * @return The mutated population
     */
    public Population mutatePopulation(Population population) {

        Random rn = new Random();
        // Initialize new population
        //boolean checkDuplicates = false;
        Population newPopulation = new Population(this.populationSize);

        // Loop over current population by fitness
        for (int populationIndex = 0; populationIndex < population.size(); populationIndex++) {
            Individual individual = population.getFittest(populationIndex);

            // Loop over individual's genes
            for (int geneIndex = 1; geneIndex < individual.getChromosomeLength() - 1; geneIndex++) {
                // Skip mutation if this is an elite individual
                if (populationIndex > this.elitismCount) {
                    // Does this gene need mutation?
                    if (this.mutationRate > Math.random()) {

                        // Get new gene position
                        int newGenePos = rn.nextInt(individual.getChromosomeLength() - 2) + 1;
                        // Get genes to swap
                        int gene1 = individual.getGene(newGenePos);
                        int gene2 = individual.getGene(geneIndex);
                        // Swap genes
                        individual.setGene(geneIndex, gene1);
                        individual.setGene(newGenePos, gene2);
                    }
                }
            }
            newPopulation.setIndividual(populationIndex, individual);
        }

        // Return mutated population
        return newPopulation;
    }

}