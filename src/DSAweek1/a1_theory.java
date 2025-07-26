package DSAweek1;

public class a1_theory {
}

/*
Normal Array has a fixed size. which when initialised and declared can not be changed
BUT Dynamic Array means Array who's size can be changed
in JAVA Dynamic Arrays are called as 'Arraylist'
size changes Dynamically means :- The size of a data structure can grow or shrink during runtime
                                   based on how much data you add or remove — without needing to manually allocate a new size.
                                   This dynamic size allocation cannot be done in Arrays


Internal handling
 size --> total Number of elements actually stored in the array
 capacity --> Number of elements the array can hold before it needs resizing. ( ie. total elements already stored + empty space available in array )

 capacity --> depends on compilers But generally --> if empty array-- size 0 -- capacity is set to = 1
                                                     if 1 element added-- size 1 --> capacity = 2 (ie. 1 element already present + 1 more can be added)
                                                     if 2 elements added-- size 2 --> capacity = 4 ( 2 ele already present + 2 more can be added)
                                                     if one more element is added--ie 3 elements(size = 3) --> capacity will set to 6
           --> capacity is--How much elements you can add at this point of time in the array
                          --Capacity is made 'double' the current size of the array

Here key difference is --> in Dynamic array, it uses concept of Capacity, where memory is already allocated for future elements.
                            This makes it faster for execution compared to static array where memory is allocated after the element is asked to added

There is some space where we store the memory it's called RAM
suppose inside RAM there is space of 8, this is the maximum space of the system. Capacity can not exceed this RAM maximum space
ie. capacity becomes double the size occupied, BUT it cannot exceed certain limit where it has reached maximum limit for RAM storage

Machines get HANG issue when we try to over store in Memory

Time Complexity
               insert --> O(1)
               get --> O(1)
               search --> O(N) LinearSearch for unsorted array
               remove --> O(N)
               remove last element (BuiltIn function) --> O(1)

Syntax in JAVA:

            ArrayList<Integer> arr = new ArrayList<>();
                              OR
            List<Integer> arr = new ArrayList<>();

Sysntax in C++

        vector<int> arr = {};
        arr.push_back(1); --> [1]
        arr.push_back(3); --> [1,3]
        arr.push_back(4); --> [1,3,4]



Array --> is a builtin data structure of core java lang, not imported from any package
      --> it's declared with fixed size
      --> int num = new int[];

ArrayList --> is not builtin data structure
          --> its a class of java.util package
          --> it needs to be imported --> import java.util.ArrayList;
          --> its not a part of core java syntax => rather its part of java collection framework

          --> provides dynamic resizing, builtin methods like add(),remove(),etc
          --> import java.util.ArrayList;
              ArrayList<Integer> num = new ArrayList<>();

              Arraylist
              --Backed by a regular array internally
              --When size exceeds capacity, a new larger array is created, and all elements are copied over
              --Default capacity is 10 if not specified

               When to Use ArrayList?
                When you need:
                    --Fast random access
                    --Dynamic resizing
                    --Ordered elements
                    --Not ideal if frequent insertions/deletions at the beginning or middle (use LinkedList instead)


 */