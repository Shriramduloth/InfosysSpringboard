
/**
 * reverseString
 */
import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be reversed : ");
        String input = sc.nextLine();
        StringBuffer Output = new StringBuffer("");
        String sarr[] = input.split(" ");
        for (int j = sarr.length - 1; j >= 0; j--) {
            for (int i = sarr[j].length() - 1; i >= 0; i--) {
                Output = Output.append(sarr[j].charAt(i));
            }
            Output = Output.append(" ");
        }
        System.out.println(Output);
    }
}