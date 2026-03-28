package interfaces;

public interface MyInterface {

    String a = "A";

    void doSomething();

    default void doSomethingElse(){
        System.out.println("Doing something else");
    }

    private void protectedMethod(){
        System.out.println("Private method");
    };
}
