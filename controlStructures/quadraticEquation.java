package controlStructures;

import java.util.Scanner;

public class quadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        double a=sc.nextDouble();
        System.out.println("Enter the value of b: ");
        double b=sc.nextDouble();
        System.out.println("Enter the value of c: ");
        double c=sc.nextDouble();

        double d = b*b-4*a*c;

        if(d<0){
            System.out.println("the roots are not real");
        }
        else if(d>0){
            double root1 = (-b+Math.sqrt(d))/(2*a);
            double root2 = (-b-Math.sqrt(d))/(2*a);

            System.out.println("The roots are :"+root1+" &"+root2);

        }
        else{
           double root= -b/(2*a);
           System.out.println("The roots are :"+root +" &"+root);

        }
    }
}
