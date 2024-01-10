class c1{
    public void a1(){
        System.out.println("Wake, ");
    }
}
class c2 extends c1{
    public void a2(){
        System.out.println("Eat, ");
    }
}
class c3 extends c2{
    public void a3(){
        System.out.println("Sleep");
    }
}
class c4{
    public static void main(String[] args) {
        c3 a=new c3();
        a.a1();
        a.a2();
        a.a3();
        
    }
}

