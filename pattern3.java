package Javaday2;

public class pattern3 {
    public static void main(String[] args) {
        for(int i=1;i<10;i++)
        {
            for(int j=1;j<10;j++)
            {
                if(i%10==1 || i%10==9)
                {
                    if((j>=5 && i==1)||(j<6 && i==9))
                    {
                        {
                            System.out.print("*");
                        }
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                else if(i%2==1 && i!=1 && i!=9)
                {
                    if((j%4==0 && i==3) ||(j%4==3 && i==5) ||(j%4==2 && i==7))
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
