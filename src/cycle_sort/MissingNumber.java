package cycle_sort;

public class MissingNumber {
	public static void main(String[] args) {

		int arr[] = { 2,4,1,0,5 };
		
		System.out.println(missingNum(arr));
	}

	static int missingNum(int[] arr) {

		int i = 0;
		while (i < arr.length) {

			int correct = arr[i];
			if (arr[i] < arr.length && arr[i] != arr[correct]) {
				swap(arr, i, correct);
			} else {
				i++;
			}
		}
		// search for missing number
		for (int index = 0; index < arr.length; index++) {

			if (arr[index] != index) {
				return index;
			}
		}
		return arr.length;

	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
