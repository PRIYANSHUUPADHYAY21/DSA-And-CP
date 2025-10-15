package _02_arrays;

public class SwapAlternates {
	
	public static void swapAlternates(int arr[]) {
		for(int i = 0; i<arr.length-1; i+=2) {
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
	}
	
	public static int findUnique(int arr[]) {
		int ans = arr[0];
		for(int i = 1; i<arr.length; i++) {
			ans ^= arr[i];
		}
		return ans;
	}

	public static void main(String[] args) {
		int arr[] = {2, 3 ,1 ,6, 3, 6, 2};
//		swapAlternates(arr);
//		for(int i : arr) {
//			System.out.print(i + " ");
//		}
		System.out.println(findUnique(arr));
	}

}
