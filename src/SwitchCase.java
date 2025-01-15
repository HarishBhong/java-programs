/******************************************************************************

 switch case statement

 *******************************************************************************/
import java.util.Scanner;
public class SwitchCase
{
    public static void main(String[] args) {

        Scanner var = new Scanner(System.in);

        int day = var.nextInt();

        switch(day)
        {
            case 1:
                System.out.println("Monday");

            case 2:
                System.out.println("Tuesday");

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");

                break;

            case 5:
                System.out.println("Friday");

            default :
                System.out.println("saturday");
        }

    }
}
