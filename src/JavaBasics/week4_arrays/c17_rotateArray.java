package JavaBasics.week4_arrays;
/* rotate an array from left to right. ie move each element to the left by 1 index.
    first element becomes last element. last becomes (n-1)th ...and so on

    eg: 1 2 3 4 5     --> rotate by k = 1(rotate once) :--> 2 3 4 5 1

       11 22 33 44 55 --> rotate by k = 2(rotate twice):--> 33 44 55 11 22

 */

import java.util.Scanner;

// this type of que needs updation in size of array. .'. needs copy artrtay
public class c17_rotateArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[]{1, 2, 3, 4, 5};

        int n = arr.length;
        System.out.println("enter number of times to rotate array:");
        int k = in.nextInt();

        int[] rotated = new int[n];

            k = k % n; //after n rotations array becomes as original array
                       // similarly (n+1 th) rotation == (1 st) rotation as 1 th
                        // OR n+3 th rotation == 3 rd rotation

        for(int i =0; i<n ; i++)
        {
            int newIndex = (i - k);
            if(newIndex < 0)
            {
                newIndex = newIndex + n;
            }
            rotated[newIndex] = arr[i];
        }

        for(int i =0; i<n ; i++){
            System.out.print(rotated[i] + " ");
        }
    }
}
