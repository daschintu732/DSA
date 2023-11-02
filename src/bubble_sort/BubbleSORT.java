package bubble_sort;

import java.util.Arrays;

public class BubbleSORT {

	public static void main(String[] args) {
		
		int[] arr = { 88,66,-55,20,0,-9999 };
		meth1(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void meth1(int[] arr) {

		boolean swapped;
		
		for (int i = 0; i < arr.length; i++) {
			swapped=false;
			
			for (int j = 1; j < arr.length-i; j++) {

				if (arr[j] < arr[j-1]) {
					// swapping
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					swapped=true;
				}
			}
			if(!swapped) {
				break;
			}
		}
	}
}
