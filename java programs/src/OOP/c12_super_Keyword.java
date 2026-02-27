package OOP;
/*

super Keyword is used in subclass to access the constructor, variables, methods of the Parent class
Syntax:
for calling Parent constructor: super();        --> NOTE: super(); for calling parents constructor works only inside Subclass constructor, Not outside of Subclass constructor.Not in other methods of subclass
for accessing Parent variable: super.varName;   --> can be used anywhere inside subclass
for accessing Parent method: super.methodName(); --> can be used anywhere inside subclass

this can also be done by, creating object of Parent Class inside subclass, And calling properties using that object.
But this method of using 'super' is largely used
 */

class AA{

    AA() //parent constructor
    {
        System.out.println("A / parent constructor");
    }

    int var = 10; //parent variable

    void A_prints() //parent method
    {
        System.out.println("method of A class/ parent");
    }
}

class BB extends AA{
    BB()
    {
        //super();
        System.out.println("B / subclass constructor");
        super.A_prints();
        System.out.println(super.var);

        //super();       //--> not allowed throws error. super() constructor-call not allowed after calling Parent's variable/function using super
                         //-->in the code "super()" should be above "super.var;" && "super.fun();"
        BB_prints();
    }

    void BB_prints()
    {
        //super();    //--> not allowed to call constructor "super()" outside of subclass constructor
                      //--> here outside subClass constructor, to call parent constructor, we need object creation
        System.out.println("BB_prints : method of subClass");
        System.out.println("super.var : "+super.var);
        super.A_prints();
        System.out.println();
        AA obj1 = new AA(); //for calling the constructor of the Parent class, object of Parent class needs to be created. As super() cannot be used here
    }
}
public class c12_super_Keyword {
    public static void main(String[] args)
    {
        BB obj  = new BB();

    }
}
