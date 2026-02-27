package OOP.ques_oop;

/*
You have a class Square, that inherits from a predefined class Rectangle,
complete the Square constructor and print the perimeter and area of the square using methods perimeter() and area() in the Rectangle class
 */

class Rectangle{

    int l,b;                         // These are instance variables (belong to the object)

    Rectangle(int l, int b) //here when object will be created for this constructor, new l, b variables get assigned: l = 0; b=0
    {
        // parameter l, b are different and instance variables l,b which are defined above, in the class are different
        
        this.l = l;
        this.b = b;
    }
    double area()
    {
        return l*b;
    }
    double perimeter(){
        return 2*(l+b);
    }
}

class Square extends Rectangle{
    int s;
    Square(int s){
    super(s,s);
        System.out.println("Area ="+area());           //inside constructor of Square Subclass, we are accessing the derived methods from Superclass
        System.out.println("Perimeter ="+perimeter());
    }


}
public class q6_inheritance {
    public static void main(String[] args){

    Rectangle obj = new Square(5);
    }
}


// if the parameterName and instance variableName is same;
// then variableName is used to access the parameterVariable --> parameterVariable belongs only to that method
// this.variableName is used to access the instance variable --> instanceVariable belongs to whole class. ie to the object of that class

