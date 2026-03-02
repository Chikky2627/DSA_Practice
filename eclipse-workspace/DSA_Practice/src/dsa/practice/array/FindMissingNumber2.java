package dsa.practice.array;
public class FindMissingNumber2 {
  public static int findNumber(int [] arr,int n) {
	  //for range 0to n we have to use this logic
	  int xor1=0;
	 // int xor2=0;
	  for(int i=0;i<arr.length;i++) {
		  xor1^=i;
		  xor1^=arr[i];
	  
	  }
	  return xor1^n;
  }
  public static void main(String [] args) {
	  int[] arr= {0,2};
	  int n=2;
	  int result=findNumber( arr,n);
	  System.out.println(result);
  }
}
