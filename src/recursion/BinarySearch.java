package recursion;

public class BinarySearch {
	
	public static int search(int []nums, int target) {
        return search(nums, target, 0, nums.length-1);
    }
	
	private static int search(int arr[], int x, int start, int end) {
		if(start>end) {
			return -1;
		}
		int mid = (start+end)/2;
		if(arr[mid]==x) {
			return mid;
		}else if(arr[mid]>x) {
			return search(arr, x, start, mid-1);
		}else {
			return search(arr, x, mid+1, end);
		}
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int ans = search(arr, 3);
		System.out.println(ans);

	}

}
