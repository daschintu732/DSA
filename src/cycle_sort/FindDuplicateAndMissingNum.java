package cycle_sort;

import java.util.Arrays;

public class FindDuplicateAndMissingNum {

	public static void main(String[] args) {

		int arr[] = { 2, 4, 5, 3, 4, 1, 7, 8, 6, 10 };
		System.out.println(Arrays.toString(meth1(arr)));
	}

	private static int[] meth1(int[] arr) {

		int i = 0;
		while (i < arr.length) {

			int correctIndex = arr[i] - 1;
			if (arr[i] != arr[correctIndex]) {
				swap(arr, i, correctIndex);
			} else {
				i++;
			}
		}

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != index + 1) {
				return new int[] { arr[index], index + 1 };
			}
		}
		return new int[] { -1, -1 };

	}

	private static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
