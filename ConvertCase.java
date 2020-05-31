//WAP to accept a String and Convert the case of each alphabet present in it
package assignment1;

import java.util.Scanner;

public class ConvertCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any string- ");
		String s1=sc.nextLine();
		
	
	        StringBuffer newStr=new StringBuffer(s1);  
	          
	        for(int i = 0; i < s1.length(); i++) {  
	              
	            //Checks for lower case character  
	            if(Character.isLowerCase(s1.charAt(i))) {  
	                //Convert it into upper case using toUpperCase() function  
	                newStr.setCharAt(i, Character.toUpperCase(s1.charAt(i)));  
	            }  
	            //Checks for upper case character  
	            else if(Character.isUpperCase(s1.charAt(i))) {  
	                //Convert it into upper case using toLowerCase() function  
	                newStr.setCharAt(i, Character.toLowerCase(s1.charAt(i)));  
	            }  
	        }  
	        System.out.println("String after case conversion : " + newStr);  
	     


	}

}
