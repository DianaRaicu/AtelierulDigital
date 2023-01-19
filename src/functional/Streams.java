package functional;


import java.util.*;

public class Streams {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList("abc","bcde","cearkeok","sd"));

        Optional<String> i=list.stream()
                .filter(s -> {
                    System.out.println("filter " + s);
                    return s.length()>3;
                })
                .map(s -> {
                    System.out.println("map " + s);
                    return s.toUpperCase(Locale.ROOT);
                })
                .findFirst();
        System.out.println("args= " + i);
    }
}
