package medium_programming_answers;

import java.util.Arrays;

public class Selection_sort_Algorithm {

	public static void main(String[] args) {
		
		int[] numbers = {65,32,58,11,22,17};
		
		System.out.println("Original array:"+" "+ Arrays.toString(numbers));
		
		selectionSort(numbers);
		
		System.out.println("Sorted array:"+" "+ Arrays.toString(numbers));

	}

	public static void selectionSort(int[] arr) {
		int n = arr.length;
		
		for(int i = 0; i < n-1; i++) {
			
			int minIndex =i;
			for(int j =i +1; j < n; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
					
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		
		
	}

}
