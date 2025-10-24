package recursion;

public class ReplacePI {
	
	public static String replace(String input) {
		if(input.length()<=1) {
			return input;
		}
		if(input.charAt(0)=='p' && input.charAt(1)=='i') {
			return "3.14" + replace(input.substring(2));
		}
		return input.charAt(0) + replace(input.substring(1));
	}

	public static void main(String[] args) {
		String str = replace("pipi");
		System.out.println(str);
	}

}
