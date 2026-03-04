package JavaBasics.week1.whileLoop;

public class leetcode9_palindromeNumber {
}

/*
//brute force approach : reverse the number and compare with original
//main Logic: reverse the number using %
class Solution {
    public boolean isPalindrome(int x) {

        if( x < 0)
        {
            return false; //negative number is never palindrome
        }

        int original = x;
        int reversed = 0;

        while(x > 0)
        {
            int lastDigit = x % 10; // get last digit of number
            reversed = reversed *  10 + lastDigit; // add that last digit to form reverse of x

            x = x / 10; //remove that last digit;
        }

        return original == reversed;
    }
}
 */