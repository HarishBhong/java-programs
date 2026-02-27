package OOP;
// Parameterised and Non parameterised constructors

class students{
    int id = 5;
    String name;

    public students() // non-parameterised constructor
    {
        int id = 10;
        System.out.println("parameterised constructor");
        System.out.println(id);
    }

    public students(int id, String name)
    {

        System.out.println("non pararmeterised constructor");
        System.out.println(name);
        System.out.println(id);
    }

}

public class c7_parameterised_constr {

    public static void main(String[] args)
    {
        new students();
        new students(5,"Harish");
    }
}

/*
--> Once user defines a constructor java will not define its own default constructor
--> Parameterised constructor when called, all the parameters must be assigned some value while calling. Otherwise it will through error
--> 'this' keyword is used to tell java that we are referring to this parameter that is given in the constructor
           if the instance variable(global for all objects) and parameter variable is same, that time 'this' keyword is used for parameterised constructor variable.
 */