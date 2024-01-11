package Javaday2;

public class pattern9 {
    public static void main(String[] args) {
        for(int i=1;i<10;i++)
        {
            for(int j=1;j<10;j++)
            {
                if(j%8==1 || (i%5==0 && j%5==0))
                {
                    System.out.print("*");
                }
                else if((j%6==2 && i%6==2) || (j%4==3 && i%4==3))
                {
                    System.out.print("*");
                }
                else if(i<8 && j<8)
                {
                    if((j%2==0 && i%2==0 && i>2 && j>2))
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
