package collections.list_and_sets;

import java.util.HashSet;
import java.util.Set;

public class ListWIthSet {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("A");
//        list.add("B");
//        list.add("C");
//        list.add("D");
//
//        Set<String> set = new HashSet<>();
//        set.add("A");
//        set.add("B");
//        set.add("C");
//        set.add("D");
//
//        System.out.println(set);
//
////        set.addAll(list);
//        boolean isEqual = set.retainAll(list);
//
//        if (isEqual) {
//            System.out.println("Both lists are equal");
//        } else {
//            System.out.println("Lists are not equal");
//        }

        Set set = new HashSet<>();
        String string1 = new String("A");
        String string2 = new String("A");
        StringBuilder stringBuilder = new StringBuilder("A");
        StringBuilder stringBuilder2 = new StringBuilder("A");
        StringBuffer stringBuffer = new StringBuffer("A");
        StringBuffer stringBuffer2 = new StringBuffer("A");

        set.add(string1);
        set.add(string2);
        set.add(stringBuffer);
        set.add(stringBuffer2);
        set.add(stringBuilder);
        set.add(stringBuilder2);

        set.stream().forEach(n -> System.out.println(n + " " + n.getClass().getName()));


//        System.out.println(set);

    }
}
