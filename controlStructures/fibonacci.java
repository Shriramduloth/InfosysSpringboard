/**
 * temperatur converter
 */
import java.util.*;

public class temperatureConverter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius :");
        Double tmp_C=sc.nextDouble();
        Double tmp_F = tmp_C*9/5+32;
        System.out.println("Temperature in Fahrenheit is :" +tmp_F);
    }
}