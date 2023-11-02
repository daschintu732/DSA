package linear_search;

public class MaxValue2D {

	public static void main(String[] args) {

		int[][] arr = { { 45, 8, 7, 36 }, { 5, 7, 9, 58 }, { 99, 77, 55 }, { 82, 59 } };

		int ans = maxValue(arr);
		System.out.println(ans);
	}

	public static int maxValue(int[][] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}

		return max;
	}
}
