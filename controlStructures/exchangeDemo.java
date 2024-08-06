package controlStructures;

import java.util.Scanner;

public class exchangeDemo {
    public static void main(String[] args) {
        int x, y; // x = no. of $5 notes, y= no. of $1 notes
        int a = 5;
        int b = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter $1 notes available : ");
        y = sc.nextInt();
        System.out.println("enter $5 notes available : ");
        x = sc.nextInt();

        System.out.println("Enter Purchase amount : ");
        int pa = sc.nextInt();

        int r1 = pa/5;
        int r2 = pa%5;


        if(r1<=x &&r2<=y)
        {
            System.out.println("No of $1 notes used : " +r2);
            System.out.println("No of $5 notes used : "+r1);

        }
        else{
            System.out.println("-1");
        }

    }
}
