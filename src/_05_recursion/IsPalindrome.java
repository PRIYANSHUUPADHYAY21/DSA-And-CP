package _05_recursion;

public class IsPalindrome {
	
	public static boolean isPalindrome(String str) {
		return isPalindrome(str, 0);
	}
	
	private static boolean isPalindrome(String str, int index) {
		if(index==str.length()/2) {
			return true;
		}
		if(str.charAt(index)!=str.charAt(str.length()-index-1)){
			return false;
		}
		return isPalindrome(str, index+1);
	}

	public static void main(String[] args) {
		boolean b = isPalindrome("aazaa");
		System.out.println(b);
	}

}
