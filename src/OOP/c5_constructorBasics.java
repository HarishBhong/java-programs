package OOP;
/*
constructor --> function with same name as ClassName
            --> constructor of a class gets called with object creation. "automatically (default)"

            --> constructor has no returnType NOT even void

 */

class ABC
{
    public ABC()      //constructor is function inside class. with same name as className
    {
        System.out.println("this is constructor");
    }

}
public class c5_constructorBasics {
    public static void main(String[] args) {

        new ABC(); //means we are creating an object of class ABC using its constructor ABC().
                       //"Java requires a constructor to be called - when creating an object using 'new' keyword.

        ABC obj1 = new ABC();  //object creation. and assigning it to variableNamed 'obj'
    }
}

// "new ABC() --> this line is for creating object of class ABC"
//this object is assigned to a variable named 'obj' whose type is ABC

        /*
        LHS: 'ABC obj'
        Meaning: You are declaring a reference variable named obj of type ABC.( just like 'int age' creates 'age' of type 'int')
        What it does:
        --> Tells the Java compiler that obj can hold the reference (address) of an object of type ABC.
        --> Class is a user defined datatype. so 'obj' is a variable of type ABC
        --> here 'LHS' Does NOT create any object—it just reserves a name (variable) to store the object later.

        RHS: new ABC()
        Meaning: You are creating a new object of class ABC using the new keyword,
                    here we need to call the constructor ABC() for creating object of that class.

        What it does:

        --> 'new' keyword is used to allocate memory in heap
        --> Allocates memory for a new object of type ABC.
        --> "Calls the constructor of the class ABC to initialize the object."
        --> Returns the reference (memory address) to that newly created object.

As here the object is created--> constructor gets called automatically. constructor is a function--> so gives output OR result when called.
    */

/*
TYPES of constructor:
            1) default cnstr.      --> initialization
            2) parametrized cnstr. -->
            3) copy cnstr.

            4) Private cnstr. --> rarely used

            Constructor chaining --> not a type of cnstr. But used to call one cnstr from another constructor in same class.
                                     this() --> this() method is used to chain constructors
 */