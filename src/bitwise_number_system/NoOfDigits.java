package bitwise_number_system;

public class NoOfDigits {

	public static void main(String[] args) {
		int num = 10;
		int base = 2;
		int result = (int) ((Math.log(num) / Math.log(base)) + 1);
		System.out.println(result);
	}
}
