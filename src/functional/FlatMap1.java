package functional;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class FlatMap1 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\RAICU\\IdeaProjects\\AtelierulDigitalGoogle\\src\\functional\\input.txt"));
        long count = reader
                .lines()
                .flatMap(line -> {
                    return Stream.of(line.split(" "));
                })
                .count();
        System.out.println("Number o characters: " + count);
        reader.close();
    }
}
