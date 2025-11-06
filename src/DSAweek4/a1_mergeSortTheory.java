package DSAweek4;

public class a1_mergeSortTheory {
}

/*
we know bubble sort, quick sort --> TC O(n^2)
        insertion sort (still needs to be studied) --> O(n^2)

        these also are not that optimal for sorting as TC (n^2)

        Merge sort is more optimal --> TC = O(n log(n))
        Merge sort is based on --> Divide and Conquer technique


        Divide N Conquer:

         we have array --> we divide it into 2 halves --> then divide each half again into 2 halves--> and so on

 array =  1,  2,  3,   4,  5,  6
            /            \
        1,  2,  3       4,  5,  6
          /    \          /   \
        1, 2    3      4,  5    6
        /\
       1  2

NOTE --> this dividing into half for each step takes (log n) steps to reach last step
NOTE --> and we do sorting of these part n times
Therefore time complexity = n(log(n))

array = [5,  4,  3,  2,  1]
            /       \
       [5, 4, 3]     [ 2,  1]       --> dividing stage --> takes max: O(log(n)) steps to reach end
       /     \          /  \
    [5, 4]    [3]      [2]   [1]
    /   \
   [5]    [4]


      |               |         --> merging stage, actual sorting
   [5] + [4]      [2] + [1]
      |               |
   [4,  5]          [1,  2]
      |+(3)
   [3,  4,  5]
              |  (3, 4, 5) + (1, 2)
              |
      [1, 2, 3, 4 ,5]
    */
