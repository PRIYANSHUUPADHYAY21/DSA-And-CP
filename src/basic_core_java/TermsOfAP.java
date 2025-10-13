package basic_core_java;

public class TermsOfAP {

	
	public static void termsOfAP(int n) {
		int i = 1;
		int j = 1;
		while(i<=n) {
			if((3*j + 2)%4==0) {
				j++;
			}else {
				System.out.print(3*j + 2 + " ");
				i++;
				j++;
			}
		}
	}
	
	public static void main(String[] args) {
		termsOfAP(40);

	}

}
