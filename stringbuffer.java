// class Main {
//     public static void main(String[] args) {
//         StringBuffer s= new StringBuffer();
//         s.append("Hii ");
//         s.append("myself ");
//         s.append("Harsh Vora");
//         System.out.println(s);
//         s.delete(0, s.length());
//         System.out.println(s);
//     }
// }
class Main {
    public static void main(String[] args) {
        StringBuffer s= new StringBuffer();
        s.append("Hii ");
        s.append("myself ");
        s.append("Harsh");
        System.out.println(s);
        s.setLength(0);
        System.out.println(s);
    }
}