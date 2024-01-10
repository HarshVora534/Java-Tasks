// public class encryptdecrypt {

//     public static void main(String[] args) {
//         String str="Hello, how are you??";
//         System.out.println(str);
//         char[] chars=str.toCharArray();
//         for(char c : chars)
//         {
//             c+=2;
//             System.out.print(c);
//         }
//     }
// }

public class encryptdecrypt {

    public static void main(String[] args) {
        String str="Jgnnq./jqy/ctg/{qwAA";
        System.out.println(str);
        char[] chars=str.toCharArray();
        for(char c : chars)
        {
            c-=2;
            System.out.print(c);
        }
    }
}