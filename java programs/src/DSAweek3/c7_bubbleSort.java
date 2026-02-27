package DSAweek3;

//sort given array using bubble sort algorithm

public class c7_bubbleSort {
    public static void main(String[] args){

        int[] arr = {2,1,5,4,3};
        int n = arr.length;

        //Bubble sort

        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-1; j++) { //Bcoz each iteartion from outerloop keeps largest element in the end
                if(arr[j] > arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " " );
        }


    }
}
