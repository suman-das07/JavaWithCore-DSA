//PROGRAM TO GET Nth VALUE 

// package src;

// import java.util.Scanner;

// public class fibonacci {
//   public static void main(String[] args) {
//     Scanner n = new Scanner(System.in);
//     System.out.print("Enter a Number:");
//     int num=n.nextInt();
//     int first=0;
//     int second=1;
//     int i=2;

//     while (i<=num) {
//         int temp=second;
//         second=second+first;
//         first=temp;
//         i++;

//     }
//     System.out.println(second);
//   }

// }

//PROGRAM TO GET N series

package src;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num = n.nextInt();
        int first = 0;
        int second = 1;
        int i = 0;

        while (i < num) {
            System.out.print(first);
            int temp = second;
            second=second+first;
            first=temp;
            i++;

        }
    }

}
