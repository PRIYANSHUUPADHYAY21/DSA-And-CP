package _03_strings;

public class CheckPermutation {
	
	public static boolean isPermutation(String str1, String str2) {
		int frequency[] = new int[256];
		for(int i = 0; i<str1.length(); i++) {
			frequency[str1.charAt(i)] += 1;
		}
		for(int i = 0; i<str2.length(); i++) {
			frequency[str2.charAt(i)] -= 1;
		}
		for(int i : frequency) {
			if(i!=0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		boolean ans = isPermutation("abcde", "bcdeda");
		System.out.println(ans);

	}

}
