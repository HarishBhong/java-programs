package OOP;
/*
access specifier safety : private > default > protected > public

private --> only within same class. NOT outside class
default --> same class + within same package. BUT not outside package
protected --> within same package + IF subclass in other package. BUT not everywhere in other package(only in subclass in that package)
public --> in package + everyWhere Outside Package

 */
class Cars {
    private String color;
    //we have made this member private to this class 'Cars'
    // private member is accessed only within the class

    int wheels;
    //if access specifer not mentioned java treats it as "Default Accsess Specifer"
    // default access specifier --> field is accessible "within the package anywhere" . NOT outside package

    protected int speed;
    // protected access specifier --> can be accessed "anywhere in same package + subClass if in other package" can also access

    public int avgPerLtr;
    // public access specifier means--> least safety.
    // any class even from outside package can access the public field

}

public class c2_AccesSpecifier {

    public static void main(String[] args) {
    Cars obj = new Cars();

    obj.wheels = 2; // its not private member, so can be accessed here,
    System.out.println(obj.wheels);

    //obj.color = "red";
//this throws error :--> 'color has private access in OOP.Cars'
        //ie. color is private member of Cars class inside the OOP package. so it cannot be acccessed here outside that class
    }
}

