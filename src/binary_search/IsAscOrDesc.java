package binary_search;

public class IsAscOrDesc {

	public static void main(String[] args) {

		int arr[] = { 200, 150, 101, 87, 55 };
		int target = 101;
		System.out.println(binarySearch(arr, target));
	}

	static int binarySearch(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;
		boolean isAsc = arr[start] < arr[end]; // Check whether array is ascending or descending order

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (target == arr[mid]) {
				return mid;
			}

			if (isAsc) {
				if (target < arr[mid]) {
					end = mid - 1;
				} else if (target > arr[mid]) {
					start = mid + 1;
				}
			} else {
				if (target < arr[mid]) {
					start = mid + 1;
				} else if (target > arr[mid]) {
					end = mid - 1;
				}
			}
		}

		return -1; // if target not found return -1
	}
}
