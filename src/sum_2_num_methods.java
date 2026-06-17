package src;

import java.util.Scanner;

public class sum_2_num_methods {
    public static void main(String[] args) {
        int ans = sum2(); // function called
        System.out.println(ans);
    }

    // now with using return statement
    static int sum2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1:");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2:");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        return sum; // in any function or method when return statement hits, then the function is completed it's job, anything after this will no be executable(unreachable code).
       
    }

  /*access modifier*/static  /*return_type*/void  /*function/method name*/sum() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1:");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2:");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println(sum);

    }


}
