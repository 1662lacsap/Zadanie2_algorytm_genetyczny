package genetic;

import java.util.List;
import java.util.Random;

/**
 * "Individual" reprezentuje pojedyncze rozwiązanie kandydujące.
 *
 */
public class Individual {
    private int[] chromosome;
    private double fitness = -1;
    private int nextTask = 0;
    Random rng = new Random();
    List<Integer> nextTaskArray;

    /**
     * Initializes individual with specific chromosome
     *
     * @param chromosome The chromosome to give individual
     */
    public Individual(int[] chromosome) {
        // Create individual chromosome
        this.chromosome = chromosome;
    }

    /**
     * Initializes random individual.
     *
     *
     * @param chromosomeLength Długość pojedynczego chromosomu
     */
    public Individual(int chromosomeLength) {

        int[] individual;
        individual = new int[chromosomeLength + 1];
        individual[0] = 0;
        individual[chromosomeLength] = 0;
        for (int gene = 1; gene < chromosomeLength; gene++) {
            individual[gene] = gene;
        }

        this.chromosome = individual;

    }


    /**
     * Pobiera indywidualny chromosom
     *
     * @return The individual's chromosome
     */
    public int[] getChromosome() {
        return this.chromosome;
    }

    /**
     * Gets individual's chromosome length
     *
     * @return The individual's chromosome length
     */
    public int getChromosomeLength() {
        return this.chromosome.length;
    }

    /**
     * Set gene at offset
     *
     * @param gene
     * @param offset
     * @return gene
     */
    public void setGene(int offset, int gene) {
        this.chromosome[offset] = gene;
    }

    /**
     * Get gene at offset
     *
     * @param offset
     * @return gene
     */
    public int getGene(int offset) {
        return this.chromosome[offset];
    }

    /**
     * Store individual's fitness
     *
     * @param fitness The individuals fitness
     */
    public void setFitness(double fitness) {
        this.fitness = fitness;
    }

    /**
     * Gets individual's fitness
     *
     * @return The individual's fitness
     */
    public double getFitness() {
        return this.fitness;
    }


    /**
     * Display the chromosome as a string.
     *
     * @return string representation of the chromosome
     */
    public String toString() {
        String output = "";
        for (int gene = 0; gene < this.chromosome.length; gene++) {
            output += " " + this.chromosome[gene];
        }
        return output;
    }

    public boolean containsGene(int gene) {
        for (int i = 0; i < this.chromosome.length; i++) {
            if (this.chromosome[i] == gene) {
                return true;
            }
        }
        return false;
    }
}