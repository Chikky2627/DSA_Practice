package dsa.practice.BinarySearch;

public class FindTarget {
      public static int search(int[] nums, int target) {
	       
	        int low=0;
	        int high=nums.length-1;
	        while(low<=high){
	        int mid=low+(high-low)/2;
	        if(nums[mid]==target){
	            return mid;
	        }else if(nums[mid]<target){
	            low=mid+1;
	        }else{
	            high=mid-1;
	        }
	       
	        
	       }
	       return -1;
	    }
      public static void main(String[] args) {
    	  int[] nums= {3,4,5,6,9,10};
    	  int target=6;
    	  int result=search( nums,target);
    	 
    	  System.out.println( "index of target element is:"+result);
      }
	}

