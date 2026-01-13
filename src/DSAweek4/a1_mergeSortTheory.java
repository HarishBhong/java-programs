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

NOTE --> this dividing into half(divide by 2) "for each step" takes (log n) steps to reach last step
NOTE --> and we do sorting of these part n times
Therefore time complexity = n(log(n))

array = [5,  4,  3,  2,  1]
            /       \
       [5, 4, 3]     [ 2,  1]       --> dividing stage --> takes max: O(log(n)) steps to reach end
       /     \          /  \
    [5, 4]    [3]      [2]   [1]      Note--> when we keep dividing anything (say N) by 2 --> N-> N/2 -> n/4 -> n/8 .....-> 1
    /   \                                 --> what we actually have to note here, is we take (log n) number of steps here to reach n
   [5]    [4]


      |               |         --> merging stage, actual sorting at each stage
   [5] + [4]      [2] + [1]
      |               |
   [4,  5]          [1,  2]
      |+(3)
   [3,  4,  5]
              |  (3, 4, 5) + (1, 2)
              |
      [1, 2, 3, 4 ,5]


     Actually we are writing one sorting and merging (MERGE SORT) function
     then we call that function for lets say 10 elements ie. index --> 0 to 9
     step1 - we say try to sort 0 - 9. --> But we say lets divide this in to 2 parts and then sort each part and later we'll merge them

     step2 - now we have 2 part index 0 to 4 and index 5 to 6 we call sorting function for each of them again.
             NOTE "here again means this can be written as Recursive function"
             ie. sorting(0,1,2,3,4) and sorting(5,6,7,8,9)
             BUT now we say again instead of sorting these large arrays we can split each into two halves and sort them and merge them
             -incomplete step. Function not terminated

     step3 - we again divide them. Here we first divide the first half ie. (0,1,2,3,4)
             at this step of "RECURSION" first that left half will be divided / ie. sorted
            (0,1,2) and (3,4)
            these are the next two halves to be sorted and merged
            BUT we say lets divide them into 2 halves for simplicity and them sort and merge them
            -incomplete step. Function not terminated

    step4 - Here also first the left half will be taken, imagine recursive function "RECURSION"
            (0,1,2) -> (0,1) & 2
            BUT again we will say lets make 2 halves of each of them and then sort and merge LATER
            -incomplete step. Function not terminated

    step5 - Here also we will take left-most array first ie. [0,1]. Apply sorting function on it. RECURSION
            0,1 -> [0] & [1]

            now sorting [0] will give sorted [0] and sorting [1] will give sorted [1]
          - "this is base case"

          -incomplete step. Function not terminated

          it will return sorted [0,1] to the step-4

    step6 - now  step 4- will get sorted array [0,1] from step 5
          - step 4 was not terminated
          -  here we had left right-side array [2]
          - it is base case with single element
          merges [0,1] & [2] --> [0,1,2]
          - this array is returned to step 3

   step7  - now the step3 gets [0,1,2] sorted array from left-side
  (step3)   its right-side is still incomplete (3,4) which was remaining for later sorting
          - now the sort function is applied to right-side [3,4]
          - BUT we say lets divide it into 2 halves and then sort using function

   step8 - we get [3,4] --> [3] & [4]
         - that is, base case
         - now merge them
         - we get [3,4]
         - it is returned to step3

  step3 - it already had left-side sorted and now it got right-side sorted so NOW sort and merge them
        - [0,1,2,3,4]
        - this sorted [0,1,2,3,4] is returned to step2

  step2 - gets left-side sorted array
        - now apply same login to right-side [5,6,7,8,9]
        -divide into 2
        - again sort-funtion on left-part.. and so on
   .
   .
   .
  then at one step we will return sorted array [5,6,7,8,9] to this step2

  step1 - the step1 where we will get this right side and merge both the arrays
        -  and we will get Sorted array


    */
