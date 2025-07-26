package JavaBasics.week3.Funtions;
//calling function inside another function

public class c3_calling_fun_Inside_fun {

    public static void f1()
    {
        f3();
        System.out.println("1");
    }
    public static void f2()
    {
        f1();
        System.out.println("2");
    }
    public static void f3()
    {
        System.out.println("3");
    }

    public static void main(String[] args) {
        f2();
        System.out.println("main");
    }
}
//flow --> main --> f2() --> f1() --> f3() => print"3" (f3 ends) --> backTo f1() => print"1" (f1 ends) --> backTo f2() => print"2" (f2 ends) --> backTO main() --> print"main" (main ends) =>Code ends
//
//