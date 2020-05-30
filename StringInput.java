//1.WAP to accept a String from User and Display it Back on Screen
package assignment1;

import java.util.Scanner;

public class StringInput {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter any string- ");
		String s = sc.nextLine();
		System.out.println("You entered this string -"+s);
		sc.close();
	}

}
