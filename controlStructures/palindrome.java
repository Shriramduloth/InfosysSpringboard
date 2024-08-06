
/**
 * palindrome
 */
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word to check ,is it palindrome :  ");
        String input = sc.nextLine();
        String output = "";
        input = input.toLowerCase();
        char[] in = input.toCharArray();
        for (int i = in.length - 1; i >= 0; i--) {
            output = output + (in[i]);
        }
        if (input.equals(output)) {
            System.out.println("yes " + input + " is a palindrome");
        } else {
            System.out.println("no " + input + " is not a palindrome");
        }
    }
}