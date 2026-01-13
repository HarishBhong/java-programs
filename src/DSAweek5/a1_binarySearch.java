package DSAweek5;

public class a1_binarySearch {
}

/*

[1,9,2,7,4,5,3,6]

Linear searching-- for element by going one-by-one to each element is called linear search
                -- TC: O(n)
                -- For am unsorted Array we have to do Linear Search

But if the given array is sorted (mostly given) then we can use certain logic that will reduce the timeComplexity from O(n)

Search Space -> technical term -> size of array(say) that is to be searched to find target element
             -> for Linear Search space is N
             -> in Binary Search this Search space keeps reducing

             Binary Search -> works for sorted array
1) target element will be present between start and end element of the array
2) take mid of the array
3) compare target element with the mid of tht array and see if its greater or Smaller ( this is possible bCoz array is sorted)
   if target > arr[mid] -> target should be on rightSide of mid ( using 3rd step)
   if target < arr[mid] -> target should be on the left side of mid (using 3rd step
4) means here we are reducing the search space to N/2

ex: [1,2,3,4,5,6,7,8,9]

   Indexing( start = 1, end = 8, mid = 4)

   if target = 2
   ie. target < arr[mid]
   hence target is on left of mid --> so search in left half ( for that we must change the end pointer)
   next step: end = mid-1

   if target = 7
   ie. target > arr[mid]
   hence target is on the right of mid --> so search in right half ( for that we must change the start pointer)
   next step: start = mid + 1

 */
