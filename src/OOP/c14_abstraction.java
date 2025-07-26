package OOP;

/*
Abstraction --> Hiding internal implementation details from user
            --> showing only essential features of an object
            --> hides complexity
            --> Hides the internal logic of program

In JAVA abstraction can be achieved by 2 way --> abstract class OR interfaces
abstract class: gives partial abstraction with both normal and abstract functions
interfaces: give you 100% abstraction

 Syntax for abstract class: abstract<keyword> class className*/

abstract class paymentProcessor
{
    //here only the method is defined. abstract method. which is visible to user
    //its logic will be inside a subClass
    abstract void makePayment(double amount);
    // This makePayment() method is not an independent method.
    // It is an implementation of the same method declared in the parent class.
}

class SBI extends paymentProcessor
{
    // --> This is where the real logic is defined.
    // --> User doesn't know this logic while interacting with PaymentProcessor.
    
    void makePayment(double amount)
    {
        System.out.println(amount + " paid using SBI ");
    }
}

public class c14_abstraction {
    public static void main(String[] args)
    {
        paymentProcessor obj = new SBI();
            obj.makePayment(5000);
    }
}



