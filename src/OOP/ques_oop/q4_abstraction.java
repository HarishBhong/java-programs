package OOP.ques_oop;

/*
define Drinks interface. Implement the drinks interface for both Water and Milk class.
implement the drinkingFeeling() and getName() method

 */

interface Drinks
{
    void get_name();
    void drinkFeeling();
}
class Water implements Drinks
{
    public void get_name()  //interface derived methods must be declared public acc ess. its compulsion
    {
        System.out.println("Water");
    }
    public void drinkFeeling()
    {
        System.out.println("Water is great");
    }
}

class Milk implements Drinks
{
    public void get_name()
    {
        System.out.println("Milk");
    }
    public void drinkFeeling()
    {
        System.out.println("Milk is healthy");
    }
    void sum()  // as this is not interface method, it can be kept default access specifier ( no compulsion like interface methods)
    {
        System.out.println(5+5);
    }
}

public class q4_abstraction {

    public static void main(String[] args)
    {
        Water obj1 = new Water();
        Milk obj2 = new Milk();

        obj1.get_name();
        obj1.drinkFeeling();

        obj2.get_name();
        obj2.drinkFeeling();
        obj2.sum();
    }
}

/*
______________________NOTE_______________________
In Java, interface methods are always public, and any class implementing them must declare them as public too.
Otherwise, you'll get a compiler error:
attempting to assign weaker access privileges; was public

ie. All the methods that are derived in subClass implemented from a interface must be-- public methods
method derived from interface is called--> interface method. eg. above get_name() and DrinkFeeling() are interface methods
and these interface methods must be declared 'public'. its compulsory Otherwise it will through compiler error

thats for subClass inside interface there NO compulsion on method to be public

 */
