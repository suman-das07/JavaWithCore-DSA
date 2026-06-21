package src;

import java.util.Scanner;

public class armstrong_methods {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // System.out.println("enter a number: ");
        // int num= sc.nextInt();
        // System.out.println(isArmstrong(num));
        for (int i = 100; i <= 999; i++) {

            if (isArmstrong(i)) {
                System.out.println(i);
            }

        }
    }

    static boolean isArmstrong(int n){
        int og=n;
        int sum=0;

        while (n>0){
            int dig= n%10;
            sum+=(dig*dig*dig);
            n/=10;
        }
        
        return sum==og;
    }
}




