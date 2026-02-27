package DSAweek3;

public class a3_bubbleSort {
}

/*
NOTE ie *** we need (n-1) iterations to sort n element using bubble sort ************************************

-->NOTE : Creates a bubble of two adjacent elements and swap them

--> in one iteration largest element goes to the end of the array

arr = {2,1,5,4,3}

ITERATIONS 1:

step1: compare 2,1 --> if needed swap them in correct order --> becomes {1,2, 5,4,3}

step2: compare 2,5 --> if needed  swap them in correct order --> no need --> {1,2, 5,4, 3 }

step3: compare 5,4 --> if needed  swap them in correct order --> becomes --> {1,2,4,5, 3}

step4: compare 5,3 --> if needed  swap them in correct order --> becomes --> {1,2,4,3, 5}

now after the end of first iteration now the last element is the largest of all the elements

    Total swaps/comparisons in one iteration = n-1
    eg. here size n = 5
    first iteration: 4 comparisons

{1,2,4,3, 5}
Iteration 2 :

step1: compare 1,2 --> if needed swap them --> not needed --> {1,2,4,3, 5}
step2: compare 2,4 --> if needed swap them --> not needed --> {1,2,4,3, 5}
step1: compare 4,3 --> if needed swap them --> needed     --> {1,2,3,4, 5}

NO need to go on last element as its already sorted

{1,2,3,4, 5}
ITERATION 3:
step1: compare 1,2 --> if needed swap them --> not needed --> {1,2,3,  4,5}
step2: compare 2,3 --> if needed swap them --> not needed --> {1,2,3,  4,5}

No need to check further

{1,2,3,  4,5}
ITERATION 4:
step1: compare 1,2 --> if needed swap them --> not needed --> {1,2,  3,4,5}

now at the end of this iteration the array is sorted

NOTE ie *** we need (n-1) iterations to sort n element using bubble sort ************************************
  */
