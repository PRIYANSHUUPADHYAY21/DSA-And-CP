package _03_strings;

public class RemoveAllConsecutiveDuplicates {
	
	public static String removeConsecutiveDuplicates(String str) {
		char c = str.charAt(0);
		String ans = "" + c;
		for(int i = 1; i<str.length(); i++) {
			if(str.charAt(i)!=c) {
				ans += str.charAt(i);
				c = str.charAt(i);
			}
		}
		
		return ans;
	}

	public static void main(String[] args) {
		String str = "aaaaccccbbbbb";
		System.out.println(removeConsecutiveDuplicates(str));

	}

}
