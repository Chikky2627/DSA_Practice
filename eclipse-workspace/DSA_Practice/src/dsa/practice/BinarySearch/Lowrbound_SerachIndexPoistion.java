package dsa.practice.BinarySearch;

public class Lowrbound_SerachIndexPoistion {
	 public static int searchInsert(int[] nums, int target) {

	int low = 0;
    int high = nums.length - 1;

    while(low <= high){

        int mid = low + (high - low) / 2;

        if(nums[mid] < target)
            low = mid + 1;

        else
            high = mid - 1;
    }

    return low;
}
	 public static void main(String[] args) {
   	  int[] nums=  {3,4,5,6,9,10};
   	  int target=8;
   	  int result=searchInsert( nums,target);
   	 
   	  System.out.println( "index of target element is:"+result);
     }
}

