package _05_recursion;

public class QuickSort {
	
	public static void quickSort(int arr[]) {
		quickSort(arr, 0, arr.length-1);
	}
	
	private static void quickSort(int[] input, int startIndex, int endIndex) {
		if(startIndex>=endIndex) {
			return;
		}
		
		int pivotPosition = partition(input, startIndex, endIndex);
		quickSort(input, startIndex, pivotPosition-1);
		quickSort(input, pivotPosition+1, endIndex);
		
	}
	
	private static int partition(int arr[], int start, int end) {
		int pivot = arr[start];
		int count = 0;
		for(int i = start+1; i<=end; i++) {
			if(arr[i]<=pivot) {
				count++;
			}
		}
		int pivotPosition = count + start;
		arr[start] = arr[pivotPosition];
		arr[pivotPosition] = pivot;
		
		int j = start;
		int k = end;
		while(j<pivotPosition && k>pivotPosition) {
			if(arr[j]<=pivot) {
				j++;
			}else if(arr[k]>pivot) {
				k--;
			}else {
				int temp = arr[j];
				arr[j] = arr[k];
				arr[k] = temp;
				j++;
				k--;
			}
		}
		return pivotPosition;
	}

	public static void main(String[] args) {
		int arr[] = {4,3,8,4,6,5};
		quickSort(arr);
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

}
