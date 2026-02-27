package OOP;
/*

polymorphism --> means more than one form
            --> offers code readability and flexibility

2 types --> i) compile-time / Static polymorphism (method overloading)
           ii) run-time   /  Dynamic polymorphism  (method overriding)

           here we will se compile time polymorphism
           run time polymorphism is in Inheritance
 */

//method selection is done during compile time--> hence the name

public class c9_polymorphism {
    public static int sum(int a, int b)  //2 integer parameters
    {
        return (a+b);
    }

    public static int sum(int a, int b, int c) //3 integer parameters
    {
        return (a+b+c);
    }

    public static double sum(double a, double b) //2 double type parameters
    {
        return (a+b);
    }

    public double sum(int a, double b)  //2 parameters- 1 int and 1 double
    {
        return (a+b);
    }

    public static void main(String[] args)
    {
        // Calling static overloaded methods
        System.out.println(sum(1,2));             //calling int, int
        System.out.println(sum(1,2,3));        //calling int,int,int
        System.out.println(sum(1.5,2.5));         //calling double,double

        //directly calling non static method from static method is not allowed
        //we have to create object for NonStatic method and access the method through its object
        c9_polymorphism obj = new c9_polymorphism();
        obj.sum(1,2.5);
        System.out.println(obj.sum(1,2.5));

    }
}
/*
Here we have three functions with same name 'sum'.
but difference is they have different number of parameters || different datatype of parameters
that's how compiler at compile time, gets to know which function is being referred while calling the function


 */