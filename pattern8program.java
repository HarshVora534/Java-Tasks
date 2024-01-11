package Javaday2;

public class pattern8program {
    public static void main(String[] args) {
        for(int i=1;i<10;i++)
        {
            for(int j=1;j<10;j++)
            {
                if(i%2==1)
                {
                    if((i%8==1 && j%5==0) || (i%8==1 && j%2==1 && i==9))
                    {
                        System.out.print("*");
                    }
                    else if((j%4==3 && i==5)||(j%6==2 && i==7) || (j%2==0 && i==3 && j>2 && j<8))
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
