/*
 *UC12: Strategy Pattern for Palindrome Algorithms (Advanced)
 *
 * @author suchandh sarode
 * @version 11.0
 */
import java.util.LinkedList;
interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}
class TwoPointerStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
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

class PalindromeContext {
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String input) {
        return strategy.check(input);
    }
}

public class PalindromeCheckerAPP {
    public static void main(String[] args) {
        String input = "level";
        PalindromeContext context = new PalindromeContext();

        context.setStrategy(new StackStrategy());
        System.out.println("Using Stack Strategy: " + context.executeStrategy(input));

        context.setStrategy(new TwoPointerStrategy());
        System.out.println("Using Two-Pointer Strategy: " + context.executeStrategy(input));
    }
}