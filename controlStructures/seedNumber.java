import java.util.Scanner;

public class seedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers  : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int multiplyDigit = 1;
        int temp = a;
        while (temp > 0) {
            multiplyDigit *= temp % 10;
            temp /= 10;
        }
        if (multiplyDigit == 0) {
            System.out.println(a + " is not a seed of " + b);
        } else if (a * multiplyDigit == b) {
            System.out.println(a + " is a seed of " + b);
        } else {
            System.out.println(a + " is not a seed of " + b);
        }
    }
}
