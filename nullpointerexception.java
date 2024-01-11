package Javaday2;

public class nullpointerexception {
    public static void main(String[] args) {
        String s=null;
        a(s);
    }
    public static void a(String s) {
        System.out.println(s.toLowerCase());
    }
}
