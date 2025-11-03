package _06_TimeAndSpaceComplexity;

import java.util.Arrays;

public class MaximumProfit {
	
	public static int maximumProfit(int budget[]) {
		Arrays.sort(budget);
		int n = budget.length;
		int profit = budget[0]*n;
		for(int i = 1; i<n; i++) {
			int p = budget[i]*(n-i);
			if(p>profit) {
				profit = p;
			}
		}
		
		return profit;
	}

	public static void main(String[] args) {
		int arr[] = {8,1,2,7,1,5,6,1,6,6};
		System.out.println(maximumProfit(arr));
	}

}
