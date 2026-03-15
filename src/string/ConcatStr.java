package string;

public class ConcatStr {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = s1;

        s1 = s1.concat(" SE");
        s1 = s1 + " 8";

        System.out.println(s1);
        System.out.println(s2);
    }
}
