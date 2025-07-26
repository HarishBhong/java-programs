package OOP;
/*

static fields --> are shared between the objects. value of this static field will be same for all the objects.
              --> all the objects will have same value of that field
              --> if there are 2 objects of same class, & if value is declared in one object for that static field then,
                  same value will be assigned for that static field in second object
                  & if updated in one object then automatically value gets updated in other object
         NOTE--> static field. (ie static method / static variable) - can be ""accessed without object also"".
                 syntax : "obj.fieldName" OR "className.fieldName" any syntax can be used

nonstatic (Default) --> if not mentioned static, its default nonStatic field
                  --> field not shared with other objects
                  --> field can be accessed only using the object. and particularly only using that object
                  --> field cannot be accessed using just className. ie: object is must- to access nonStatic field
 */

class Static
{
    int rollno;
    static int age; //static variable, will always need obj to be accessed

    static void printage()// static method, can be accesses with OR even without object
    {
        System.out.println(age);
    }
}
public class c4_stastic_nonStatic_field {
    public static void main(String[] args) {

        Static obj1 = new Static(); //obj1 is object of class Static

        obj1.rollno = 1;
        obj1.age = 10;

        System.out.println("obj1:");
        System.out.println("roll no:"+ obj1.rollno);
        System.out.println("age: "+ obj1.age);

        Static obj2 = new Static();

        obj2.rollno = 2;   //rollno is nonStatic var
        obj2.age = 20;  //this static field age is not declared for obj2, but will automatically get 10 value assigned

        System.out.println("obj2:");
        System.out.println("roll no: "+obj2.rollno);
        System.out.println("age: "+obj2.age);

        System.out.println("recheck which values are updates for obj1:");
        System.out.println("roll no: "+obj1.rollno +" nonStatic value not changed" );
        System.out.println("age: "+obj1.age + " static value of obj1.age changed according to latest objects updated value ie. obj2.age = 20");


        obj1.age = 30; //updated value of age for obj1. it will be applied to all the objects created from that object

        System.out.println("obj2.age = "+ obj2.age );// printing value for obj2
        System.out.println("obj1.age = "+ obj1.age );// printing value for obj1

        System.out.println("call for static variable without using object:");
        System.out.println(Static.age); // accessed without object. using className 'Static'
        Static.printage();   //access static method using className. without object

        Static.age = 40;     //accessing static variable using className. And not using the object

        System.out.println("obj1.age = "+ obj1.age);
        System.out.println("obj2.age = "+ obj2.age);
        System.out.println(" static variable age = "+ Static.age);


    }
}


/*
static methods can be called only by other Static method. Static method cannot be called directly by another static method
Java needs object for accessing non static method
 */