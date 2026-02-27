package DSAweek7_stack.lec36;
//gfg problem

/*celebrity is person who strictly don't know anyone But everyone strictly know him. Find such celebrity from given data */
/*A celebrity is a person who is known to all but dees net linew anyone at a party. A party is being organized by some people.
A square matrix mat (n*n) is used to represent people at the party such that if an element of row i and column j is set to 1 it means i-th person know j-th person.
You need to return the index of the celebrity in the party, if the celebrity does not exist, return -1.

Note: Follow O-based indexing.

Examples:

Input: mat[][]=[[0 1 0], [0 0 0], [0 1 0]
Output: 1
Explanation: Oth and 2nd person both know 1. Therefore, 1 is the celebrity.

Input: mat[][] = [[0 1], [1 0]]
Output: -1
Explanation: The two people at the party both know each other. None of them is celebrity
        */
import java.util.*;

class SolutionCelebrity{
    public static int celebrity(int mat[][])
    {
        int n = mat.length;

        Stack<Integer> st =  new Stack<>();
        for(int i = 0; i<n ; i++)
        {
            st.push(i);
        }
        while(st.size() > 1)
        {
            int firstElement = st.pop();
            int secondElement = st.pop();

            if(mat[firstElement][secondElement] == 1 && mat[secondElement][firstElement] == 0)
            {
                st.push(secondElement);
            }
            else if (mat[secondElement][firstElement] == 1 && mat[firstElement][secondElement] == 0)
            {
                st.push(firstElement);
            }

        }
        if(st.isEmpty())
        {
            return -1;
        }
        else
        {
            int celebrity = st.peek();
                for(int i =0; i<n; i++)
                {
                    if(i != celebrity)
                    {
                        if(mat[celebrity][i] == 1 || mat[i][celebrity] == 0)
                        {
                            return -1;
                        }
                    }
                }
                return celebrity;
        }

    }
}
public class c2_celebrityPblm {
    public static void main(String[] args)
    {
        int[][] mat = {
                {0, 1, 0},
                {0, 0, 0},
                {0, 1, 0}
        };
        System.out.println(SolutionCelebrity.celebrity(mat));
    }
}
