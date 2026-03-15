package interfaces;

public class ClassAndInterfaces implements A,B {

    public static void main(String[] args) {
        new ClassAndInterfaces().print();
    }


    @Override
    public void print() {
        A.super.print();
    }
}
