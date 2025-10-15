package _01_basic_core_java;

public class ReverseOfANumber {
	
	public static void reverseNumber(int n) {
		if(n<10) {
			System.out.println(n);
			return;
		}
		int reverse = 0;
		while(n>0) {
			reverse = reverse*10 + n%10;
			n = n/10;
		}
		System.out.println(reverse);
	}

	public static void main(String[] args) {
		reverseNumber(1020);

	}

}
