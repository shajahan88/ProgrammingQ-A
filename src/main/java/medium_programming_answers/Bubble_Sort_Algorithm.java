package medium_programming_answers;

import java.util.Arrays;

public class Bubble_Sort_Algorithm {

	public static void main(String[] args) {
	
		int [] numbers = {65,35,58,12,19,25,89,99};
		
		System.out.println("Original array" + " "+ Arrays.toString(numbers));
		
		bubbleSort(numbers);
		System.out.println("Sorted array:" + " "+ Arrays.toString(numbers));

	}

	public  static void bubbleSort(int[] arr) {
		
		int n = arr.length;
		boolean swapped;
		
		for(int i =0; i< n; i++) {
			swapped = false;
			
			for(int j = 0; j < n - 1 - i; j++) {
				if(arr[j]> arr[j +1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
	}

}
