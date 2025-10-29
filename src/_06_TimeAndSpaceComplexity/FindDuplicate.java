package _06_TimeAndSpaceComplexity;

public class FindDuplicate {
	
	public static int duplicate(int arr[]) {
		// i can use nested for loop but time complexity will be O(N2)
		// i can use first sorting then in 1 traversal i can get the duplicate in O(nlogn)
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 0; i<arr.length-1; i++) {
			sum1 += i;
		}
		for(int i = 0; i<arr.length; i++) {
			sum2 += arr[i];
		}
		return sum2-sum1;
	}

	public static void main(String[] args) {
		int arr[] = {0,1,2,3,3};
		System.out.println(duplicate(arr));

	}

}
