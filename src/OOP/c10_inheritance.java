package OOP;
/*
Inheritance:
It allows a class to inherit (public and protected) properties and methods from another class.

If Class A is a parent (superclass), and Class B is a child (subclass), then:
        --Class B gets all public and protected variables and methods of Class A.
        --Class B can also add its own variables/methods, or override the inherited ones.

Types of inheritance:
1. simple/single --> one child extends one parent

2. MultiLevel --> C extends from B, B  extends from A  : A-->B-->C
               --> C has properties of both B & A

3. Hierarchical --> A-->B & A-->C : B & C both extends A
                --> single parent multiple childClasses of it
                --> single superclass multiple subclasses of it

4. Multiple --> one child from two different Parents: C extends both A & B

       Note --> JAVA do not support Multiple inheritance in classes. coz it gives ambiguity
            --> we need concept of interfaces for achieving the Multiple inheritance

5. Hybrid -> mix
 */

//syntax : class ChildClass extends ParentClass

class carr
{
    int speedd = 10; //this is instance variable, it will get printed with default

    int speedd( int setSpeedd)
    {
        this.speedd = setSpeedd;
        System.out.println("car speed = "+this.speedd);
        return this.speedd;
    }
}
class bmw extends carr{
    void bmwPrints(){
        System.out.println("bmw ");
    }
}
public class c10_inheritance {
    public static void main(String[] args)
    {
        bmw obj = new bmw();         // --> obj is 'subClass object' we will try to access parent class using it
        System.out.println(obj.speedd);
        obj.speedd(5);
        System.out.println(obj.speedd);

        carr obj1 = new carr();
        //obj1.bmwPrints(); --> obj1 is object of parent class. Parent class cannot access child class, throws error

    }

}
