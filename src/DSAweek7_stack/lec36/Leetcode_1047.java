//package DSAweek7.lec36;
//import java.util.*;
//
//class Solution {
//    public String removeDuplicates(String s) {
//
//        int l = s.length();
//        Stack<Character> st = new Stack<>();
//
//        for(int i = 0; i< l; i++)
//        {
//
//            if(!st.isEmpty() && st.peek() == s.charAt(i))
//            {
//                st.pop();
//            }
//
//            else
//            {
//                st.push(s.charAt(i));
//            }
//        }
//
//        StringBuilder sb = new StringBuilder("");
//
//        while(!st.isEmpty())
//        {
//            sb.append(st.pop());
//        }
//
//        return sb.reverse().toString();
//    }
//}
//
//
//public class Leetcode_1047 {
//    public static void main(String[] args)
//    {
//
//
//    }
//}
