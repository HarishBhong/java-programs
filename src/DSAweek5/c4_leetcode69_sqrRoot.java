package DSAweek5;
//find square root of given number
//using binary search method

/*
if we are asked to find sqr of 27
LOGIC: Brute Force method
       we check square from 1 and keep doing until we get as answer 25 or smaller than 27
       means 1*1 = 1 , 2*2 = 4, 3*3 = 9, 4*4 = 16, 5*5 = 25, 6*6 = 36,
       .'. integer part ans is '5'
       Time Complexity: O(n)

       -here we can use binary search approach
       take start=0, end = x, (to find sqr of x)
       keep taking mid - if (mid*mid) = x --> then its the sqr of x
                         if (mid*mid) < x --> then the ans must be in left half
                                          --> but for non-Whole-Sqr number ex:27 --> we have to keep checking for bigger number aswell
                                          --> ex above, we are asked: sqr(27) we checked and got closer number "5*5=25", but then also we have to check do we have again any number which is just less than 25,
                                          --> then we check next 6*6 = 36 and confirmed that further we cannot get any smaller number
                         if (mid*mid) > x --> then the ans must be in left half
                                          --> end = mid-1

 */
import java.util.*;
public class c4_leetcode69_sqrRoot {

    public static int sqr(int x)
    {
        long start = 0;
        long end = x;
        long ans = 0 ;

        while(start<=end)
        {
            System.out.println();
            long mid = (start+end)/2;
            System.out.println("mid = "+mid);

            if(mid*mid <= x)
            {
                System.out.println("check mid*mid ="+ mid*mid + " is < x");
                System.out.println("store it in ans="+ans);
                ans = mid;
                start = mid + 1;
            }
            else
            {
                System.out.println("check mid*mid "+mid*mid+"is > x");
                end = mid -1;
                System.out.println("so check in first half--> end=mid - 1 --> end = "+end);
            }
        }
        return (int) ans;
    }

    public static void main(String[] args)
    {
        System.out.println("enter number");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        System.out.println("square root is : "+sqr(x));

    }

}
