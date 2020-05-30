//6.WAP of Java String Comparison 2 String
package assignment1;

import java.util.Scanner;

public class StringComparison {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string1- ");
		String s1=sc.nextLine();
		System.out.print("Enter string2- ");
		String s2=sc.nextLine();
		if(s1.equals(s2)) {
			System.out.println("String are equal");
		}else {
			System.out.println("String are not equal");
		}
	sc.close();
	}

}
