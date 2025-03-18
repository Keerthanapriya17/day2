package core;

import java.util.Scanner;

public class Switchcasestatement {

	public static void main(String[] args) {
	 
		Scanner in = new Scanner(System.in);
		 System.out.println("Enter the character(a to z):");
		 char c=in.next().charAt(0);
		 if(c=='a'  || c=='e' || c=='i' || c=='o' || c=='u') {
			 System.out.println(c + " is a vowel...");
		 }else {
			 System.out.println(c + "  is a constant..");
		 }
		 
//Switchcase		  
		 switch (c) {
		 case'a':{
			 System.out.println("is a vowel");
			 break;}
			 case'e':{
				 System.out.println("is a vowel");
				 break;}
				 case'i':{
					 System.out.println("is a vowel..");
					 break;}
					 case'o':{
						 System.out.println("is a vowel..");
						 break;}
						 case'u':{
							 System.out.println("is a vowel..");
							 break;
						 }
						 default
						  
							 
						 
					 }
				 }
				 
			 
		 
		 }

	


