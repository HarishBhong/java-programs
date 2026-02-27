package DSAweek4;
/*
variation of Merge sort -> Count inversion problem
inversion count of array:
Given an array of integer. Find the inversion Count in the array.
find Two elements arr[i] and arr[j] from an inversion if 1) arr[i] > arr[j]  and
                                                               2) i < j
explanation-
inversion Count:
for an array, inversion count indicates how far (or close) the array is from being sorted.
If the array is already sorted then the inversion count is 0.

i/p arr[] = [2,4,1,3,5]
o/p: 3
why? => the sequence 2,4,1,3,5 has three inversions (2,1), (1,4), (4,3) to make it sorted.

logical approach:
means the pairs must satisfy 2 conditions 1) arr[i] > arr[j] and 2) i < j
 possible pairs for condition ( i<j ) --> 2,(4/1/3/5) , 4,(1/3/5), 1,(3/5) , (3,5)  --> these 10 pairs are possible for i<j
 second condition on this:
  for arr[i] > arr[j] --> (2,1), (4,1), (4,3)
  that's the inversion count

/*

for array [5,4,3,2,1]
total possible pairs for i<j : 5,(4/3/2/1) , 4,(3/2/1) , 3(2/1) , (2,1)

               arr[i] > arr[j] : all 10 pairs satisfy this
 */

public class c3_inversionCountOfArray {



}
