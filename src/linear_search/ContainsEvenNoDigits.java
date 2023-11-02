package linear_search;

public class ContainsEvenNoDigits {

	public static void main(String[] args) {

		int arr[] = { 21, 403, 88, 6021, 8847, 36245, 702 };
		meth1(arr);
	}

	static void meth1(int[] arr) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			String st = Integer.toString(arr[i]);
			if (st.length() % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
