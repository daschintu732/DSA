package selection_sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = { 3, 1, 90, 44, 33, 20, -54, 0, 39 };
		
		System.out.println(Arrays.toString(selectionSort(arr)));
	}

	public static int[] selectionSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;

			for (int j = i+1; j < arr.length; j++) 
			{
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
}
