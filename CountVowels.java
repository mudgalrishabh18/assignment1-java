//4.WAP to accept a string and count number of Vowels present in it
package assignment1;

import java.util.Scanner;

public class CountVowels {
static int count=0;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter any string- ");
		String s = sc.nextLine();
		for(int i=0;i<s.length();i++) {
			  char ch = s.charAt(i); 
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				count++;
			}
		}
		 System.out.println("Vowels letters : " + count);
			sc.close();
		
	}

}
