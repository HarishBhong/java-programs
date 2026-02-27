package OOP;
/*
Default Cnstr
1)
When you don’t define any constructor in your class, the Java compiler itself adds a default constructor during compilation.

2)
 Important Rule:
🔸 Java provides the default constructor only if **you don’t write **any constructor at all.
🔸 If you write even one constructor (like a parameterized one), Java says:
“Oh, you know what you’re doing — I won’t interfere.”
And then you must manually add the default constructor if you still want it.

3)
Why does Java do this?
To make sure you can always create an object of a class even if no constructor is written.
It’s part of Java’s Object-Oriented design — every object should be creatable by default.

4)
Step 1: You write this code:

    class Car {
        int speed;
    }

You didn’t define any constructor here, right?

// java will add
Step 2: Java Compiler secretly adds this:
    class Car {
    int speed;

    // Default constructor added by Java:
    Car() {
        super(); // Calls the constructor of Object class
    }
}
*/
//NOTE: super() is a special keyword in Java used to call the constructor of the superclass (i.e., the parent class).

// Class definition
class Car {

    int speed;      // Instance variable
    String color;   // Instance variable--> variable defined inside class, but outside any method within class. it belongs to every object created from class

    // 🚫 No constructor defined by us

    /*
     Behind the scenes, Java adds this during compilation:

     Car() {
         super(); // Calls constructor of Object class
     }
    */
}


public class c6_types_of_cnstr {


    public static void main(String[] args) {

        // ✅ Creating object of Car class
        // Java uses the default constructor it added behind the scenes
        Car c1 = new Car();

        // 🚘 Accessing and printing default values
        System.out.println("Speed: " + c1.speed);   // Output: 0 (default for int)
        System.out.println("Color: " + c1.color);   // Output: null (default for String)
    }

}


 
