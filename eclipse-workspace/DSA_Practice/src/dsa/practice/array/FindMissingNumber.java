package dsa.practice.array;

public class FindMissingNumber {
    public static int FindNumber(int[] arr,int n) {
    	int sum=n*(n+1)/2;
    	int sum2=0;
    	for(int i=0;i<arr.length;i++) {
    		sum2+=arr[i];
    		
    	}
    	return sum-sum2;
    }
    public static void main(String []args) {
    	int[] arr= {0,2,1};
    	int n=3;
    	int result=FindNumber(arr,n);
    	System.out.println(result);
    }
}
