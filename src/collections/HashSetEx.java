package collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class HashSetEx {
    public static void main(String[] args) {
        Collection<Integer> withDups = new HashSet<Integer>(List.of(1,1,1,2,3,4,5,7,8,8,8));
    }

}
