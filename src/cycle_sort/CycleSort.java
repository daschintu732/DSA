package cycle_sort;

import java.util.Arrays;

public class CycleSort {

	public static void main(String[] args) {

		int arr[] = { 5, 4, 6, 7, 9, 8, 3, 2, 1 };
		sorting(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void sorting(int[] arr) {

		int index = 0;
		while (index < arr.length) {

			int correct = arr[index] - 1;
			if (arr[index] != arr[correct]) {
				swap(arr, index, correct);
			} else {
				index++;
			}
		}
	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
