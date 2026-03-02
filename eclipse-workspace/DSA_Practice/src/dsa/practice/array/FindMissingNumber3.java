package dsa.practice.array;

public class FindMissingNumber3 {
	public static int findNumber(int [] arr,int n) {
		  //for range( 1 to n) we have to use this logic
	 int xor1=0;
	  int xor2=0;
	  for(int i=1;i<n;i++) {
		  xor1^=i;
	  }
	  for(int i=0;i<arr.length;i++) {
		  xor1^=arr[i];
	  
	  }
	  return xor1^xor2;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr= {0,2};
		  int n=2;
		  int result=findNumber( arr,n);
		  System.out.println(result);
	  }

	}


