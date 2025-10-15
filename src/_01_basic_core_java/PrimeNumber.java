package _01_basic_core_java;

import java.util.Scanner;

public class PrimeNumber {
	
	public static boolean primeOrNot(int n) {
		if(n<2) {
			return false;
		}
		else if(n==2) {
			return true;
		}
		for(int i = 2; i*i<n; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		System.out.println(primeOrNot(n));

	}

}
