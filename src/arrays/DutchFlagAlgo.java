package arrays;

public class DutchFlagAlgo {
	
	public static void sort(int arr[]) {
		int start = 0;
		int end = arr.length-1;
		for(int i = 0; i<=end; i++) {
			if(arr[i]==0) {
				int temp = arr[start];
				arr[start] = arr[i];
				arr[i] = temp;
				start++;
			}else if(arr[i]==2) {
				int temp = arr[end];
				arr[end] = arr[i];
				arr[i] = temp;
				end--;
			} 
		}
		
	}

	public static void main(String[] args) {
		int arr[] = {0, 1, 2 ,0 ,1 ,2, 0};
		sort(arr);
		for(int i : arr) {
			System.out.print(i + " ");
		}

	}

}
