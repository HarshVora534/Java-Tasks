package Javaday2;

public class pattern8 {
    public static void main(String[] args) {
        for(int i=1;i<10;i++)
        {
            for(int j=1;j<6;j++)
            {
                if(i%4==1)
                {
                    if(j==1 || j==5)
                    {
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                else
                {
                    if(j==1 || j==5)
                    {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
