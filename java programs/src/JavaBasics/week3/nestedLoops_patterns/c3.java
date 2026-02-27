package JavaBasics.week3.nestedLoops_patterns;

public class c3 {

/*

print this output:
* * * * *
* * * * *
* * * * *


*/

    //here its 3 rows, 5 columns
    public static void main(String[] args) {


        for (int i = 1; i <= 3; i++) {        //outerLoop --> row (determines rows)
            for (int j = 1; j <= 5; j++) {   //innerLoop --> determines column/line
                System.out.print("* ");
            }
            System.out.println(" ");// to change the row/ go to next line after each completion of inner loop
        }
    }
}
