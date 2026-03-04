package dsa.practice.array;

import java.util.Arrays;
import java.util.HashMap;
public class TwoSumUnsortedArray {
    public  static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> Map=new HashMap();
      for(int i=0;i<nums.length;i++){
        int complement=target-nums[i];
        if(Map.containsKey(complement)){
            return new int[]{Map.get(complement),i};
        }
        Map.put(nums[i],i);
      }
      return new int[]{-1,-1};
    }
    public static void main(String[] args) {
    	int[] nums= {1,3,5,-7,6,-3};
    	int target=0;
    	int[] output=twoSum(nums,target);
    	System.out.println(Arrays.toString(output));
    }
}

