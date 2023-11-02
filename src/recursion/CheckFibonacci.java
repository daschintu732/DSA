package recursion;

public class CheckFibonacci {
	public static void main(String[] args) {

		int number = 17;

		if (isFibonacci(number)) {
			System.out.println(number + " is a Fibonacci Number");
		} else {
			System.out.println(number + " is not a Fibonacci Number.");
		}
	}

	public static boolean isFibonacci(int number) {
		int a = 0, b = 1;

		while (b < number) {
			int temp = a + b;
			a = b;
			b = temp;
		}

		return b == number;
	}
}
