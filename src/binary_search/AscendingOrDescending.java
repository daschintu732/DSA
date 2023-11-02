package binary_search;

public class AscendingOrDescending {

	public static void main(String[] args) {

		int[] arr = { 78, 61, 55, 48, 33, 29, 17 };

		int target = 33;

		int result = binarysearch(arr, target);

		if (result != -1)
			System.out.println("The index of target " + target + " is : " + result);
		else
			System.out.println(target + " is not Available in the given array");
	}

	static int binarysearch(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		boolean isAsc = arr[start] < arr[end];

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (arr[mid] == target)
				return mid;

			
			if (isAsc) 
			{
				if(target < arr[mid])
					end = mid - 1;
				else
					start = mid + 1;
			} 
			else 
			{
				if(target > arr[mid])
					end = mid - 1;
				else
					start = mid + 1;
			}
		}
		return -1;
	}
}
