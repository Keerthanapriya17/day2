package core;

import java.util.Scanner;

public class inputandoutput {

	public static void main(String[] args) {
		
		System.out.println("hello");
		
        Scanner in = new Scanner (System.in);
        
  //Number type
        /*
         System.out.println("Get Integer input:");
         int a=in.nextInt();
         System.out.println("Get byte input:");
         byte b=in.nextByte();
         System.out.println("Get short input:");
         short c=in.nextShort();
         System.out.println("Get long input:");
         long d=in.nextLong();
         
         System.out.println("Integer input:"+a);
         System.out.println("Byte input:"+b);
         System.out.println("Short input:"+c);
         System.out.println("Long input:"+d);
         */
        
//Float and Double type
        /*
        
        System.out.println("Get float input:");
        float e= in.nextFloat();
        System.out.println("Get double input:");
        double f=in.nextDouble();
        
        System.out.println("Float input:"+e);
        System.out.println("Double input:"+f);
        */
        
 //Boolean type
        /*
        System.out.println("Get boolean input:");
        boolean g=in.nextBoolean();
        
        System.out.println("Boolean input:"+g);
        */
       
 //character type
        /*
       System.out.println("Get character input:");
       char h=in.next().charAt(0); 
        
       System.out.println("Character input:"+h);
       */
        
     System.out.println("Enter your name:");
     String name=in.nextLine();
     
        
        
     }

}
