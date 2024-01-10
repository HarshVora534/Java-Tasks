class Student{  
public int x=5;
private int y=5;
int a=10;
protected int z=19;
 public void meth1(){ 
  System.out.println(x);  
  System.out.println(y);
  System.out.println(z);
  System.out.println(a);  
 }  
}  
/**
 * app
 */
public class Accessmodifiers {

    public static void main(String[] args) {
        Student s=new Student();
        System.out.println(s.x);
        System.out.println(s.a);
        // System.out.println(s.y);
        System.out.println(s.z);
    }
}