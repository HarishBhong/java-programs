package OOP;
/*
interface: used for abstraction
         : it is for 100% abstraction
         : it is similar to class BUT its not class
         : plays imp role in OOP for abstraction
         : tells a class what to do
         : only method declaration. No body / No definition of method inside interface
         : interface do not have constructor
         : object declaration is not allowed for interface. ie. interface cannot be instantiated

implementing class  : class that implements interface is called--> "implementing class"
                    : implementing class 'implements' interface for its method declaration ( as like subclass 'extends' Superclass)
                    : we have to keep all abstract/implemented methods 'public' access modifier. So that they can be used by interface
 */
interface AAA
{
    void printA();
    void sumA();
}

class BBB implements AAA
{
    public void printA()
    {
        System.out.println(" print ");
    }

    public void sumA()
    {

    }
}

class CCC implements AAA
{
    public void printA() //though keep blank, BUT all implemented methods need to be declared here
    {

    }
    public void sumA()
    {

    }
}

public class c16_interface {
    public static void main(String[] args)
    {
        AAA obj = new BBB();
        obj.printA();
    }
}
