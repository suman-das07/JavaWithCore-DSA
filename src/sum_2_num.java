package src;

import java.util.Scanner;

public class sum_2_num{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter a value for A: ");
        int a= sc.nextInt();

        System.out.print("Enter a value for B: ");
        int b= sc.nextInt();

        int sum= a+b;

        System.out.println("Sum of A + B: "+ sum);
    }
}

