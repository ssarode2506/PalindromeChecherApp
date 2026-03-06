/*
 *UC11: Object-Oriented Palindrome Service
 *
 * @author suchandh sarode
 * @version 11.0
 */
import java.util.LinkedList;
class PalindromeService {
    public boolean checkPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
public class PalindromeCheckerAPP {
    public static void main(String[] args) {
        String input = "racecar";
        PalindromeService service = new PalindromeService();
        boolean isPalindrome = service.checkPalindrome(input);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}
