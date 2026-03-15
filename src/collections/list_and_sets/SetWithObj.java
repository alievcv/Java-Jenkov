package collections.list_and_sets;

import java.util.HashSet;
import java.util.Set;

public class SetWithObj {

    private static class Person{
        private String name;

        private Person(String name) {
            this.name = name;
        }
    }


    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();
        people.add(new Person("John"));
        people.add(new Person("John"));
        people.add(new Person("John"));
        System.out.println("Set size is: "  + people.size());
        people.stream().forEach(System.out::println);


    }
}
