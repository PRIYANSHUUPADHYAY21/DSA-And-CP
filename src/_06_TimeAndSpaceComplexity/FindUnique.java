package _06_TimeAndSpaceComplexity;

public class FindUnique {
	
	public static int unique(int arr[]) {
		int ans = 0;
		for(int i : arr) {
			ans = ans^i;
		}
		return ans;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,3,2,1};
		System.out.println(unique(arr));
	}

}
