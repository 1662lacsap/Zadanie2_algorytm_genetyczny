import genetic.GeneticAlgorithm;
import genetic.Individual;

class MyGA extends GeneticAlgorithm {
    private int[][] sets;

    MyGA(int populationSize, double mutationRate, double crossoverRate,
         int elitismCount, int tournamentSize, int[][] sets) {
        super(populationSize, mutationRate, crossoverRate, elitismCount, tournamentSize);
        this.sets = sets;
    }

    @Override
    public double calcFitness(Individual individual) {
        double pathDuration = 0;
        int[] chosenObjects;
        try {
            for (int geneIndex = 0; geneIndex < individual.getChromosomeLength() - 1; geneIndex++) {
                chosenObjects = sets[individual.getGene(geneIndex)];
                pathDuration += chosenObjects[individual.getGene(geneIndex + 1)];
            }
        } catch (NullPointerException e) {
            System.out.println("NullPinterException: " + e.getMessage());
        }
        // Calculate and store fitness
        individual.setFitness(pathDuration);
        return pathDuration;
    }
}
