
/**
 * largeNumInArray
 */
import java.util.Scanner;

public class largeNumInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements of array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int Lnum = 0;
        for (int i : arr) {
            if (i > Lnum) {
                Lnum = i;
            }
        }
        System.out.print("Array is [");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("]");
        System.out.println();
        System.out.println("Largest number is " + Lnum);
    }
}