import java.util.Scanner;

public class lcm {
    public static int lcm(int first_num, int second_num) {
        int x, max = 0, min = 0, lcm = 0;
        if (first_num > second_num) {
            max = first_num;
            min = second_num;
        } else {
            max = second_num;
            min = first_num;
        }

        for (int i = 1; i <= min; i++) {
            x= max*i;
            if(x%min==0){
                lcm=x;
                break;
            }
        }
        return lcm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();

        System.out.println("LCM of nubmers is :" + lcm(num1, num2));

    }
}
