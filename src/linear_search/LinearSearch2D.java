package linear_search;

import java.util.Arrays;

public class LinearSearch2D {

	public static void main(String[] args) {

		int[][] arr = { { 45, 8, 7, 36 },
						{ 5, 7, 9, 58 },
						{ 99, 77, 55 },
						{ 82, 59, 32, 100, 300 } };
		
		int target = 77;
		int[] ans = search(arr, target);
		System.out.println(Arrays.toString(ans));
	}

	public static int[] search(int[][] arr, int target) {
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] == target)
					return new int[] { i, j };

			}
		}
		return new int[] { -1, -1 };

	}
}
