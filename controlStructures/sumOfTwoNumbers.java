
/**
 * sumOfTwoNumbers
 */

import java.util.Scanner;
public class sumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers for addition : ");
        int a = sc.nextInt();
        int b= sc.nextInt();

        System.out.println(a+b);
    }
}