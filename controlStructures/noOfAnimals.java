import java.util.Scanner;

public class noOfAnimals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of heads: ");
        int heads = sc.nextInt();
        System.out.println("Enter no. of legs: ");
        int legs = sc.nextInt();

        // assume all heads are chicken

        int chicken_leg = heads * 2;

        if (chicken_leg <= legs) {
            int rabbit_leg = (legs - chicken_leg);
            int rabbit = rabbit_leg / 2;
            int chicken = heads - rabbit;

            if (chicken < 0 || rabbit < 0) {
                System.out.println("Invalid input");
            } else if (legs - (rabbit * 4 + chicken * 2) != 0) {
                System.out.println("Invalid input");
            } else {

                System.out.println("Number of chicken : " + chicken);
                System.out.println("Number of rabbit : " + rabbit);
            }

        } else {
            System.out.println("Invalid input");
        }

    }
}
