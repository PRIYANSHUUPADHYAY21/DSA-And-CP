package basic_core_java;

public class Fibonacci {
	
	public static boolean isFibo(int n) {
		if(n>=0 && n<=2) {
			return true;
		}
		int a = 0;
		int b = 1;
		int t = 0;
		while(t<n) {
			t = a + b;
			if(t==n) {
				return true;
			}
			a = b;
			b = t;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isFibo(15));

	}

}
