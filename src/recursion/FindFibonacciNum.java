package recursion;

public class FindFibonacciNum {

	public static void main(String[] args) {

		System.out.println(fibonacci(6));
		
		for (int i = 1; i < 11; i++) {
			System.out.println(fiboFormula(i));
		}
	}

	public static int fiboFormula(int num) {

		return (int) (Math.pow(((1 + Math.sqrt(5)) / 2), num) / Math.sqrt(5));
	}

	public static int fibonacci(int num) {

		if (num < 2) {
			return num;
		}

		return fibonacci(num - 1) + fibonacci(num - 2);
	}
}
