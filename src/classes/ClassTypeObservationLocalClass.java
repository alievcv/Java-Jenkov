package classes;

import java.util.EnumSet;

public class ClassTypeObservationLocalClass {

    private void createObjectAndPrint(String name, int age){
        class LocalClass{
            private int age;
            private String name;

            public LocalClass(int age, String name){
                this.age = age;
                this.name = name;
            }

            public void print(){
                System.out.println("Create local class{\n\t"+ "Name: " + name + " Age: " + age + "\n}");
            }
        }
        new LocalClass(age, name).print();
    }

    private void createEnumAndPrint(){
        enum Color{RED, GREEN, BLUE}
        EnumSet<Color> colors = EnumSet.of(Color.RED, Color.GREEN);
        colors.forEach(n -> System.out.println("Create enums and print "+ n));
    }

    public static void main(String[] args) {
        new ClassTypeObservationLocalClass().createObjectAndPrint("Alex", 21);
        new ClassTypeObservationLocalClass().createObjectAndPrint("Samantha", 19);
        new ClassTypeObservationLocalClass().createEnumAndPrint();
    }
}
