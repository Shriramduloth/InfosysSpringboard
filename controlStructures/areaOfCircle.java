
/**
 * areaOfCircle
 */
import java.util.Scanner;

public class areaOfCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int area;
        System.out.println("Enter the radius of circle  : ");
        int r = sc.nextInt();
        sc.nextLine();
        System.out.println("enter unit type of radius (m/cm):");
        String unit = sc.nextLine();
        String m = "m";
        String cm = "cm";
        area = (22 / 7) * r * r;

        if (unit.equalsIgnoreCase(m)) {
            System.out.println("Area of circle is " + area + " m^2");

        } else if (unit.equalsIgnoreCase(cm)) {
            System.out.println("Area of circle is " + area + " cm^2");
        } else {
            System.out.println("Please enter m for meter");
        }

    }
}