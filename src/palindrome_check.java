package src;

import java.util.Scanner;

public class palindrome_check {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a 3 digit number: ");
        int num =sc.nextInt();
        int original = num;
        int res = 0;
        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            res = res * 10 + rem;
        }
        if(res==original){
           System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
       
    }
}
