package _01_basic_core_java;

public class NumberStarPattern {
	
	public static void numberStarPattern(int n) {
		for(int i = 1; i<=n; i++) {
			for(int j = n; j>=1; j--) {
				if(i==j) {
					System.out.print("*");
				}else {
					System.out.print(j);					
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		numberStarPattern(5);

	}

}
