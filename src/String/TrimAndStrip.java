package String;

public class TrimAndStrip {
    public static void main(String[] args) {
        String text = "\u2003Hello World\u2003";

        System.out.println("trim():  [" + text.trim()  + "]");
        System.out.println("strip(): [" + text.strip() + "]");

    }
}
