package _01_basic_core_java;

public class FactorialOfN {
	
	public static int fac(int n) {
		if(n<=2) {
			return n;
		}
		int ans = 1;
		for(int i =2; i<=n; i++) {
			ans *= i;
		}
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(fac(6));

	}

}
