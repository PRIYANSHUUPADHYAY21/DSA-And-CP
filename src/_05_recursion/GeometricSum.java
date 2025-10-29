package _05_recursion;

public class GeometricSum {
	
	public static double geometricSum(int k) {
		return geometricSum(0,k);
	}
	
	private static double geometricSum(int index, int k) {
		if(index==k) {
			return 1.0/power(2,k);
		}
		return (1/power(2,index)) + geometricSum(index+1, k);
	}
	
	private static double power(int x, int n) {
		if(n==0) {
			return 1;
		}
		return x*power(x,n-1);
	}

	public static void main(String[] args) {
		double ans = geometricSum(4);
		System.out.println(ans);
	}

}
