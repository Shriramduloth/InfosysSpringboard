
/**
 * InnerevenOROdd
 */
import java.util.Scanner;

public class evenOROdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check evn or odd property: ");
        int num = sc.nextInt();
        if ((num % 2) == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}