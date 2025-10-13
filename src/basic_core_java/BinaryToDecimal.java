package basic_core_java;

public class BinaryToDecimal {
	
	public static void binaryToDecimal(int n) {
		int dec = 0;
		int i = 0;
		while(n>0) {
			dec = dec + (n%10)*((int)Math.pow(2, i));
			i++;
			n = n/10;
		}
		System.out.println(dec);
	}

	public static void main(String[] args) {
		binaryToDecimal(1111);
	}

}
