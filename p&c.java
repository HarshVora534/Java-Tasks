package Javaday2;
import java.util.Scanner;
class pc {

  public static void main(String[] args) {
    Scanner num1 = new Scanner(System.in);
    Scanner num2 = new Scanner(System.in);
    System.out.println("Enter Number 1");
    int a = num1.nextInt();
    System.out.println("Enter Number 2");
    int b = num2.nextInt();
    if(a>b)
    {
    int ans1=1;
    int ans2=1;
    int ans3=1;
    for(int i=1;i<=a;i++)
    {
      ans1=ans1*i;
    }
    for(int i=1;i<=b;i++)
    {
      ans2=ans2*i;
    }
    int d=a-b;
     for(int i=1;i<=d;i++)
    {
      ans3=ans3*i;
    }
    int com=((ans1)/(ans2*ans3));
    int per=(ans1/ans3);
    System.out.println("Combination is: "+com);
    System.out.println("Permutation is: "+per);
  }
  else{
    System.out.println("Enter valid Numbers");
  }
}
}
