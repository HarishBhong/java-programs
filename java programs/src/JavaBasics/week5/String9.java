package JavaBasics.week5;

/*
reverse the String with Respect To words: 'LastWord' becomes 'FirstWord'...
eg i/p: String s = i love my country India
   o/p: reversed wrt words: s' = India country my love i

logic: store each word of string in array & reverse that array
 eg: array = ['i','love','my','country','India']
    arraySize = number of words in string = no of spaces in string + 1
    eg: spaces = 4 , words = 5
 */
import java.util.Scanner;
public class String9 {


    public static void reverse(String words[])
    {
        int i = 0; //pointer at starting element
        int j = words.length - 1 ; //pointer at end element
        while(i < j)
        {
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;

            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("enter String: ");
        String s = in.nextLine();

            int l = s.length();

            // Step 1:
            int space = 0; // number of spaces in String
            for(int i = 0; i < l; i++)
            {
                if(s.charAt(i)== ' ') {
                    space ++;
                }
            }

            int count = space + 1; //we know no_of_words = spaces + 1

        //Step 2:
            String[] words =  new String[count]; //Here --> words is an array. its holding String datatype values in it. size is same as count variable value
            String currentWord = ""; //empty string to store current word

            int index = 0; //indexing of array 'words'
            for(int i = 0; i < l; i++)
            {
                if(s.charAt(i) != ' ') //if current word is not space
                {
                    currentWord = currentWord + s.charAt(i);

                }
                else {
                     words[index] = currentWord; // word is appended into the array named words[]
                     currentWord  = ""; // currentWord is made empty again, so that new words can be stored
                    index ++;

                }
            }
            // last word is not included as, when i points last word--> if condition is true, lastChar appended and loop ends. And the else part is skipped which is responsible to append word in array
            words[index] = currentWord;

           // Step 3:
            reverse(words);

            for(int i =0; i< words.length ; i++)
            {
                System.out.print(words[i] + " ");
            }
    }
}
