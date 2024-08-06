package controlStructures;

import java.util.Scanner;

class customer {
    int accNo;
    int salary;
    int accBalance;
    String loanType;
    int expectedLoanAmount;
    int emiExpected;
    int n = 0;

    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.println("Enter account number of the customer :");
        accNo = sc.nextInt();
        if (accNo < 1000) {
            System.out.println("Enter valid acoount number");
            accNo = sc.nextInt();
        }
        System.out.println("Enter salary:");
        salary = sc.nextInt();
        System.out.println("Enter account balance of the customer :");
        accBalance = sc.nextInt();
        System.out.println("Enter loan type : eg. car / home / business :");
        sc.nextLine();
        loanType = sc.nextLine();
        System.out.println("Enter expected loan amount :");
        expectedLoanAmount = sc.nextInt();
        System.out.println("Enter expected number of emi :");
        emiExpected = sc.nextInt();

    }

    public void caluclation() {
        // car loan
        if (salary >= 25000 && salary < 50000) {
            if (expectedLoanAmount <= 500000 && emiExpected <= 36) {
                System.out.println("Yes you are elgible for car loan");
        System.out.println("Eligible loan amount : 500000");
        System.out.println("Eligible no. of emi : 36");
            }
        }
        else if(salary >= 50000 && salary<75000){
            System.out.println("Yes you are elgible for home loan");
        System.out.println("Eligible loan amount : 6000000");
        System.out.println("Eligible no. of emi : 60");
        }
        else{
            System.out.println("Yes you are elgible for Business loan loan");
        System.out.println("Eligible loan amount : 7500000");
        System.out.println("Eligible no. of emi : 84");
        }
    }

   
}

}

public class bankLoan {
    public static void main(String[] args) {
        customer c = new customer();
        c.input();
        c.caluclation();
    }
}
