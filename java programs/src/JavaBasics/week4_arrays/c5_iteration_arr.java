package JavaBasics.week4_arrays;

// check if given element is present in array
import java.util.Scanner;
public class c5_iteration_arr {

    public static boolean isElementPresent(int[] arr, int target)
    {
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
              System.out.println(target +" is present at index "+ i);

              return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter n :");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter target element :");
        int target = in.nextInt();

        System.out.println("enter elements of array :");
        for(int i=0; i<n; i++)
        {
            arr[i] = in.nextInt(); //this will take n number of inputs for storing in array
        }

        System.out.println("your array is : ");
        for(int i =0; i<n ; i++)
        {
            System.out.print(arr[i]+" "); //this will print all elements from index 1 to n from arr[]
        }

        System.out.println();
        System.out.println();

        //isElementPresent(arr, t);


        if(isElementPresent(arr,target) == true){
            System.out.println();
        }
        else{ System.out.println(target + " is not found in array");}
    }

}
