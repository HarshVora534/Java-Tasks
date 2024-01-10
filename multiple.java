interface c {  
    void a();  
}  
  
interface d {  
    void b();  
}  
  
class x implements c, d {  
    public void a() {  
        System.out.println("Hello!");  
    }  
  
    public void b() {  
        System.out.println("Hello!");  
    }  
}  
  
class y implements c, d {  
    public void a() {  
        System.out.println("Hello!");  
    }  
  
    public void b() {  
        System.out.println("Hello!");  
    }  
} 

class MultipleInheritance {  
    public static void main(String[] args) {  
        x warrior = new x();  
        y mage = new y();  
  
        warrior.a();  
        warrior.b(); 
  
        mage.a();   
        mage.b();  
    }  
}  