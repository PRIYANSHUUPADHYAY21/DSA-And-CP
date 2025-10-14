package arrays;

public class MergeTwoSortedArrays {
	
	public static int[] mergeTwoSortedArrays1(int arr1[], int arr2[]) {
		int n = arr1.length + arr2.length;
		int arr[] = new int[n];
		int j = 0;
		 int k = 0;
		for(int i = 0; i<n; i++) {
			if(j>arr1.length-1) {
				arr[i] = arr2[k];
				k++;
			}else if(k>arr2.length-1) {
				arr[i] = arr1[j];
				j++;
			}else if(arr1[j]<arr2[k]) {
				arr[i] = arr1[j];
				j++;
			}else {
				arr[i] = arr2[k];
				k++;
			}
		}
		return arr;
	}
	
	public static int[] mergeTwoSortedArrays2(int arr1[], int arr2[]) {
		int n = arr1.length + arr2.length;
		int arr[] = new int[n];
		int i = 0, j = 0, k = 0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				arr[k] = arr1[i];
				k++;
				i++;
			}else {
				arr[k] = arr2[j];
				k++;
				j++;
			}
		}
		
		while(i<arr1.length) {
			arr[k] = arr1[i];
			k++;
			i++;
		}
		while(j<arr2.length) {
			arr[k] = arr2[j];
			k++;
			j++;
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr1[] = {0,1,3,5,7,9};
		int arr2[] = {0,2,4,6,8};
		int arr[] = mergeTwoSortedArrays2(arr1, arr2);
		for(int i : arr) {
			System.out.print(i + " ");
		}

	}

}
