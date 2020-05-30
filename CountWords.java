//WAP to accept a string and count number of Words Present in it.
package assignment1;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		int count=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any string- ");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch==' ') {
				count++;
			}
		}
		System.out.println("Number of words in string are -"+count);
		sc.close();
	}

}
