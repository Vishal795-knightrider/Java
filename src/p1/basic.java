package p1;

class pen {               //pen ka blue print
    String color;
    String type;

    public void write() {
        System.out.println("writing something");
    }

    public void printColor() {
        System.out.println(this.color);  //this= printColor fn ko jo bhi object
    }                                      //call karega uska yeh color print krwa dega
}                            // this btaeyega ki fn ko kis object ne call kiya hai


class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name,int age){            //constructor
        this.name=name;
        this.age=age;
    }
}


public class basic {
    public static void main(String[] args){
//        pen p1=new pen();  //hr object ke pass kuch prop. hoti hai aur kuch
//        p1.color="red";    //methods hoti hai prop. like color and type
//        p1.type="gel";
//
//        pen p2=new pen();
//        p2.color="black";
//        p2.type="boll";
//        p1.printColor();
//        p2.printColor();

        Student s1=new Student("Vishal",18);
        s1.printInfo();

    }
}
