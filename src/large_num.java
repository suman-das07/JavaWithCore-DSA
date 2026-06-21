package src;

import java.util.Scanner;

public class large_num {
    public static void main(String[] args) {
        // Scanner lg = new Scanner(System.in);

        // System.out.print("Enter number A: ");
        // int a = lg.nextInt();

        // System.out.print("Enter number B: ");
        // int b = lg.nextInt();

        // System.out.print("Enter number C: ");
        // int c = lg.nextInt();

        // int large = a;

        // if (b > large) {
        //     large = b;
        // }
        // if (c > large) {
        //     large = c;
        // }
        // System.out.println("Largest Number is: " + large);

        int a=10; int b=20; int c=15;
        
      int  large=a;
        if(b>large){
            large=b;
            System.out.println("b is large");
        }
       else if(c>large){
            large=c;
            System.out.println("c is large");
        }
        else{
            System.out.println("a is large");
        }

    }
}
