package src;

import java.util.Scanner;

public class large_num {
    public static void main(String[] args) {
        Scanner lg = new Scanner(System.in);

        System.out.print("Enter number A: ");
        int a = lg.nextInt();

        System.out.print("Enter number B: ");
        int b = lg.nextInt();

        System.out.print("Enter number C: ");
        int c = lg.nextInt();

        int large = a;

        if (b > large) {
            large = b;
        }
        if (c > large) {
            large = c;
        }
        System.out.println("Largest Number is: " + large);

    }
}
