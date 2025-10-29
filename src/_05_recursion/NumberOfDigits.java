package _05_recursion;

public class NumberOfDigits {
	
	public static int numberOfDigits(int n) {
		if(n<=9) {
			return 1;
		}
		return 1 + numberOfDigits(n/10);
	}

	public static void main(String[] args) {
		int ans = numberOfDigits(12345);
		System.out.println(ans);

	}

}
