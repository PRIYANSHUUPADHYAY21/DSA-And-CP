package basic_core_java;

public class SumOfEvenOddDigits {
	
	
	public static void sumOfEvenAndOddDigits(int n) {
		int oddSum = 0;
		int evenSum = 0;
		for(int i = n; i>0; i /=10) {
			int rem = i%10;
			if(rem%2==0) {
				evenSum += rem;
			}else {
				oddSum += rem;
			}
		}
		System.out.println("Even digits sum : " + evenSum + " , Odd digits sum : " + oddSum);
	}
	
	public static void main(String[] args) {
		
		sumOfEvenAndOddDigits(552245);
		
	}

}
