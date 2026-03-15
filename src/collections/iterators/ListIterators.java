package collections.iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterators {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(
                List.of("A", "B", "C", "D")
        );
        list.add("E");

        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            iterator.set(element.toLowerCase());
        }

        while (iterator.hasPrevious()) {
            String element = iterator.previous();
            System.out.println(element);
        }

        System.out.println(list);
    }
}
