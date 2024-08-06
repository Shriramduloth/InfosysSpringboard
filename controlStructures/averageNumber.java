import java.lang.module.FindException;

class calculator {
    public double findAverage(int number1, int number2, int number3) {
        double average = (double)(number1 + number2 + number3) / 3;
        return average;
    }
}

public class averageNumber {
    public static void main(String[] args) {
        calculator c = new calculator();
        double res= c.findAverage(10, 13, 14);
        double average= Math.round(res*100.0)/100.0;
        System.out.println(average);
        
    }
}
