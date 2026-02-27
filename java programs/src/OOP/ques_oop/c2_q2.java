package OOP.ques_oop;
/*
oop concepts used--> class and object basics
1)make a class vehicle with 4 properties: speed, volume, acceleration, time
2)define methods: move() :o/p initial speed, acceleration, volume
              : setSpeed(int speed): can set initial speed of vehicle and print
              : speedUp(): update speed and prints: speed+acceleration*time
              : speedDown: update speed and prints: speed-acceleration*time
       Note: if speed<0 then print: speed==0

3)Initiate a vehicle object, initialize the value of speed and volume by using methods and call the methods to print o/p
  call speedUp() and speedDown() to change the speed
 */

class vehicle
{
    //class properties
    int speed;
    int volume;
    int acceleration;
    int time;

    //constructor for setting up values of the attributes
    vehicle(int s, int v, int a, int t)
    {
        speed = s;
        volume = v;
        acceleration = a;
        time = t;
        System.out.println();
    }

    //2) functionalities
    void move()
    {
        System.out.println("speed = "+speed);
        System.out.println("volume = "+volume);
        System.out.println("acceleration = "+acceleration);
        System.out.println("time = "+time);
    }

    //tom set initial speed
    void setSpeed(int initialSpeed)
    {
        speed = initialSpeed;
        System.out.println("speed set to: "+initialSpeed);
    }

    void speedUp()
    {
        speed = (speed + acceleration * time);
    }

    void speedDown()
    {
        speed = (speed - acceleration * time);
        if(speed<0)
        {
            speed =0;
        }
    }
}
public class c2_q2 {
    public static void main(String[] args)
    {
        vehicle obj = new vehicle(2,2,2,2);
        obj.move();

        obj.setSpeed(10);

        obj.move();

        System.out.println("speedUp callled:");
        obj.speedUp();
        obj.move();

        System.out.println("speedDown called:");
        obj.speedDown();
        obj.move();

    }
}
