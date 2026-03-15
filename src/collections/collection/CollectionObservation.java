package collections.collection;

import java.util.*;

public class CollectionObservation {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        Set<String> set = Set.of("B", "C", "A",  "D");
        NavigableSet<String> navigableSet = new TreeSet<>();
        navigableSet.addAll(set);
        list.addAll(navigableSet);
        System.out.println(list);

    }
}
