package cycle_sort;

public class FirstMissingPositiveNum {

	public static void main(String[] args) {

		int[] arr = { -1, 0, 1, 2, 3, 5 };
		System.out.println(missingPositive(arr));
	}

	private static int missingPositive(int[] arr) {

		int i = 0;
		while (i < arr.length) {

			int correct = arr[i] - 1;
			if (arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correct]) {
				int temp = arr[i];
				arr[i] = arr[correct];
				arr[correct] = temp;
			} else {
				i++;
			}
		}

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != index + 1) {
				return index + 1;
			}
		}
		return arr.length;

	}
}
