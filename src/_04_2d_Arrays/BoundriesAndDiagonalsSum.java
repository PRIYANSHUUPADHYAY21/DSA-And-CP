package _04_2d_Arrays;

public class BoundriesAndDiagonalsSum {
	
	public static void totalSum(int arr[][]) {
		int sum = 0;
		int n = arr.length;
		for(int i = 0; i<n; i++) {
			sum += arr[0][i] +arr[n-1][i];
		}
		for(int i = 1; i<n-1; i++) {
			sum += arr[i][0] + arr[i][n-1];
		}
		for(int i = 1; i<n-1; i++) {
			sum += arr[i][i];
			if(n%2==0) {
				sum += arr[i][n-i-1];
			}else {
				if(i!=n/2) {
					sum += arr[i][n-i-1];
				}
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		int arr[][] = {{1, 2, 3},{4 ,5, 6},{7, 8, 9}};
		totalSum(arr);

	}

}
