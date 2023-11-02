package bitwise_number_system;

public class FindUnique {

	public static void main(String[] args) {

		int[] arr = { 2,42,2,7,7 };
		System.out.println(uniqueNum(arr));
	}

	private static int uniqueNum(int[] arr) {

		int unique = 0;

		for (int uniqueNum : arr) {
			unique ^= uniqueNum;
		}
		return unique;

	}
}
