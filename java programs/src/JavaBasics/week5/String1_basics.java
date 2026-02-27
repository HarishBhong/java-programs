package JavaBasics.week5;

import java.util.Scanner;
public class String1_basics {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        String s1 = "Hello, Java!";
        String s2 = "Hello @World";

        System.out.println(s1);
        System.out.println(s2);


        System.out.println("length of s1: "+s1.length());
        System.out.println("length of s2: "+s2.length());

        System.out.println("index of 'v' in s1: "+s1.indexOf("v"));
        System.out.println("index of 'space' in s1: "+s1.indexOf(" "));

        //compareTo() gives diff of sum of ASCII values
        System.out.println("compare s1 with s2: "+s1.compareTo(s2)); // 12
        System.out.println("compare s2 with s1: "+s2.compareTo(s1));// -12

        System.out.println("substring from 2: "+s1.substring(2)); //include index 2 and further

        System.out.println("substring from 2 to 6 :"+s1.substring(2,7)); // include index 2 and exclude index 7

        System.out.println("check if s1 contain 'Java':"+s1.contains("Java"));

        String s3  = "12345";
        System.out.println("s3: "+s3);
        int a = Integer.parseInt(s3); //convert char string into integer
        System.out.println("converted to integer is: "+a);

        int b = 574;
        String strb = Integer.toString(b);
        System.out.println("converted to String is: "+strb);

        System.out.println("s1 + s2 gives: "+s1.concat(s2));
        System.out.println("now s1: "+s1);

        s1 = s2 + " !";
        System.out.println("(s1 = s2 + !) gives: " + s1 + "  -->ie new string s1 is formed.");
    }
}
