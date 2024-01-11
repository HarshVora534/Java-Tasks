package Javaday2;

class ReverseString {
    public static void main(String args[]) {
        String str = "Welcome to MV clouds";
        String chr = "";
        String x = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                ch = str.charAt(i);
                chr = chr + ch;
            } else {
                chr = " " + chr;
                x = chr + x;
                chr= "";
            }
        }
        System.out.println(x);
    }
}


