package core;

import java.util.Scanner;

public class controlstatement {

	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter the marital status:(married/unmarried)");
	String ms=in.nextLine().toLowerCase();
	 if(ms.equals("married")) {
   System.out.println("You are eligible for insurance...");  		
	}else if(ms.equals("unmarried")) {
		System.out.println("Enter the below details...");
		System.out.println("Enter the gender:(male/female):");
		String gender=in.nextLine().toLowerCase();
		
		if(gender.equals("male")) {
		}else if(gender.equals("female")) {
		}else {
			System.out.println("Invaild gender input...");
		}
		System.out.println("Enter your age:(male/female)");
		int age=in.nextInt();
		
	if(ms.equals("male>=30")) {
		System.out.println("Enter your age:");
	}else if(ms.equals("female>=25")) {
		System.out.println("Enter your age:");
	}
		System.out.println("You are not eligible for insurance....");
		
	}
	}

}
