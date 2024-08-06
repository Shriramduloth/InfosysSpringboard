import java.util.Scanner;

public class divisibleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a positive integer :");
        int num = sc.nextInt();
        int sumDigit = 0;
        int temp = num;
        while (temp > 0) {
            sumDigit += temp % 10;
            temp /= 10;
        }

        if (sumDigit == 0) {
            System.out.println("The sum of digits is zero. Cannot divide by zero.");
        } else if (num % sumDigit == 0) {
            System.out.println(num + " is divisible by sum of digits = " + sumDigit);
        } else {
            System.out.println(num + " is not divisible by sum of digits " + sumDigit);
        }

    }
}
