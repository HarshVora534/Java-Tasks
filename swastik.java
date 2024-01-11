package Javaday2;

public class swastik {
    public static void main(String[] args) {
        for(int i=1;i<10;i++)
        {
            for (int j=1;j<10;j++)
            {
                if(i%5==0 || j%5==0)
                {
                    System.out.print("*");
                }
                else if((j%4==1 && j<6 && i<6) || (i==9 && j<6))
                {
                    System.out.print("*");
                }
                else if((j%4==1 && j>4 && i>4) || (i==1 && j>5)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
