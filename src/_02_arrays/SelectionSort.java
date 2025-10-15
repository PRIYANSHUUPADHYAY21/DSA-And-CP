package _02_arrays;

public class SelectionSort {
	
	public static void selectionSort(int arr[]) {
		for(int i = 0; i<arr.length-1; i++) {
			int min = arr[i];
			int minIndex = i;
			for(int j = i+1; j<arr.length; j++) {
				if(arr[j]<min) {
					min = arr[j];
					minIndex = j;
				}
			}
			if(minIndex!=i) {
				arr[minIndex] = arr[i];
				arr[i] = min;				
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {3,2,6,5,4,2,1,2,9};
		selectionSort(arr);
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

}
