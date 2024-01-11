package Javaday2;
import java.util.*;

public class sorting {
    public static void main(String[] args) {
    List<String> chars=new ArrayList<String>();
    chars.add("H");
    chars.add("E");
    chars.add("L");
    chars.add("L");
    chars.add("O");
    Collections.sort(chars);//it will sort list of char not string --Ex--chars.add("Hello")
    System.out.println(chars);   
    }
}
