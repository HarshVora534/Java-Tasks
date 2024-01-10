public class Swapping {
   
    public static void main(String[] args) {
        int x=10;
        int y=11;
        System.out.println("Before Swapping: x= "+x+" y= "+y);
        x=y+x;
        y=x-y;
        x=x-y;
        System.out.println("After Swapping: x= "+x+" y= "+y);

    }
}

