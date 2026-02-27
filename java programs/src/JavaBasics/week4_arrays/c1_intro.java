package JavaBasics.week4_arrays;
/*
1-- array is fundamental data structure used to store collection of data
2-- in java array is an object.
3 -- an object that can store multiple values of same datatype in contiguous manner.
4 -- we can 'declare' array with or without the 'new' keyword.BUT
5-- we cannot 'initialise' array in java without 'new' keyword.
    without the new keyword, array would not be allocated in memory, and then accessing it would cause a NullPointerException


 */
public class c1_intro {

    public static void main(String[] args) {
        //array declaration;
        //1 -- declaration without initialization
        //int arr[];          // recommended for cpp , can work for java as well
        int[] brr;          //recommended for java , can work for cpp as well

        //2 -- declaration with size allocation, but without initialising -- using new keyword
        //int crr[5];         //-- this is incorrect

        int[] drr = new int[5]; //'new' is keyword used to dynamically allocate heap memory for array elements in array
                                // as we are not initialising values, the compiler allocates 0 to each index until we initialise explicitly
        int err[] = new int[5];


        // it can also be done in two lines

        int[] hrr;
        hrr = new int[5];

        //3 -- declaration and explicit initialising with predefined values (in one line)
        int[] frr = {1,2,3,4,5,6,7};

        //4 -- using 'new' , declaration and explicitly initialise with predefined values (in one line)
        int[] grr = new int[]{1,2,3,4,5,6,7};

        // multi Dimensional array
        int[][] matrix = new int[3][3]; //2D array of size 3x3
        int[][] jaggedArray = new int[3][]; //jagged array with variable column sizes

        //array of objects
        String[] names = new String[5]; // array of strings


        //storing in array

        int[] jrr = new int[6];

        jrr[0]=11;
        // jrr[1,2,3] = 12,13,14; this is wrong

        jrr[1]=12;
        jrr[2]=13;

        System.out.println("printing single element:");
        // accessing elements in array is done using index
        // printing elements from array
        System.out.println(jrr[1]); // o/p = 12
        System.out.println(jrr[2]); // o/p = 13

        System.out.println("printing multiple elements:");
        // printing whole array
        // System.out.println(jrr[1,2,3]); this is wrong
        // System.out.println(arr[]);      this is wrong

        // we must use loop for accessing multiple elements in arrra

        for(int i = 0; i <= 10;i++ )
        {
            System.out.println(jrr[i]);
        }
        //in jrr array we have size = 6. elements defined only 3 (11,12,13). therefore remaining nos are allocated as zero's.
        //in jrr array size is 6. but we called loop for i<=10; so we will get only 6 results.
    }
}
