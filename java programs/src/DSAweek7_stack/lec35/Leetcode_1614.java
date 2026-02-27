package DSAweek7_stack.lec35;

class Solution1618 {
    public int maxDepth(String s) {

        int answer = 0;
        int count = 0;

        for(int i = 0; i < s.length() - 1; i++)
        {
            if(s.charAt(i) == '(')
            {
                count++;
            }
            else if( s.charAt(i) == ')')
            {
                count--;
            }

            if(count >= answer){
                answer = count;
            }
        }

        return answer;
    }
}

public class Leetcode_1614 {
}
