package DSAweek1;

import java.util.*;
//List is imported from util class
//ArrayLit is also imported from util class, ArrayList package

public class c1_DArrays {
        public static void main(String[] args) {

            //ArrayList<Integer> arr = new ArrayList<>();
            // OR
            //List<Integer> arr = new ArrayList<>();

             List<Integer> arr = new ArrayList<>();
             //NOTE: List is instance. ArrayList is just a class that implements List
            // here we are saying create object for ArrayList<>() --> store it in 'List' type pf Variable


            arr.add(1); //[1]
            arr.add(2); //[1,2]
            arr.add(5); //[1,2,5]

            System.out.println(arr.size());

            int n = arr.size();

            //arr(i); --> this is not the syntax for accessing Arraylist
            //arr.get(i);  --> this is the syntax for accessing elements in ArrayList

            for(int i = 0; i < n; i++) {
                System.out.print(arr.get(i) + " ");
            }

            System.out.println();
            //for deleting element in ArrayList--> arr.remove(index);

            arr.remove(1); //remove element at index 1

            // 2 will be removed --> [1,5]
            for (int j = 0; j < arr.size(); j++) {
                System.out.print(arr.get(j) + " ");
            }

            System.out.println();
            arr.add(6);
            arr.add(7);
            arr.add(9);

            for (int k = 0; k < arr.size(); k++) {
                System.out.print(arr.get(k) + " ");
            }

            System.out.println();
            arr.remove(arr.size()-1); // removes last element(arr.size() -1) is index of last element
            for (int k = 0; k < arr.size(); k++) {
                System.out.print(arr.get(k) + " ");
            }

            System.out.println();
            System.out.println(arr.get(arr.size()-1)); //--> access last element using get(LastIndex) & print it

        }
}
