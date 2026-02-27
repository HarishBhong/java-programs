package JavaBasics.week4_arrays;
//Find MEDIAN of sorted array (sorted in increasing / decreasing order
import java.util.Scanner;
public class c15_median_Ofarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size:");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("enter "+ n +" values: ");

        for(int i = 0; i<n; i++ ){
            arr[i] = in.nextInt();
        }

        //n = odds
        if(n % 2 != 0){
            System.out.println(arr[n/2]);
        }
        else{

            double median = (double) (arr[n/2] + arr[(n/2)-1] / 2.0  );
            //typecasting into double for handling decimal numbers
            System.out.println(median);

        }
    }
}

/*

for sorted array median:
for n = odd --> M = arr[n/2]

for n = even --> M = ( arr[n/2] + arr[(n/2)-1] ) / 2

 */