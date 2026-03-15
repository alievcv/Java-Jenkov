package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListObservation {

    private String name;
    private int age;

    public ListObservation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        List list = new ArrayList();

        ListObservation listObservation = new ListObservation("John", 20);
        String hello = "Hello";
        Integer number = 10;

        list.add(listObservation);
        list.add(hello);
        list.add(number);

        System.out.println(list.get(0).getClass().getName());
        System.out.println(list.get(1).getClass().getName());
        System.out.println(list.get(2).getClass().getName());

        List<String> nullList = new ArrayList<>();
        String nullString = null;
        nullList.add(nullString);
        nullList.add("Hello");
        nullList.add(nullString);
        System.out.println(nullList);

    }
}
