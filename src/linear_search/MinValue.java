package linear_search;

public class MinValue {

	public static void main(String[] args) {

		int arr[] = { 30, 270, 88, 44, 98, 67 };

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("The minimum value is : " + min);
	}
}
