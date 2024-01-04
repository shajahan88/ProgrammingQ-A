package medium_programming_answers;

import java.util.Arrays;

public class Second_Higest_num_in_Array {

	public static void main(String[] args) {
		
		int [] numbers = {10,5,8,20,15};
		
		int secondHighest = findSecondHighest(numbers);
		
		System.out.println("The second highest number is:" + " "+ secondHighest);

	}

	public static int findSecondHighest(int[] arr) {
		
		if(arr.length < 2) {
			System.out.println("Array should have at least two elements");
			return -1;
		}
		Arrays.sort(arr);
		return arr[arr.length - 2];
		
	}

}
