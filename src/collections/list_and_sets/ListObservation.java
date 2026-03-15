package collections.list_and_sets;

import java.util.ArrayList;
import java.util.List;

public class ListObservation {

    private String name;
    private int age;

    public ListObservation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        List list = new ArrayList();

        ListObservation listObservation = new ListObservation("John", 20);
        String hello = "Hello";
        Integer number = 10;

        list.add(listObservation);
        list.add(hello);
        list.add(number);

//        System.out.println(list.get(0).getClass().getName());
//        System.out.println(list.get(1).getClass().getName());
//        System.out.println(list.get(2).getClass().getName());

        List<String> nullList = new ArrayList<>();

        String nullString = null;
        nullList.add(nullString);
        nullList.add("Hello");
        nullList.add(nullString);
//        System.out.println(nullList);

        nullList.add(1, nullString);
        nullList.add(2, "World");
//        System.out.println(nullList);

        System.out.println(list);

        list.addAll(nullList);

        System.out.println(list);

        list.removeAll(nullList);

        System.out.println(list);

        list.clear();

        System.out.println(list);



    }
}
