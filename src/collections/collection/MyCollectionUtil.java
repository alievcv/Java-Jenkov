package collections.collection;

import java.util.*;

public class MyCollectionUtil {

    private static void doSomething(Collection<?> collection) {
        Iterator<?> iterator = collection.iterator();

        while (iterator.hasNext()) {
            Object element = iterator.next();
            System.out.println(collection.getClass() +" "+ element);
        }


    }

    public static void main(String[] args) {
        List<Integer> myList = List.of(1, 2, 3);
        doSomething(myList);
        Set<Integer> set = Set.of(1, 2, 3);
        doSomething(set);
        NavigableSet<Integer> navigableSet = new TreeSet<>();
        navigableSet.add(3);
        navigableSet.add(2);
        navigableSet.add(1);
        doSomething(navigableSet);
        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(3);
        sortedSet.add(2);
        sortedSet.add(1);
        doSomething(sortedSet);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        doSomething(queue);
        Deque<Integer> deque = new LinkedList<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        doSomething(deque);
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        doSomething(linkedList);

    }
}
