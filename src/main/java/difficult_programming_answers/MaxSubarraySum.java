package difficult_programming_answers;

public class MaxSubarraySum {
	
	public static int maxSubaraysum(int[]arr) {
		int n = arr.length;
		int maxEndingHere = arr[0];
		int maxSoFar = arr[0];
		
		for(int i =1; i < n; i++) {
			maxEndingHere = Math.max(arr[i],maxEndingHere + arr[i]);
			maxSoFar = Math.max(maxSoFar, maxEndingHere);
			
		}
		return maxSoFar;
	}

	public static void main(String[] args) {
		
		int[]arr = {-2,-3,-4,-1,-2,1,5,-3};
		int result = maxSubaraysum(arr);
		System.out.println("Maximum subarray Sum:" + result);
		

	}

}
