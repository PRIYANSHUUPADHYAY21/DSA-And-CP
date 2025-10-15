package _01_basic_core_java;

public class Patterns {
	
	public static void squarePattern(int n) {
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				System.out.print(n);
			}
			System.out.println();
		}
	}
	
	public static void triangleStar(int n) {
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	public static void reverseNumberTriangle(int n) {
		for(int i = 1; i<=n; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print(i-j);
			}
			System.out.println();
		}
	}
	
	public static void alphaPattern(int n) {
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.print((char)('A'+ n + j - i -1));
			}
			System.out.println();
		}
	}
	
	public static void mirrorNumberPattern(int n) {
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=n-i; j++) {
				System.out.print(' ');
			}
			for(int j = 1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void triangleOfNumbers(int n) {
		int k = 0;
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=n-i; j++) {
				System.out.print(' ');
			}
			for(int j = 1; j<=i; j++) {
				System.out.print(i+j-1);
				k = i+j-1;
			}
			for(int j = 1; j<i; j++) {
				System.out.print(--k);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
//		squarePattern(4);
//		triangleStar(5);
//		reverseNumberTriangle(5);
//		alphaPattern(5);
//		mirrorNumberPattern(5);
		triangleOfNumbers(5);

	}

}
