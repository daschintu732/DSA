package cycle_sort;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {

	public static void main(String[] args) {

		int[] arr = { 2, 6, 3, 2, 3, 4 };
		System.out.println(findAllDuplicates(arr));
	}

	public static List<Integer> findAllDuplicates(int[] arr) {

		int i = 0;
		while (i < arr.length) {
			int correctIndex = arr[i] - 1;
			if (arr[i] != arr[correctIndex]) {
				swap(arr, i, correctIndex);
			} else {
				i++;
			}
		}

		List<Integer> duplicates = new ArrayList<>();
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != index + 1) {
				duplicates.add(arr[index]);
			}
		}

		return duplicates;
	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
