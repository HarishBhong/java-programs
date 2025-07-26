package DSAweek1;
/*
ArrayList of ArrayList--> Nested Dynamic array
                      --> to create a 2D dynamic array
                      --> where each element itself is an ArrayList
 list = [ [1,2,3] , [4,5,6] , [10,11,12] ]
 it can be imagined like a 2D matrix :      | [ 1 2  3 ] |
                                            | [ 4 6]     |
                                            | [10 11 12] |

                                      : there are two ArrayLists-- inner and outer
                                      : element of Outer ArrayList is itself a Arraylist
                                      : inner Arraylist may have integers as its elements

  here number of columns may or mayNot be same for each row
 */

import java.util.ArrayList;

public class c2_ArrayLint_of_ArrayList {
    public static void main(String[] args)
    {
        ArrayList<ArrayList<Integer>> DynamicList = new ArrayList<>(); //declare an Arraylist inside Arraylist; 2D matrix

        /*
          list.add(new ArrayList<>({1,2,3},{10,11,12}) --> this is not supported in Java
         */
        ArrayList<Integer> row = new ArrayList<>();// row--> defined a ArrayList for inner Arraylist as element

        row.add(1);  //row = [1]
        row.add(2);  //row = [1,2]
        row.add(3);  //row = [1,2,3]
        //added elements in 'row' -inner ArrayList

        DynamicList.add(new ArrayList<>(row));
        //added 'row' ArrayList to 'DynamicList' Outer_ArrayList as its element
        //add that one Arraylist to the outer Arraylist as its element
        //NOTE: **** here new keyword is compulsory ****

        //row  = [1,2,3]
        //DynamicList = [ [1,2,3] ]

        ArrayList<Integer> secRow = new ArrayList<>();
        secRow.add(6);
        secRow.add(4);
        secRow.add(5);

        DynamicList.add(new ArrayList<>(secRow)); //second row of outer ArrayList

        for(int i=0; i<DynamicList.size(); i++) //size of list =2
        {
            for(int j=0; j< DynamicList.get(i).size(); j++) //size of i`th element of 2D DynamicList
            {
                System.out.print(DynamicList.get(i).get(j)+ " " );
            }
            System.out.println();
        }

    }
}
