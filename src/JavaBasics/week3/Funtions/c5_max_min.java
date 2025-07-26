package JavaBasics.week3.Funtions;
//find max and min from given 2 no.
import java.util.Scanner;
public class c5_max_min {

    public static String maxmin(int a,int b)
    {
        if(a>b){
           return a+ " is maximum and "+ b +" is minimum" ;
        }
        else{
            return b+ " is maximum and "+ a +" is minimum" ;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter 2 numbers :");
        int a = in.nextInt();
        int b = in.nextInt();

       System.out.println(maxmin(a,b));
    }
}

