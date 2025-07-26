package DSAweek1;

/*

The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:
string convert(string s, int numRows);

Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"

Example 2:
Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I

Example 3:
Input: s = "A", numRows = 1
Output: "A"

 */

import java.util.ArrayList;

public class C4_leetcode6_zigzagConversion {

    public static String convert(String s, int numRows){

        if(numRows == 1)
        {
            return s;
        }

        ArrayList<ArrayList<Character>> arr = new ArrayList<>(); //2d arrayList

        for(int i=0; i<numRows;i++)
        {
            ArrayList<Character> currentRow = new ArrayList<>();   //creating empty arrayList rows
            arr.add(new ArrayList<>(currentRow));                  // append above rows into arr arrayList
        }

        int rowIndex = 0;
        int turn = 0;
        for(int i=0; i<s.length(); i++)
        {
            arr.get(rowIndex).add(s.charAt(i));
            if(turn == 0)
            {
                rowIndex++;

                if(rowIndex == numRows)
                {
                    rowIndex = rowIndex -2;
                    turn = 1;
                }
            }
            else   //when turn = 1
            {
                rowIndex--;
                if(rowIndex == -1)
                {
                    rowIndex = rowIndex + 2;
                    turn = 0;
                }

            }
        }

        StringBuilder answer = new StringBuilder("");
        for(int i=0; i<arr.size(); i++)
        {
            for(int j=0; j<arr.get(i).size(); j++)
            {
                answer.append(arr.get(i).get(j));
            }
        }
        return answer.toString();
    }

    public static void main(String[] args)
    {
        System.out.println(convert("PAYPALISHIRING",3));
    }
}


