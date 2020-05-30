//3.WAP to accept a String and Count number of Capital letters present in it.(eq- ComPuter - 2)
package assignment1;

import java.util.Scanner;

public class CountCap {
	static int count=0;
	public static void main(String[] a) {
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter any string- ");
	String s = sc.nextLine();
	for(int i=0;i<s.length();i++) {
		  char ch = s.charAt(i); 
		if(ch >= 'A' && ch <= 'Z') {
			count++;
		}
	}
	 System.out.println("Upper case letters : " + count);
		sc.close();
}
}
