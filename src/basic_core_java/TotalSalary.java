package basic_core_java;

import java.util.Scanner;

public class TotalSalary {
	
	public static void totalSalary(int basicSalary, char grade) {
		double hra = (20.0*basicSalary)/100;
		double da = (50.0*basicSalary)/100;
		double pf = (11.0*basicSalary)/100;
		int allow = 0;
		if(grade=='A') {
			allow = 1700;
		}else if(grade=='B') {
			allow =1500;
		}else {
			allow = 1300;
		}
		
		double totalSalary = basicSalary + hra + da + allow - pf;
		int roundedSalary = (int)(Math.round(totalSalary));
		System.out.println(roundedSalary);
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String str = s.next();
		char grade = str.toUpperCase().charAt(0);
		totalSalary(n, grade);
		
	}

}
