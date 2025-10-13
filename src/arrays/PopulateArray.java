package arrays;

public class PopulateArray {
	
	public static void populateArray(int arr[], int n) {
		int index = 0;
		int j = 1;
		while(j<n) {
			arr[index] = j;
			j += 2;
			index++;
		}
		if(j==n) {
			arr[index] = j;
			index++;
		}
		j--;
		while(j>=2) {
			arr[index] = j;
			j -= 2;
			index++;
		}
	}

	public static void main(String[] args) {
		int arr[] = new int[5];
		populateArray(arr, 5);
		for(int i : arr) {
			System.out.print(i + " ");
		}

	}

}
