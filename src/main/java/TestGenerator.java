import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class TestGenerator {

    public static void main(String[] args) throws IOException {
        File file = new File("src/we.txt");

        // rozmiar tabeli
        Integer timeArraySize = 1000 + 1;
        Random random = new Random();

        String[] time = new String[timeArraySize];

        for (int i = 0; i < time.length; i++) {
            String s = i + " ";
            for (int j = 0; j < time.length; j++) {
                if (i != j) {
                    s += (random.nextInt(50) + 1) + " ";
                } else {
                    s += "0 ";
                }
            }
            time[i] = s.substring(0, s.length() - 1);

        }
        time[timeArraySize - 1] = time[timeArraySize - 1] + " ;";

        List<String> lines = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        IntStream.range(0, timeArraySize).mapToObj(s -> " " + s).forEach(sb::append);

        lines.add("param n := " + (timeArraySize - 1) + ';');
        lines.add("param c");
        lines.add(":" + sb.toString() + " :=");
        lines.addAll(Arrays.asList(time));
        lines.add("end;");

        lines.forEach(System.out::println);

        Files.write(Paths.get(file.getPath()), lines);

    }
}
