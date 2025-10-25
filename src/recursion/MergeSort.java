package recursion;

public class MergeSort {
	
	public static void mergeSort(int arr[]) {
		mergeSort(arr, 0, arr.length-1);
	}
	
	private static void mergeSort(int arr[], int start, int end) {
		if(start>=end) {
			return;
		}
		int mid = (start+end)/2;
		mergeSort(arr, start, mid);
		mergeSort(arr, mid+1, end);
		merge(arr, start, end);
	}
	
	private static void merge(int arr[], int start, int end) {
		int newArray[] = new int[end-start+1];
		int mid = (start+end)/2;
		int j = start;
		int k = mid+1;
		for(int i = 0; i<newArray.length; i++) {
			if(j>mid) {
				newArray[i] = arr[k];
				k++;
			}else if(k>end) {
				newArray[i] = arr[j];
				j++;
			}else if(arr[j]<=arr[k]) {
				newArray[i] = arr[j];
				j++;
			}else {
				newArray[i] = arr[k];
				k++;
			}
		}
		
		for(int i = 0; i<newArray.length; i++) {
			arr[start+i] = newArray[i];
		}
	}

	public static void main(String[] args) {
		int arr[] = {2,13,4,1,3,6,28};
		mergeSort(arr);
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

}
