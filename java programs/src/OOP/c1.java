package OOP;


class Student{ // class name start in capital by convention
    int marks;
    String name;
}
public class c1 {
    public static void main(String[] args)
    {
        Student obj = new Student();
        // object is created for class 'student'
        // this object is stored or assigned to variable named 'obj'
        // So we can say --> "obj is an object of class student"

        obj.marks = 10;
        //accessed (marks)member_field of the student class. using the ( . ) operator
        obj.name = "Harish";

        System.out.println(obj.marks);
        System.out.println(obj.name);
    }
}
