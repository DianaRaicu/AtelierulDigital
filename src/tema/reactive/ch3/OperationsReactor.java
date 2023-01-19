package tema.reactive.ch3;

import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

public class OperationsReactor {
    private static List<String> words = Arrays.asList(
            "the",
            "quick",
            "brown",
            "fox",
            "jumped",
            "over",
            "the",
            "lazy",
            "dog"    );

    static void displayingLetters(){
        Flux.fromIterable(words)
                .flatMap(word -> Flux.fromArray(word.split("")))
                .distinct()
                .sort()
                .zipWith(Flux.range(1, Integer.MAX_VALUE), (string, count) -> count + ": " + string)
                .subscribe(System.out::println);
    }

    static void findingMissingLetter(){
        Flux.fromIterable(words)
                .flatMap(word -> Flux.fromArray(word.split("")))
                .sort()
                .distinct()
                .zipWith(Flux.range(1, 27), (string, count) -> count + ": " + string)
                .filter(s -> !s.contains(" "))
                .subscribe(System.out::println);
    }

    static void restoringMissingLetter(){
        Flux.fromIterable(words)
                .flatMap(word -> Flux.fromArray(word.split("")))
                .sort()
                .distinct()
                .zipWith(Flux.range(1, 27), (string, count) -> count + ": " + string)
                .filter(s -> s.contains(" "))
                .subscribe(System.out::println);
}

}
