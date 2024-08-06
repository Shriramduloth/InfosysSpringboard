package controlStructures;

import java.util.Scanner;

class customerInput {
    Scanner sc = new Scanner(System.in);
    String foodType;
    int quan = 1;
    int dist;
    int deliveryCharge = 0;

    public void userInput() {
        System.out.println("Enter Food Type : \n V : for vegetarian \n N : for Non-vegetarain ");
        foodType = sc.nextLine();
        System.out.println("Enter Quantity (No. of plates) : ");
        quan = sc.nextInt();
        System.out.println("Enter distance from your address (in KM) : ");
        dist = sc.nextInt();
        if (dist < 0) {
            System.out.println("Inavlid input");
        }
    }

    public void calculation() {
        customerInput c = new customerInput();
        c.userInput();
        
        int exepCost = 0;
        if(c.quan>0 || (c.foodType.equalsIgnoreCase("n")&&c.foodType.equalsIgnoreCase("v")) ){
            System.err.println("Generating bill ::");
        }
        else{
            exepCost = -1;
            System.out.println("toal payable amount : "+exepCost);
        }

        if (c.dist <= 3) {
            deliveryCharge = deliveryCharge;
        } else if (c.dist > 3 && c.dist <= 6) {
            deliveryCharge = (c.dist - 3) * 1;
        } else {
            deliveryCharge = (c.dist - 6) * 2 + 3;
        }
        String  v= "v";

        boolean flag= c.foodType.equalsIgnoreCase(v);
        if (flag==true) {
            exepCost = 12 * c.quan + deliveryCharge;
        } else {
            exepCost = 15 * c.quan + deliveryCharge;
        }
        System.out.println("\t\t\t Bill");
        System.out.println("Food Type   Quantity Ordered    Distance   || Total Amount");
        System.out.println("   "+c.foodType+"\t\t " +c.quan+"\t\t   "+c.dist+"\t\t  "+exepCost);
    }
}

public class foodCorner {
    public static void main(String[] args) {
        customerInput ci = new customerInput();
        ci.calculation();
        

    }
}
