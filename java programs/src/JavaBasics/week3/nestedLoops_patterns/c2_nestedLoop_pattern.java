package JavaBasics.week3.nestedLoops_patterns;

public class c2_nestedLoop_pattern {
    public static void main(String[] args) {


        int n = 5;

        for (int i = 1; i <= n-2; i++) {        //outerLoop --> row (determines rows)
            for (int j = 1; j <= n; j++) {   //innerLoop --> determines column/line
                System.out.print("* ");
            }
            System.out.println(" ");// to change the row/ go to next line after each completion of inner loop
        }
    }
}
