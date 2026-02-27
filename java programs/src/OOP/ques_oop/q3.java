package OOP.ques_oop;
/*
program for a musician to play instruments. Musician can play diff instruments for diff sound

1) define Instrument class.include makeSound() method, with "this instrument make beautiful sound"
2) define subclass of musical instruments:Erhu, Piano, Violin. Sound of Erhu "Erhu is good to hear".
                                                               Sound of Piano "Piano is pleasant to ear".
                                                               Sound of Violin " Violin is Shocking"
3) Instantiate the subclass of musical instrument, and switch different musical instruments in a polymorphic way

--> polymorphic way means, we are suppose to name all methods with same name
--> polymorphism in inheritance leads to method overriding


 */
class Instrument
{
    void makeSound()
    {
        System.out.println("this instrument makes beautiful sound");
    }
}
class Erhu extends Instrument
{
    void makeSound()
    {
        System.out.println("Erhu is good to hear");
    }
}

class Piano extends Instrument
{
    void makeSound()
    {
        System.out.println("Piano is pleasant to ear");
    }
}

class Violin extends Instrument
{
    void makeSound()
    {
        System.out.println("Violin is Shocking");
    }
}

class tabla extends Instrument
{

}

public class q3 {
    public static void main(String[] args)
    {
        Erhu obj1 = new Erhu();
        Piano obj2 = new Piano();
        Violin obj3 = new Violin();
        tabla obj4 = new tabla();

        obj1.makeSound();
        obj2.makeSound();
        obj3.makeSound();
        obj4.makeSound(); //here for tabla subClass, there is no method in it. So SuperClass method gets called
    }

}

//Prototype: means declaration syntax part; eg. void makeSound(); --> this is prototype of this method
//                                          eg. class Piano extends Instrument{} --> this is prototype of Piano class
//                                          eg. int sum(int a, int b) --> this is prototype of this method called sum