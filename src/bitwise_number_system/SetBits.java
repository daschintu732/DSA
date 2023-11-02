package bitwise_number_system;

public class SetBits {

	public static void main(String[] args) {
		
		int num = 71116;
		System.out.println(Integer.toBinaryString(num));

		System.out.println(setBits(num));
	}

	private static int setBits(int num) {

		int count = 0;

		while (num > 0) {
			count++;
			//num -= (num & -num); // 1st Approach

			num = num & (num - 1); // 2nd Approach
		}
		return count;
	}
}
