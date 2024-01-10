class a1 {  
    public static void main(String args[]) {  
        String str = "I Love Java";  
        int input = 3;     
        String ans = c1(str, input);
        System.out.println(ans);    
    }  
    
    public static String c1(String str, int input) {
        String[] words = str.split("//s+"); 
        if (input > 0 && input <= words.length) {
            return words[input - 1];
        } else {
            return "Invalid Input";
        }
    }  
}
