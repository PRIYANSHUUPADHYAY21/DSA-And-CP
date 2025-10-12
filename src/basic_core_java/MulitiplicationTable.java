package basic_core_java;

import java.util.Scanner;

public class MulitiplicationTable {
	
	public static void table(int n) {
		for(int i = 1; i<=10; i++) {
			System.out.println(n + " * " + i + " = " + n*i);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		table(n);

	}

}
