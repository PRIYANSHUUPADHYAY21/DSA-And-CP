package _05_recursion;

public class SumOfArray {
	
	public static int sumOfArray(int arr[]) {
		return sumOfArray(arr, 0);
	}
	
	private static int sumOfArray(int[] arr, int i) {
		if(i==arr.length-1) {
			return arr[i];
		}
		return arr[i] + sumOfArray(arr, i+1);
	}



	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int ans = sumOfArray(arr);
		System.out.println(ans);

	}

}
