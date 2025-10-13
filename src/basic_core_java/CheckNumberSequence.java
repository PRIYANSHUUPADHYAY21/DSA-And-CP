package basic_core_java;

public class CheckNumberSequence {
	
	public static boolean checkNumberSequence(int arr[]) {
		boolean valid = true;
		boolean increasing = false;
		for(int i = 1; i<arr.length; i++) {
			if(arr[i]<=arr[i-1]) {
				if(increasing || arr[i]==arr[i-1]) {
					valid = false;
					break;
				}
			}else {
				increasing = true;
			}
		}
		
		return valid;		
	}

	public static void main(String[] args) {
		int arr[] = {3,2,1};
		boolean ans =checkNumberSequence(arr);
		System.out.println(ans);

	}

}
