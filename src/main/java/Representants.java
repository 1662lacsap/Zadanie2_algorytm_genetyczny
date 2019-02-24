import genetic.Population;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

import java.io.IOException;
import java.util.Arrays;


public class Representants {
    public static void main(String[] args) {
        try {
            JobsLexer lexer = new JobsLexer(new ANTLRFileStream("src/we.txt"));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            JobsParser parser = new JobsParser(tokens);

            parser.run();

            System.out.println("Wczytałem " + parser.jobCount);


            MyGA ga = new MyGA(200, 0.001, 0.9, 2, 100, parser.times);
            Population population = ga.initPopulation(parser.times.length);
            System.out.println(Arrays.toString(population.getIndividuals()));
            ga.evalPopulation(population);
            System.out.println("Wartość początkowa: " + population.getFittest(0).getFitness());
            int generation = 1;
            System.out.println("Wykonuję algorytm genetyczny:");
            while (generation <= 10000) {
                population = ga.crossoverPopulation(population);
                population = ga.mutatePopulation(population);
                ga.evalPopulation(population);
                generation++;
                System.out.println("Generation: " + generation);
            }
            System.out.println("Najlepsze rozwiązanie: " +
                    population.getFittest(0).toString() + "\n Fitness: " + population.getFittest(0).getFitness());

        } catch (IOException | RecognitionException e) {
            e.printStackTrace();
        }
    }
}