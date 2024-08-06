package controlStructures;

import java.util.Scanner;

/*Implement a program to calculate the product of three positive integer values.
 However, if one of the integers is 7, consider only the values to the right of 7 for calculation. 
 If 7 is the last integer, then display -1.

Note: Only one of the three values can be 7. */
public class productPositive7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        System.out.println("enter three number for product calculation (you can enter 7 only single time): ");
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        int d=7;
        if((a==7 && b==7 )||(b==7 && c==7)||(a==7&&c==7)){
            System.out.println("Enter 7 only single time among three inputs");
        }
        if(a!=7 && b!=7 && c !=7)
        {
            System.out.println("Product is : "+(a*b*c));
        }

        else if(a==7){
            System.out.println("Product is : "+(b*c));
        }
        else if(b==7){
            System.out.println("Product is : "+(c));
        }
        else{
            System.out.println("Product is : "+(-1));
        }
    }
}
