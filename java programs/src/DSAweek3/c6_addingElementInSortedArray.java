package DSAweek3;
/*
If we are given sorted array and asked to add new element in that array at proper place
where there is place for new element, no need to take new expanded array

arr = {1,2,5,7,8,9, -1} --> -1 denotes empty space

add 6 in this arr array

 */
public class c6_addingElementInSortedArray {
    public static void main(String[] args){
        int[] nums = {1,2,5,7,8,9,-1};

        int target = 6;
        int n = nums.length; //7
        int index = -1;

        //finding position for inserting new element, such that array still remains sorted
        for(int i=0; i<=n; i++){
            if( nums[i] >= target) //nums[2] --> 5 > 6  <-- (target)
            {
                index = i;   //index = 2
                break;
            }
        }

        //if we dont get any element > target --> which is possible when event the last element is < target
        if(index == -1){                      //ie. index was not modified in last step
            nums[n-1] = target;
            return;                    //terget is inserted so dont go further
        }

        //Movement of elements to make space for new element to be inserted
        int j = n-2;           // j= lastSecond Element--> NOTE: here its given last element is -1 that denotes empty space
        while(j >= index){
            nums[j+1] = nums[j];
            j--;
        }

        nums[index] = target;

        for (int num : nums) {     //        for(int i = 0; i<n; i++){   this is enhanced for loop
            System.out.println(num);
        }
    }
}
