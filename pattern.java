package newpackage;
import java.util.Arrays;
public class javapattern {
    public static void main(String[] args) {
        String s="JAVA";int k;
        char[] ch=s.toCharArray();
        for(int i=1;i<=5;i++){
            k=i-1;
            for(int j=1;j<=4;j++){
                //char c=s.charAt(j-1);
                
                if(i>1 && j>5-i){
                    System.out.print(Character.toLowerCase(ch[j-1]));
                }
                else{
                    k++;
                    System.out.print(ch[j-1]);
                }
                
            }
         k--;
         System.out.println();
         rotate.rot(ch,k);
        }
        
    }
}
