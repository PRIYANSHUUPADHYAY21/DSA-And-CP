package _01_basic_core_java;

public class SquareRoot {
	
	public static void squareRoot(int n) {
		int ans = 0;
		for(int i = 0; i<n; i++) {
			if(i*i>n) {
				ans = i-1;
				break;
			}
		}
		System.out.println(ans + " " + String.format("%.2f", Math.sqrt(n)));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		squareRoot(16);

	}

}
