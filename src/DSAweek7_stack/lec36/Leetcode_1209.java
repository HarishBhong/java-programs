package DSAweek7_stack.lec36;

//class Solution {
//    //logic is storing frequency of each character in stack
//
//    public String removeDuplicates(String s, int k) {
//
//        Stack<ArrayList<Integer>> st = new Stack<>();
//
//        for(int i = 0; i < s.length(); i++)
//        {
//            if(st.isEmpty())
//            {
//                ArrayList<Integer> curElement = new ArrayList<>();
//                curElement.add((int)(s.charAt(i))); //we are converting characterAt(i) to integer and storing it in ArrayList
//                curElement.add(1);
//                st.push(new ArrayList<>(curElement));
//            }
//            else
//            {
//                if(st.peek().get(0) == (int)(s.charAt(i))) //this is checking the ascii value
//                {
//                    ArrayList<Integer> topElement = st.pop(); //here topElement is stored in this arraylist
//                    int fre = topElement.get(1);
//
//                    topElement.set(1, (fre + 1));
//                    st.push(new ArrayList<>(topElement));
//                }
//                else
//                {
//                    ArrayList<Integer> curElement = new ArrayList<>();
//                    curElement.add((int)(s.charAt(i))); //we are converting characterAt(i) to integer and storing it in ArrayList
//                    curElement.add(1);
//                    st.push(new ArrayList<>(curElement));
//                }
//            }
//            if(st.peek().get(1) == k ) // st.peek().get(1) -> gives freq of top ele
//            {
//                st.pop();
//            }
//        }
//        StringBuilder str = new StringBuilder();
//
//        while(!st.isEmpty())
//        {
//            ArrayList<Integer> topElement = st.pop();
//            int ascii_value = topElement.get(0);
//            int fre = topElement.get(1) ;
//
//            while(fre > 0)
//            {
//                str.append((char)(ascii_value));
//                fre--;
//            }
//        }
//        str.reverse();
//        return str.toString();
//    }
//}


public class Leetcode_1209 {
}
