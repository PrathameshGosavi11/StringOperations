import java.util.Scanner;

public class StringReverse {
    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.println("enter the String");
        String str1=s.nextLine();
        System.out.println("String is:"+str1);
        String reverse="";

        System.out.println("reverse String is");
        for(int i=str1.length()-1;i>=0;i--)
        {
            reverse +=str1.charAt(i);
            
        }
        System.out.println(reverse);
    }
}
