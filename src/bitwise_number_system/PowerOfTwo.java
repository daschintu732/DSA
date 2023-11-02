package bitwise_number_system;

public class PowerOfTwo {

	public static void main(String[] args) {

		System.out.println(isPower());
	}

	private static boolean isPower() {
		int num = 64;

		if (num != 0) {
			return (num & (num - 1)) == 0;
		}
		return false;
	}
}
