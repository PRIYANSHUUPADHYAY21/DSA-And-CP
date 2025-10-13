package basic_core_java;

public class ZerosAndStarsPattern {
	
	public static void zerosAndStarsPattern(int n) {
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=n*2+1; j++) {
				if(j==i || j==n+1 || j==(2*n+2-i)) {
					System.out.print("*");
				}else {
					System.out.print(0);
				}
			}
			System.out.println();
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		zerosAndStarsPattern(4);
	}

}
