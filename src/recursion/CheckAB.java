package recursion;

public class CheckAB {
	
	public static boolean checkAB(String input) {
		if(input.length()==0) {
			return true;
		}
		if(input.length()==1) {
			return input.charAt(0)=='a';
		}
		if(input.charAt(0)!='a') {
			return false;
		}
		if(input.charAt(1)!='b' || input.length()==2) {
			return checkAB(input.substring(1));
		}else {
			if(input.subSequence(1, 3).equals("bb")) {
				return checkAB(input.substring(3));
			}else {
				return false;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(checkAB("ab"));

	}

}
