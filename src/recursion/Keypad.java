package recursion;

public class Keypad {
	
	public static String[] keypad(int n) {
		if(n==0 || n==1) {
			String arr[] = {""};
			return arr;
		}
		String str = helper(n%10);
		String[] smallAns = keypad(n/10);
		String[] newArr = new String[str.length()*smallAns.length];
		int k = 0;
		for(int i = 0; i<smallAns.length; i++) {
			for(int j = 0; j<str.length(); j++) {
				newArr[k] = smallAns[i] + str.charAt(j);
				k++;
			}
		}
		return newArr;
	}
	
	private static String helper(int n) {
		switch(n){
		case 2 : return "abc";
		case 3 : return "def";
		case 4 : return "ghi";
		case 5 : return "jkl";
		case 6 : return "mno";
		case 7 : return "pqrs";
		case 8 : return "tuv";
		case 9 : return "wxyz";
		
		default : break;
		}
		return "";
	}

	public static void main(String[] args) {
		String arr[] = keypad(12);
		for(String i : arr) {
			System.out.print(i + " ");
		}
	}

}
