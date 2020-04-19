package fibonacci;

public class FibonacciNumber {

	public static void main(String[] args) {
		System.out.println(fibonacciNumber(9));
	}

	public static int fibonacciNumber(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		int prev = 1;
		int current = 1;
		int total = 0;
		for (int i = 3; i <= n; i++) {
			total = prev + current;
			prev = current;
			current = total;
		}
		return total;
	}

}