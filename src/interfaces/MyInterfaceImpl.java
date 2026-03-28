package interfaces;

public class MyInterfaceImpl implements MyInterface{

    String b = "B";

    @Override
    public void doSomething() {
        System.out.println("Doing something in IMPL");
    }

    public static void main(String[] args) {
        MyInterfaceImpl myInterfaceImpl = new MyInterfaceImpl();
        myInterfaceImpl.doSomething();
        System.out.println(MyInterface.a);

    }
}
