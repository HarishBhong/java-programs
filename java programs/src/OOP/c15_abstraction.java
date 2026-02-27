package OOP;

/*
abstract method can be declared inside abstract only. its not allowed to declare it outside abstract class.
An abstract method in Java can only be declared (not defined) inside an abstract class or interface. It does not have a body inside abstract class. body is in Subclass
Summary-->
abstract method--> declaration      --> inside abstract class
               --> definition(body) --> outside abstract class (inside subClass)

SubClass of abstract SuperClass:
1) if subClass is also abstract    --> it may or may not define the abstract method from its abstract Superclass
2) if the subClass is non-abstract --> it must compulsory define all the abstract method of its SuperClass. Otherwise it will throw error

 */
abstract class First
{
    abstract void print(); //this is the way to declare abstract method
                           // here we can not define the body of this abstract class. it will throw error

    /*eg.
    abstract void print()
    {

    }
    this is invalid syntax. We can not write {} part for abstract method inside abstract class. it throws error
     */

    void normalFunction() //nonAbstract/ normal/ concrete method -> allowed in abstract class
    {
        System.out.println("Non abstract function");
    }
}
class second extends First //this subclass of Abstract class is nonAbstract
{

    void print() {
        System.out.println("this is non abstract SubClass of abstract SuperClass");
    }
}

abstract class third extends First //abstract subclass
 {
    void printThird()
    {
        System.out.println("abstract sub class ");
    }
}

public class c15_abstraction {

    public static void main(String[] args)
    {
        First obj = new second();
        obj.print();

        //First obj1 = new First(); --> throws compile time error.
       //                           --> can not instantiate abstract class
       //                           --> ie. we cannot create object of abstract class. in this way others cannot use abstract method.

        // First obj2 = new third(); --> as it is also abstract subclass ie. its abstract it cannot be instantiated. its obj cannot be created
        //                           --> it needs its Sub class for using it
    }
}
