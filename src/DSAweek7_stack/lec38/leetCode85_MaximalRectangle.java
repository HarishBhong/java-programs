package DSAweek7_stack.lec38;

public class leetCode85_MaximalRectangle {
}
//
//class Solution {
//    //same logic as 84 number problem
//
//
//    public int[] nextSmallerLeft(int[] heights)
//    {
//        int n = heights.length;
//        int[] answer = new int[n];
//
//        for(int i = 0; i<n ; i++)
//        {
//            answer[i] = -1;
//        }
//        Stack<Integer> stack = new Stack<>();
//
//        for(int i = n-1;  i >=0 ; i--)
//        {
//            while(!stack.isEmpty() && heights[i] < heights[stack.peek()])
//            {
//                answer[stack.peek()] = i ;
//                stack.pop();
//            }
//            stack.push(i);
//        }
//        return answer;
//    }
//
//
//    public int[] nextSmallerRight(int[] heights)
//    {
//        int n = heights.length;
//        int[] answer = new int[n];
//
//        for(int i = 0; i<n ; i++)
//        {
//            answer[i] = n;
//        }
//        Stack<Integer> stack = new Stack<>();
//
//        for(int i = 0;  i<n ; i++)
//        {
//            while(!stack.isEmpty() && heights[i] < heights[stack.peek()])
//            {
//                answer[stack.peek() ] = i;
//                stack.pop();
//            }
//            stack.push(i);
//        }
//        return answer;
//    }
//
//    public int largestRectangleArea(int[] heights) {
//        int n = heights.length;
//
//        int left[] = nextSmallerLeft(heights);
//        int right[] = nextSmallerRight(heights);
//
//        int answer = 0;
//
//        for(int i = 0; i < n; i++)
//        {
//            int width = right[i] - left[i] - 1;
//            int area = width * heights[i];
//
//
//            answer = Math.max(answer, area);
//        }
//
//        return answer;
//    }
//
//    public int maximalRectangle(char[][] matrix) {
//
//        int n = matrix.length;
//        int m = matrix[0].length;
//
//        int arr[][] = new int[n][m];
//
//        //calculate row-wise --> how many conjucative 1s are present
//
//        for(int i =0; i < m; i++) //i => represents no of columns
//        {
//            int sum = 0;
//            for(int j = 0; j < n; j++) //j => represent no of rows
//            {
//                if(matrix[j][i] == '1')
//                {
//                    sum ++;
//                }
//                else{
//                    sum = 0;
//                }
//                arr[j][i] = sum;
//            }
//        }
//
//        int maxArea = 0;
//        for(int i = 0; i < n ;  i++)
//        {
//            int area = largestRectangleArea(arr[i]);
//            maxArea = Math.max(maxArea, area);
//        }
//        return maxArea;
//    }
//}