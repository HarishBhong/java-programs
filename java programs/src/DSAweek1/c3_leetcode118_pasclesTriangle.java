package DSAweek1;

import java.util.*;

/*
leet code: 118 --> Pascals Triangle
Given an integer 'numRows', return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
                    1
                  1   1
                1   2   1
              1   3   3   1
            1   4   6   4   1

Example 1:
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

Example 2:
Input: numRows = 1
Output: [[1]]
 */

public class c3_leetcode118_pasclesTriangle {
    public static List<List<Integer>> generate(int numRows) //this method is of type: List<List<>> ie.--> it will return 2D ArrayList
    {
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();

        //print 1st row ie: [[1]]
        ArrayList<Integer> rowOne = new ArrayList<>();
        rowOne.add(1);
        answer.add(new ArrayList<>(rowOne));

        //ArrayList<Integer> rowTwo = new ArrayList<>();
        int middleElements = 0;

        for(int i =1; i < numRows; i++ )
        {
            ArrayList<Integer> currentRow = new ArrayList<>(); //This line creates a new ArrayList object in memory each time the loop runs.
                                                               // Even though the variable name is reused (currentRow),
                                                               // it's just a reference — once you add this list to answer, it’s safely stored and not affected by the next iteration.


            //1st element is always 1
            currentRow.add(1);

            //middle elements
            for(int j= 1; j <= middleElements; j++)
            {
                int element = answer.get(i-1).get(j) + answer.get(i-1).get(j-1);
                currentRow.add(element);

            }
            //last element is always 1
            currentRow.add(1);
            middleElements++;
            answer.add(currentRow);
        }
        return new ArrayList<>(answer);
    }

 public static void main(String[] args)
    {
    System.out.println(generate(4));
//        Since generate(4) returns a List<List<Integer>>,
//        System.out.println uses the toString() method of the list to print it in readable form. this happens by-default
    }
}
