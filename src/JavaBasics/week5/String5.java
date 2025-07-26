package JavaBasics.week5;

/*
I/p: I love programming. I love Codeforwin.
Input character to search: o

o/p : 'o' found at index 3,9,23,28,32

 */
public class String5 {
    public static void main(String[] args) {
String s = "I love programming. I love Codeforwin.";

System.out.println(s.indexOf('o'));
// this gives only 1st occurence of o. and ends
// therefore we need to traverse through all the string
        //using for loop
        System.out.println("using foor loop:");
        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i)== 'o')
            {
                System.out.print(i + " ");
            }
        }

        //using while loop
        System.out.println("using while loop:");
        int i = 0;
        while(i<s.length()-1)
        {
            if(s.charAt(i) == 'o')
            {
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
