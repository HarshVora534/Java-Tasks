package Javaday2;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    System.out.println("Enter Number");

    int a = num.nextInt();
    System.out.println("Number is: " + a);
    int x=a;
    int d=0;
    while(x!=0)
    {
      int b=x%10;
      int c=b*b*b;
      d=c+d;
      x=x/10;
    }
    if(d==a){
      System.out.println(a+" is a Armstrong Number");
    }
    else{
      System.out.println("Not an Armstrong number");
    }
  }
}