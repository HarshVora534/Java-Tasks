import java.util.ArrayList;

public class odd {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<Integer>();
        List.add(1);
        List.add(3);
        List.add(5);
        List.add(7);
        System.out.println(List);

        for (int i = 0; i < List.size(); i++) {
            int x = List.get(i);
            System.out.println(x);

            if (x % 2 != 0) {
                System.out.println("List Contains all Odd Integers");
                break;
            } else {
                System.out.println("List contains also even Integers");
            }
        }
    }
}
