package recursion;

public class StringToNumber {
	
	public static int convertStringToInt(String input) {
		if(input.length()==1) {
			return input.charAt(0)-'0';
		}
		int n = input.length()-1;
		return (input.charAt(0)-'0')*((int)Math.pow(10, n)) + convertStringToInt(input.substring(1));
		
	}

	public static void main(String[] args) {
		int ans = convertStringToInt("00123450");
		System.out.println(ans);
	}

}
