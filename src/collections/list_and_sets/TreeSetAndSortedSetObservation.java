package collections.list_and_sets;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetAndSortedSetObservation {
    public static void main(String[] args) {

        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(1);
        sortedSet.add(2);
        sortedSet.add(3);
        sortedSet.add(4);
        sortedSet.add(5);
        sortedSet.add(6);
        sortedSet.add(7);
        sortedSet.add(8);
        sortedSet.add(9);
        sortedSet.add(10);

        Iterator<Integer> sortedSetIterator = sortedSet.iterator();

        while (sortedSetIterator.hasNext()) {
            System.out.println("ascending iterator: " + sortedSetIterator.next());
        }

       TreeSet<Integer> treeSet = new TreeSet<>(sortedSet);
       treeSet.addAll(sortedSet);

       System.out.println("\n/**********************/\n");
       Iterator<Integer> treeSetIterator = treeSet.descendingIterator();

        while (treeSetIterator.hasNext()) {
            System.out.println("descending iterator: " + treeSetIterator.next());
        }

        TreeSet<Integer> treeSet2 = new TreeSet<>(sortedSet);
        System.out.println("Floor: " + treeSet2.floor(10));


    }
}
