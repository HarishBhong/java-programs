package DSAweek3;
public class a2_sorting_theory {
}

/*

sorting: simple way of arranging the data in particular order
sorted array --> mostly -> in ascending order OR sometimes -> descending order

arr = {1 , 5 , 5 , 7 , 8, 8, 9} -> this array is sorted in ascending order

We have many sorting algorithms:--> langs give builtin sorting methods with these algorithms used under the hood

1) bubble sort       -->  n^2
2) selections sort   --> n^2
3) Insertion sort    --> n^2
4) merge sort        --> n log n  **Merge sort has best TC and used mostly
5) quick sort        --> n^2


 */

/*

✅ Use/Need of Sorting Algorithms:
Sorting algorithms are fundamental in computer science and software development because they organize data to make it:

🔍 1. Easier to Search
Searching in sorted data is faster and more efficient.
Example: Binary Search only works on sorted data and reduces search time from O(n) to O(log n).

🚀 2. Faster Data Processing
Many algorithms (e.g., merge joins in databases) perform better on sorted data.
Example: In analytics or reporting, sorted data helps in fast filtering, ranking, and aggregation.

📊 3. Better User Experience
Sorted content (like alphabetical lists, price filters) makes navigation intuitive.
Example: E-commerce sites show products by price low to high, newest first, etc.

🔁 4. Improves Algorithm Efficiency
Some algorithms (like divide & conquer, greedy, etc.) depend on sorted input for optimal performance.

🔄 5. Preprocessing Step for Other Algorithms
Algorithms like Closest Pair of Points, Convex Hull, and Kruskal's MST require sorted input.

🧠 6. Memory Optimization
Some sorting techniques (like external sorting) help deal with very large datasets efficiently by using disk-memory combinations.

🔄 7. Data Normalization
Sorting is used in deduplication, detecting patterns, or normalizing datasets.

📁 8. Real-World Systems Rely on It
Operating systems (CPU job scheduling), databases (indexing), and even graphics (z-buffering in 3D rendering) rely on sorting.

📜 Historical Timeline of Sorting Algorithms
Year	Algorithm	           Inventor(s)	                            Notes
1945	Merge Sort	         John von Neumann	        First general-purpose sorting algorithm; uses divide & conquer.
1951	Bubble Sort	         Unknown               	Simple, inefficient; used mainly for teaching.
1954	Insertion Sort	     Unknown	            Efficient for small or nearly sorted datasets.
1959	Shell Sort	          Donald Shell	         Improves insertion sort with gap-based comparisons.
1960	Quick Sort	          Tony Hoare	          Very fast, widely used; divide and conquer with pivot.
1964	Heap Sort	           J. W. J. Williams   	    First in-place, non-recursive O(n log n) sort.
1969	Counting Sort	      Harold H. Seward    	    Non-comparison sort; good for integers in a range.
1970s	Radix Sort	          Charles Leiserson       Digit-by-digit sort; used in LSD and MSD forms.
1997	Timsort	Tim           Peters (Python)	        Hybrid of Merge + Insertion sort; used in Java and Python.
2009	Dual-Pivot QuickSort	Vladimir Yaroslavskiy	Adopted by Java 7+ for primitive types. Faster than classic QuickSort.

💡 Fun Facts
Merge Sort (1945) was the first major sorting algorithm—designed for tape drives (no random access).
QuickSort became dominant due to its average-case speed and in-place behavior.
Timsort is the default in Java (Object Arrays) and Python due to its real-world efficiency.
Java uses Dual-Pivot QuickSort for primitive arrays (faster than classical QuickSort).


*************************** JAVA has some default builtin sorting *******************************

nearly all the programming languages provide builtin sorting methods --> these methods provide efficient sorting algorithms under the hood
so there is no need to write a manual sorting algorithm . we can just call these methods and use them for sorting

in c++ we have --> for vectors we have -->  sort.(a.begin(), a.end()) --> this sorts the vector

in java we have --> for arraylist --> Collection.sort(a);

!!!  nearly all the builtin sorting methods have --> (n log(n)) time complexity

__________________________________________________IN JAVA ____________________________________________________________

Primary Built-in Sorting Methods
Arrays.sort()
The Arrays.sort() method from the java.util.Arrays class is used for sorting arrays of both primitive types and objects.

for primitives --> uses insertion sort OR dual-quick sort for large arrays
for Objects --> uses TimSort OR merge sort

Basic Syntax:

Arrays.sort(array);
Arrays.sort(array, startIndex, endIndex); --> sorting only from startIndex to endIndex

example:
import java.util.Arrays;

//sorting Primitive arrays
int[] numbers = {5,2,4,7,2}
Arrays.sort(numbers);
System.out.println(Arrays.toString(numbers)) //[2,2,4,5,7]

//sorting String arrays
String[] cars = {"volvo", "bmw", "ford", "tesla"}
Arrays.sort(cars);
System.out.println(Arrays.toString(cars)); //[bmw, ford, tesla, volvo]

//sorting partial array
int[] myNum = {6, 7, 4, 3, 2, 1}
Arrays.sort(myNum, 1,4)  // sorts only from index 1 to 4 (means index 1,2,3 NOT taking 4th)
System.out.println(Arrays.toString(myNum)) //[6, 3, 4, 7, 2, 1 ]
______________________________________________________________________________________________________________________________________________________
Collections.sort()
The Collections.sort() method from the java.util.Collections class is designed for sorting Lists and other Collection implementations.

Basic Syntax:

java
Collections.sort(list);                   //form Collections class
Collections.sort(list, comparator);

examples
import java.util.*;

//Sort ArrayList of Strings
ArrayList<String> fruits = new ArrayList<>();
fruits.add("apple");
fruits.add("grapes");
fruits.add("banana");
fruits.add("orange");
Collections.sort(fruits);
System.out.println(fruits);   //[apple, banana, grapes, orange]

//Sorting ArrayList of numbers
ArrayList<Integer> num = new ArrayList<>();
num.add(4);
num.add(7);
num.add(1);
num.add(8);
Collections.sort(num);
System.ut.println(num);   // [1,4,7,8]


-----------------------------------------------------------------------------------------------------------------------------------
can builtin sorting work on arraylist of arraylist ???????????
Yes, Java's built-in sorting methods can work on ArrayList<ArrayList> (nested ArrayLists),
but you need to provide a ""custom Comparator"" to define how the nested lists should be compared.



 */
