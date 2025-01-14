
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        System.out.println("enter sub 1 marks:");
        int a = var.nextInt();
        System.out.println("enter sub 2 marks:");
        int b = var.nextInt();
        System.out.println("enter sub 3 marks:");
        int c = var.nextInt();
        System.out.println("enter sub 4 marks:");
        int d = var.nextInt();
        System.out.println("enter sub 5 marks:");
        int e = var.nextInt();

        System.out.println("marks entered are:");
        System.out.print(a +"," );
        System.out.print(b +"," );
        System.out.print(c +"," );
        System.out.print(d +"," );
        System.out.println(e +"." );

        int t = a+b+c+d+e;
        double avg = t/5;
        float p = (t / 500)*100;

        System.out.println("total = "+ t);
        System.out.println("average = "+avg);
        System.out.println("percentage = "+p);

    }
}
