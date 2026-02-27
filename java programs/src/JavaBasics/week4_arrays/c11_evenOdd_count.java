package JavaBasics.week4_arrays;

// count number of even and odd integers from the array

import java.util.Scanner;
public class c11_evenOdd_count {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size:");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("enter "+ n +" values: ");
        int i = 0;
        while( i<n){
            arr[i] = in.nextInt();
            i++;
        }

        int odd = 0;
        int even = 0;

        for( i=0; i<n ; i++)
        {
            if(arr[i] % 2 == 0){

                even++;
            }

            if(arr[i] % 2 != 0){
                odd++;
            }
        }

        System.out.println("odd's = "+odd);
        System.out.println("even's = "+even);

        System.out.println("odds are ;");
        if(odd>0)
        {
            for(i = 0; i<n; i++){
                if(arr[i] % 2 != 0)
                {
                   System.out.println(arr[i]);
                }
            }
        }

        System.out.println("evens are :");
        if(even>0)
        {
            for(i = 0; i<n; i++){
                if(arr[i] % 2 == 0)
                {
                   System.out.println(arr[i]);
                }
            }
        }
    }
}
