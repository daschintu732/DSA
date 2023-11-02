package bubble_sort;

import java.util.Arrays;

public class BubbleSortAsc {

	public static void main(String[] args) {

		int[] arr = { 36, 70, 12, 94, 51, 44 };

		System.out.println(Arrays.toString(bubbleSort(arr)));
	}

	static int[] bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 1; j < arr.length-i; j++) {
				
				if (arr[j] < arr[j-1]) {
					
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		return arr;
	}
}
