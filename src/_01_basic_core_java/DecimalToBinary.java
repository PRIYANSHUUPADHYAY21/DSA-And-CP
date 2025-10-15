package _01_basic_core_java;

public class DecimalToBinary {
	
	public static void decimalToBinary(int n) {
		int binary = 0;
		int i = 0;
		while(n>0) {
			binary = binary + n%2*((int)Math.pow(10, i));
			i++;
			n = n/2;
		}
		System.out.println(binary);
	}

	public static void main(String[] args) {
		decimalToBinary(12);
		
	}

}
