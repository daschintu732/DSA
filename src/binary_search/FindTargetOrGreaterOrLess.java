package binary_search;

public class FindTargetOrGreaterOrLess {

	public static void main(String[] args) {

		int[] arr = { 2, 5, 33, 40, 77, 99 };
		int target = 44;

		int result = targetOrGreater(arr, target); // Function or method calling

		if (result < arr.length) 
		{
			System.out.println(result);
		} else {
			System.out.println("Target is out of bound");
		}
	}

	static int targetOrGreater(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return start; // If target not found it will return greater than target
		// return end; // It will return less than target
	}
}
