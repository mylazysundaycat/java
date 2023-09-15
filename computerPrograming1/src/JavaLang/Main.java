package JavaLang;

public class Main {
    public static void main(String[] args) {
        String a = new String("abc");
        String b = new String("abc");

        System.out.println(a.equals(b));
        System.out.println(a==b);

        String c = "hi";
        String d = "hi";
        System.out.println(c.equals(d));
        System.out.println(c==d);

    }
}
