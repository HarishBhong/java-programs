package JavaBasics.week3.nestedLoops_patterns;
/*

print this output:
*****
 *****
  *****
   *****
    *****

 */
public class c4_Rhombus_pattern {

    public static void main(String[] args) {

        int n = 5;
        int space = 0;

        for (int i = 1; i <= n; i++) {        //outerLoop --> row (determines rows)

            for(int j = 1; j <= space; j++)
            {
                System.out.print(" ");
            }
            space = space + 1;


            for (int j = 1; j <= n; j++) {   //innerLoop --> determines column/line
                System.out.print("*");
            }

            System.out.println(" ");// to change the row/ go to next line after each completion of inner loop
        }
    }
}
