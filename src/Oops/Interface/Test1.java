package Oops.Interface;

interface Inter1{         //interface ke andar agar sirf 1 method hai to functonal interface
    int x=112;             //by deafult yeh public static final hai
    void method1();       // by default yeh public abstract
}
interface Inter2{         //interface ke andar agar sirf 1 method hai to functonal interface
    int x=115;             //by deafult yeh public static final hai
    void method3();       // by default yeh public abstract
}


public class Test1 implements Inter1,Inter2{
    public static void main(String[] args) {
        System.out.println("Main Entry Point");
        System.out.println(Inter1.x);
        int x=113;
        System.out.println(x);
    }
    public void method1(){
        System.out.println("This is my method1");
    }
    public void method3(){
        System.out.println("This is my method3");
    }
}
