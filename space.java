package Javaday2;

class a1 {
    public static void main(String args[]) {
        String str = "Welcome to MV clouds";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {             //charAt(i) returns char at particular index
                System.out.print(str.charAt(i));    // while indexAt(i) returns index of first occurance of particaluar char
            } else {
                continue;
            }
        }
    }
}
