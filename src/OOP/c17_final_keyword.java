package OOP;
/*
final keyword is used for variable, method, class

1. final variable --> A final variable cannot be reassigned once initialized.
2. final method   --> A final method cannot be overridden by subclasses.
3. final class    --> A final class cannot be inherited.


 */

// Final variable example
class Constants {
    final int SPEED_LIMIT = 60; // final variable

    void showLimit() {
        System.out.println("Speed Limit is: " + SPEED_LIMIT);
        // SPEED_LIMIT = 100; // ❌ Error: Cannot assign a value to final variable
    }
}

// Final method example
class Vehicle {
    final void engineType() {
        System.out.println("Engine: Petrol");
    }
}

class Carss extends Vehicle {
    // Trying to override final method will cause an error
    // void engineType()
    // {  // ❌ Error: Cannot override final method
    //     System.out.println("Engine: Diesel");
    // }

    void carType() {
        System.out.println("Car Type: Sedan");
    }
}

// Final class example
final class Rocket {
    void launch() {
        System.out.println("Rocket launching...");
    }
}
//final class--> cannot be extended ie. its subclass does not exist
// This would cause a compilation error
// class SpaceX extends Rocket { } // ❌ Error: Cannot inherit from final class


public class c17_final_keyword {
    public static void main(String[] args)
    {
        //final variable
        final int x = 10;
      //  x = 20;  // ❌ Error: cannot assign a value to final variable 'x'

        Constants obj1 = new Constants();
        obj1.showLimit();

        // Final method
        Carss myCar = new Carss();
        myCar.engineType();  // Uses final method from parent
        myCar.carType();

        // Final class
        Rocket falcon9 = new Rocket();
        falcon9.launch();
    }
}
