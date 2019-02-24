package genetic;

/**
 *
 * To jest klasa TestGenerator używana do uruchamiania algorytmu genetycznego.
 *
 */

public class AllOnesGA {

    public static void main(String[] args) {
        // Utwórz obiekt GA
        GeneticAlgorithm ga = new GeneticAlgorithm(100, 0.001, 0.95, 2, 5);

        // Inicjalizuj populację
        Population population = ga.initPopulation(50);

        // Oceń populację
        ga.evalPopulation(population);

        // Śledź bieżące generowanie
        int generation = 1;

        /**
         *
         * Uruchom pętlę ewolucji
         *
         */
        while (ga.isTerminationConditionMet(population) == false) {
            // Najlepiej dostosowane osobniki z populacji
            System.out.println("Best solution: " + population.getFittest(0).toString());

            // Zastosuj crossover
            population = ga.crossoverPopulation(population);

            // Zastosuj mutation
            population = ga.mutatePopulation(population);

            // Oceń populację
            ga.evalPopulation(population);

            // Zwiększ aktualną generację
            generation++;
        }

        /**
         *
         * Nie jesteśmy już w pętli, co oznacza, że mamy doskonałe rozwiązanie
         *
         */
        System.out.println("Znaleziono rozwiazanie w " + generation + " generations");
        System.out.println("Najlepsze rozwiązanie: " + population.getFittest(0).toString());
    }
}