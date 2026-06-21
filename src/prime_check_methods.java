package src;

import java.util.Scanner;

public class prime_check_methods {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc. nextInt();
        
        System.out.println(isPrime(num));
    }

    static boolean isPrime(int n){
        if (n<1){
            return false;
        }
        for(int i=2; i*i<=n-1; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
