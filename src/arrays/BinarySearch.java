package arrays;

public class BinarySearch {
	
	public static int binarySearch(int arr[], int x) {
		int start = 0;
		int end = arr.length-1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(arr[mid]==x) {
				return mid;
			}else if(arr[mid]<x) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {2,3,4,5,6};
		System.out.println(binarySearch(arr, 3));

	}

}
