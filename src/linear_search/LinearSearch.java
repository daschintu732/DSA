package linear_search;

public class LinearSearch {

	public static void main(String[] args) {

		int[] nums = { 40, 36, 10, 6, 88, 77, -1, 45, 91, 2, 43 };
		int target = 77;

		int result = linearSearch(nums, target); // Function/Method calling

		if (result != -1) {
			System.out.println("Target found at index : " + result);
		} else {
			System.out.println("Target not found");
		}
	}

	static int linearSearch(int[] arr, int target) {
		if (arr.length == 0)
			return -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target)
				return i;
		}

		return -1;
	}
}
