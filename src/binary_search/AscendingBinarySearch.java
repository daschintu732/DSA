package binary_search;

public class AscendingBinarySearch {

	public static void main(String[] args) {

		int[] arr = {2, 4, 6, 9, 14, 18, 20 };
		
		int target = 18;
		
		int result = binarysearch(arr, target);
		
		if(result != -1)
			System.out.println("The index of target "+target+" is : "+result);
		else
			System.out.println(target+" is not Available in the given array");
	}

	static int binarysearch(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) 
		{
			int mid = start + (end - start) / 2;

			if (target < arr[mid])
				end = mid - 1;
			else if (target > arr[mid])
				start = mid + 1;
			else
				return mid;
		}
		return -1;
	}
}
