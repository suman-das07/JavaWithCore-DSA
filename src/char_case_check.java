package src;

import java.util.Scanner;

public class char_case_check {
    public static void main(String[] args) {
        Scanner chr= new Scanner(System.in);

        System.out.println("Enter a Character:");
        char ch= chr.next().charAt(0);
        if( ch >='a' || ch <= 'z'){
            System.out.println("Lowercase");
        }
        else if (ch>= 'A' && ch<='Z'){
            System.out.println("Uppercase");
        }
        else{
            System.out.println("Not a character.");
        }


    }
}
