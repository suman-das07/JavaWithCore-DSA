package src;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    // int[] arr=new int[5];

    // System.out.println(arr[2]); // internally it's default value will be 0, so 0 will be printed.

    // //String Array
    //  String[] arrStrings= new String[4];

    //  System.out.println(arrStrings[2]); // internally it's default value will be null, null will be printed.
    //  // null is a special literal, cannot be referenced to primitives, only to non-primitives.

    //  int[] arr1= new int[5];
    //  arr1[0]=4;

    //  //input using loops in an array
    //   for(int i=0; i<arr.length;i++){
    //     arr[i]=sc.nextInt();
    //   }
    //   for(int i=0;i<arr.length;i++){
    //    System.out.print(arr[i] + " " );
    //   }
    //   for(int num : arr){
    //     System.out.println(num+ " ");
    //   }

      //ALL INT, FLOAT AND OTHER BELONG TO PRIMITIVES WHILE ARRAY, STRING BELONGS TO NON-PRIMITIVES/OBJECTS

      //array of objects

      String[] str = new String[5];

      for(int i=0; i<str.length;i++){
        str[i]=sc.next();
      }
        System.out.println(Arrays.toString(str));

        //modify
        str[3]="deepak";
        System.out.println(Arrays.toString(str));


  }
}
