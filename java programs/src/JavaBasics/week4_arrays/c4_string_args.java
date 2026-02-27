package JavaBasics.week4_arrays;

//command line argument

/*
In Java, String[] args is a parameter typically found in the main method of a Java program,
and it serves as the mechanism for passing command-line arguments to your Java application
 */

// here String[] args -- is array 'args' of type 'Strings' passed as parameter to the main function

// name of array is 'args' which is user defined and can be given by users choice. Popularly used as 'args'.

public class c4_string_args {
    public static void main(String[] args) {

        System.out.println(" length of args = "+args.length);
        // Checking if any arguments were passed
        if (args.length > 0) {
            System.out.println("Command-line arguments:");
            for (String arg : args) {
                System.out.println(arg);  // Prints each argument passed
            }
        } else {
            System.out.println("No command-line arguments passed.");
        }
    }
}
