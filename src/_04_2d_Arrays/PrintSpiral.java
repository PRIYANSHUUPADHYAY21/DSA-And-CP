package _04_2d_Arrays;

public class PrintSpiral {
	
	public static void printSpiral(int arr[][]) {
		if(arr.length==0 || arr[0].length==0) {
			return;
		}
		int count = 0;
		int totalElements = arr.length * arr[0].length;
		int rowstart = 0;
		int colstart = 0;
		int rowend = arr.length-1;
		int colend = arr[0].length-1;
		while(count<totalElements) {
			for(int i = colstart; count<totalElements && i<=colend; i++) {
				System.out.print(arr[rowstart][i] + " ");
				count++;
			}
			rowstart++;
			for(int i = rowstart; count<totalElements && i<=rowend; i++) {
				System.out.print(arr[i][colend] + " ");
				count++;
			}
			colend--;
			for(int i = colend; count<totalElements && i>=colstart; i--) {
				System.out.print(arr[rowend][i] + " ");
				count++;
			}
			rowend--;
			for(int i = rowend; count<totalElements && i>=rowstart; i--) {
				System.out.print(arr[i][colstart] + " ");
				count++;
			}
			colstart++;
		}
	}

	public static void main(String[] args) {
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		printSpiral(arr);
	}

}
