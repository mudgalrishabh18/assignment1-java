//2.WAP to accept the First name , Middle Name and Last Name of a person and display full name  and Short Name 
//(eq- Amar Kumar Singh-   A.K.S)
package assignment1;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the first name- ");
		String f = sc.nextLine();
		System.out.print("Enter the middle name- ");
		String m = sc.nextLine();
		System.out.print("Enter the last name- ");
		String l= sc.nextLine();
		System.out.println("Your full name is "+f+" "+m+" "+l+" ");
		System.out.println("Short name is "+f.charAt(0)+"."+m.charAt(0)+"."+l.charAt(0)+".");
		sc.close();
	}

}
