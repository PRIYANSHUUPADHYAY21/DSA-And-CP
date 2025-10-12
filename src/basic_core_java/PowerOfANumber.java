package basic_core_java;

import java.util.Scanner;

public class PowerOfANumber {
	
	public static void powerOfANumber(int x, int n) {
		System.out.println((int)Math.pow(x, n));
		int ans = 1;
		for(int i = 0; i<n ; i++) {
			ans *=x;
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int n = s.nextInt();
		powerOfANumber(x, n);

	}

}
