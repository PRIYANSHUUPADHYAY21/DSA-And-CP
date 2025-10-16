package _04_2d_Arrays;

public class RowwiseSum {
	
	public static void rowwiseSum(int mat[][]) {
		for(int i = 0; i<mat.length; i++) {
			int sum = 0;
			for(int j = 0; j<mat[0].length; j++) {
				sum += mat[i][j];
			}
			System.out.print(sum + " ");
		}
	}

	public static void main(String[] args) {
		int mat[][] = {{1, 2 ,3 ,4 },{3, 4 ,5 ,6 },{9, 8 ,7 ,6 },{-1, 1 ,-10 ,5}};
		rowwiseSum(mat);

	}

}
