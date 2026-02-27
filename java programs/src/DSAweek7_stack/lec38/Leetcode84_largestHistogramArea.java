package DSAweek7_stack.lec38;

public class Leetcode84_largestHistogramArea {
}
// very hard but made easy with modular code

/* approach:

we need area = height * width

we have given height of each tower. Note the largest area for any rectangle is -> max possible height and width. So our goal is to find max height and maz width
height of tower is used
based on height, find the smaller height on left and right side of that tower
imagine on eg: 1:
for rectangle fifth tower with height 2 : on RHS- 3 is > 2 then we have zero ie. 0 < 2 stop
                                        : on LHS- 6 is > 2 then, 5 > 2 , then 1 < 2  stop

means for fifth (2) tower we can draw for height 2 - from third(5) tower to sixth tower(3)
thus area = width (4 towers each 1 unit)) * height(2)

ie we have to find height and width for each tower that it can extend
ie. find smallest number on left and smallest number on right

thus use stack


*/
//class Solution {
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
//}

