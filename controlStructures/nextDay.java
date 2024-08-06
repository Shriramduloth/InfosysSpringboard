package controlStructures;

import java.util.Scanner;

public class nextDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter date:");
        int day = sc.nextInt();
        if (day > 31 || day < 1) {
            System.out.println("Enter valid date: ");
            day = sc.nextInt();
        }
        System.out.println("enter month:");
        int month = sc.nextInt();
        if (month > 12 || month < 1 || month == 2 && day > 29
                || (month == 6 || month == 4 || month == 9 || month == 11) && day > 30) {
            System.out.println("Enter valid month: ");
            month = sc.nextInt();
        }
        System.out.println("enter year:");
        int year = sc.nextInt();
        if (year > 9999 || year < 1000) {
            System.out.println("Enter valid year: ");
            day = sc.nextInt();
        }

        int nextDay=day+1;
        if (year%400==0 ||year%4==0 &&year%100!=0)
        {
            if(month==2&&nextDay==30){
                nextDay=01;
                month =03;
            }
        }
        if (year%400!=0 ||year%4!=0 &&year%100==0)
        {
            if(month==2&&nextDay==29){
                nextDay=01;
                month =03;
            }
        }
        
        

        if(nextDay==32&&(month==1||month==3||month==5||month==7||month==8||month==10||month==12))
        {
            nextDay =01;
            month=month+1;
        }
        if(nextDay==31&&(month==4||month==6||month==9||month==11))
        {
            nextDay=01;
            month= month+1;
        }
        

        
           System.out.println(nextDay+"-"+month+"-"+year); 
    }
}
