package OOP.ques_oop;
// Encapsulation (private)
/*

define Students class with 3 attributes Name (string), Age(int), MaximumMarks(array of size[3]). Define 3 methods get_name, get_age, get_maxMarks.
using the object of class access those methods and print:name, age, maximum marks
Note: keep the instance variables private for security reasons

 */

class Students{
    private String name; //private (access modifier) --> so now name attribute can be 'directly' accessed within class only. cannot be "directly" accessed outside class.
    private int age;
    private int[] marks = new int[3];

    Students(String Name, int Age, int[] Marks) {
        name = Name;
        age = Age;
        marks[0] = Marks[0];
        marks[1] = Marks[1];
        marks[2] = Marks[2];
    }
    public String get_name()
    {
        return name;
    }

    public int get_age()
    {
        return age;
    }

    public int get_MaxMarks()
    {
        int maxMarks = marks[0];
        if(marks[1]>=marks[0] && marks[1]>=marks[2])
        {
            maxMarks = marks[1];
        }
        else if( marks[2]>=marks[0] && marks[2]>=marks[1])
        {
            maxMarks = marks[2];
        }
        return maxMarks;
    }
}

public class c1_q1 {
    public static void main(String[] args)
    {
        int[] marks = new int[3];
        marks[0] = 2;
        marks[1] = 4;
        marks[2] = 6;

        Students obj = new Students("harri",20,marks);
        System.out.println(obj.get_name());
        System.out.println(obj.get_age());
        System.out.println(obj.get_MaxMarks());

       // System.out.println(obj.age=10);
                                        // --> this line is invalid. throws error. age has private access in class Students. cannot be accessed from here
    }
}
