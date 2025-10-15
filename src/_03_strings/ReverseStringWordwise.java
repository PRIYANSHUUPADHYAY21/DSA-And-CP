package _03_strings;

public class ReverseStringWordwise {
	
	public static String reverse(String str) {
		String reversed = "";
		int start = 0;
		for(int i = start+1; i<=str.length(); i++) {
			if(i==str.length() || str.charAt(i)==' ') {
				reversed = str.substring(start, i)  +" " + reversed;
				start = i+1;
			}
		}
		return reversed;
	}

	public static void main(String[] args) {
		String str = "what is your name";
		String reversedString = reverse(str);
		System.out.println(reversedString);
	}

}
