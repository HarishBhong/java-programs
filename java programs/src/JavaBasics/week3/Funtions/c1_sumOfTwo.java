package JavaBasics.week3.Funtions;
//demonstrate how functions work

public class c1_sumOfTwo {

    public static int sum(int x, int y)
    {
        return x + y;
        //System.out.println("hello");
    }

    public static double sum(double v, double w)
    {
        return v + w;
    }
    public static double sum(double x, double y, double z)
    {
        double ans = x + y + z;
        return ans;
    }

    public static void main(String[] args) {

        System.out.println(sum(6,5));
        System.out.println(sum(6.1,6.4));

        int a = 4, b = 5,c =4;
        System.out.println(sum(b,a));

        System.out.println(sum(2,2,2.5));

    }
}
