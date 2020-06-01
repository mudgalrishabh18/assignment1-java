//WAP to accept a String and Display it in Title Case
package assignment1;

import java.util.Scanner;

public class TitleCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string");
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(i==0&&ch[i]!=' '||ch[i]!=0&&ch[i-1]==' ') {
				if(ch[i]>='a'&&ch[i]<='z') {
					 ch[i] = (char)(ch[i] - 'a' + 'A'); 
				}
			}
			 else if (ch[i] >= 'A' && ch[i] <= 'Z') {  
				  
	      
	                ch[i] = (char)(ch[i] + 'a' - 'A');   
		}
		
		}
		  String st = new String(ch);
		  System.out.println(st);

	}

}
