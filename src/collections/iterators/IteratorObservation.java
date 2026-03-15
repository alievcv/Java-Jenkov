package collections.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorObservation {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        Iterator<String> iterator = list.iterator();

//        while (iterator.hasNext()) {
//            String element = iterator.next();
//            System.out.println("First iterators full list: "+list);
//            System.out.println("First iterators curr element: "+element);
//
//            if (element.equals("B")) {
//                list.remove("B"); // Agar oxirgidan bitta olding elementni remove qilsa exception otmaydi qolgan hamma holda, ConcurrentModificationException
//                iterator.remove();  // doesn't cause ConcurrentModificationException
//
//            }
//
//        }

        List<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");

//        Iterator<String> iterator2 = list2.iterator();
//
//        while (iterator2.hasNext()) {
//            System.out.println("Second iterators full list: "+list2);
//
//            String element = iterator2.next();
//            System.out.println("Second iterators element: "+element);
//
//
//            if (element.equals("D")) {
//                list2.add("F"); // causes ConcurrentModificationException
//                iterator2.remove(); // doesn't cause ConcurrentModificationException
//
//            }
//        }
        List<String> list3 = new ArrayList<>();
        list3.add("A");
        list3.add("B");
        list3.add("C");
        list3.add("D");

        Iterator<String> iterator3 = list3.iterator();

        iterator3.forEachRemaining(el ->{
            el = el+"a+";
//            if (el.equals("Ca+")){
//                list3.remove("Ca+");
//            }  also here ConcurrentModificationException gonna occure


            System.out.println(el);
        });
    }
}
