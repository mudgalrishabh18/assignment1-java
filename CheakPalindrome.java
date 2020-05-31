package assignment1;

import java.util.Scanner;

public class CheakPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any string- ");
		String s1=sc.nextLine();
		
		String reverse="";
		for(int i=s1.length()-1;i>=0;i--) {
			reverse=reverse+s1.charAt(i);
			
		}
		if(s1.equals(reverse)) {
			System.out.println("They are palindrome");
			
		}else {
			System.out.println("They are not palidrome");
		}

	}

}
