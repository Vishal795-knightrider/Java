package Oops.Abstraction;

abstract public class Vehicle {
    int no_tyre;
    void common(){
        System.out.println("This is common");
    }
    abstract void stop();
    public static void main(String[] args){
        car car=new car();
        car.no_tyre=4;
        car.stop();
    }
}
