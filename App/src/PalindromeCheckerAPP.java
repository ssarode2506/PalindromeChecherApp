import java.util.Scanner;
public class PalindromeCheckerAPP {

    /*
UC2:PalindromeCheckerApp
@author Suchandh
@version 1.0
 */


        public static void main(String[] args){
            String name="madam";
            String reverse="";
            for(int i=name.length()-1;i>=0;i--){
                reverse=reverse+name.charAt(i);
            }
            boolean ispalindrome=name.equals(reverse);
            System.out.println("Input text : "+name);
            System.out.println("Reversed text : "+reverse);
            System.out.print("Is it a Palindrome? : "+ ispalindrome);

        }

}


