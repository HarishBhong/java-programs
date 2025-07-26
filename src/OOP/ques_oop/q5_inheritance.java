package OOP.ques_oop;

/*

1.create a school member of class 'SchoolMember' with name and number of members
2.create a teacher class 'Teacher' that inherits the school member class and has salary property
3.create a student class 'Student' that inherits the school member class and has grade property
4.when creating teacher and student objects, add 1 to the total number; if the object is reduced, subtract 1 from total number

HERE, we are expected to write program such that: SuperClass: SchoolMember; Subclass: Teacher & Student
                                                : whenever the object for subclass will be created, the 'number' attribute should get incremented
                                                : eg. if 5 Student objects and 1 Teacher object is created then, number attribute should be = 6
 */
class SchoolMember{
    //String name;
    static int number; // static so that it will be shared within all, Superclass and its Subclasses
                        //if we keep it nonStatic than, every subclass will get separate version of this variable. the value will not be shared
}

class Teacher extends SchoolMember{
    Teacher(){
        number++;
    }
}

class Student extends SchoolMember{
    Student(){
        number++;
    }

}

public class q5_inheritance {
    public static void main(String[] args)
    {
        Teacher obj1 = new Teacher();
        Student obj2 = new Student();
        Student obj3 = new Student();

        System.out.println(obj1.number);

        //as number is static variable
        System.out.println(obj2.number); //will give same output
    }
}
