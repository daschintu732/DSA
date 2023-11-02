package cycle_sort;

import java.util.ArrayList;
import java.util.List;

public class FindAllMissingNums {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 1, 5, 7, 9 };
		System.out.println(missingNumbers(arr));
	}

	static List<Integer> missingNumbers(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			
			if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1]) {
				swap(nums, i, nums[i] - 1);
			} else {
				i++;
			}
		}

		// Search for missing numbers
		List<Integer> missingNumbers = new ArrayList<>();
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] != index + 1) {
				missingNumbers.add(index + 1);
			}
		}
		return missingNumbers;
	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
