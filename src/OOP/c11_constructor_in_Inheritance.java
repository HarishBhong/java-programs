package OOP;

class A{
     A()
    {
        System.out.println("A constructor");
    }

}
class B extends A{
     B()
    {
        System.out.println("B constructor");
    }
}
public class c11_constructor_in_Inheritance {
    public static void main(String[] args) {
        B obj = new B();
    }
}
    //as we create an obj for B class. Constructor for B gets called--> we know this
    //But in Inheritance: when we create an object for subclass.
    //                   --> 1st the constructor of Parent class gets called
    //                   --> then after that, constructor of SubClass gets called
