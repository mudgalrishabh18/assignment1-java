package assignment1;

import java.util.Scanner;

public class TitleCase2 {

public static void main(String args[])
{
    Scanner in = new Scanner(System.in);
    System.out.println("ent");

    String s=in.nextLine();
    String str =" ";        
    char a ;

    for(int i =0;i<s.length()-1;i++)
    {
        a = s.charAt(i);
        if(a==' ')
        {
            str = str+(+ Character.toUpperCase(s.charAt(i+1)));
        }
        else
        {
            str =str+(+Character.toLowerCase(a));
        }

    }

   // for(int i =0; i<s.length();i++)
    //{
        System.out.println(str);
    //}
}

}
