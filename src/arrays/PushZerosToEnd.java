package arrays;

public class PushZerosToEnd {

	public static void pushToEnd(int arr[]) {
		int k = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]!=0) {
				int temp = arr[k];
				arr[k] = arr[i];
				arr[i] = temp;
				k++;
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {2,0,0,1,0,1,0,5,6,4,8,9,0,1};
		pushToEnd(arr);
		for(int i : arr) {
			System.out.print(i + " ");
		}

	}

}
