package OOP;
/*
Function overriding -- Runtime polymorphism
This is polymorphism
if ParentClass and Subclass have the same methodName,--> then child class will override the parent function
                                                     --> and preference will be given to the child class.
                                                     --> ie. parent function will be ignored

As the function names are same--> this is polymorphism
which method to be executed from both sameNamed methods is decided at runtime. ie. JVM chooses the method while executing the program
here JVM during runtime(execution time) decides which method to execute based on--> actual object type and inheritance. and runs subclass method


 at compile time --> compiler only checks the reference type of the reference variable. and runs method with correct parameters

  */

class I
{
    I()
    {
        System.out.println("superclass constructor");
    }
    void prints()
    {
        System.out.println("Super class print()");
    }
}

class J extends I
{
    J()
    {
        System.out.println("subclass constructor");
    }
    void prints()
    {
        System.out.println("Subclass print()");
    }
}
public class c13_func_OverRiding {
    public static void main(String[] args)
    {
        System.out.println("object of Sub class created:");
        J obj = new J();
        System.out.println("method call using SubClass object:");
        obj.prints();

        System.out.println();
        System.out.println("object of parent class created:");
        I obj1 = new I();
        System.out.println("method call using Parent object:");
        obj1.prints();

        System.out.println();
        System.out.println("object of Subclass, but stored in reference variable of Parent class type:");
        //we can create variable of ParentClass type & store Subclass object in it
        I obj2 = new J(); //note here object created of J type (ie. subclass) But stored in reference variable of I type(ie, ParentClass)
                          //for runtime(method Overriding) type of object matters. ie. from this object of subclass. subclass method will override. if similar method present in parent class
        System.out.println("method call, using that object of subclass");
        obj2.prints();
    }
}
