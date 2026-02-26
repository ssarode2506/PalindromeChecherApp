import java.util.Scanner;
public class PalindromeCheckerAPP {

    /*
UC2:PalindromeCheckerApp
@author Suchandh
@version 1.0
 */

        public static void main(String[] args){
           Scanner sc= new Scanner(System.in);
            String input="madam";
           boolean ispalindrome=true;
           int length=input.length();
           for (int i=0;i<input.length()/ 2 ;i++){
               if(input.charAt(i)!=input.charAt(input.length()-1-i)) {
                   ispalindrome = false;
                   break;
               }
           }
           System.out.println("input text: "+input);
           System.out.println("it is palindrome? :" +ispalindrome);

        }
    }

