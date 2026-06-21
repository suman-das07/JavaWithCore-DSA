package src;

import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        // func(20, 30);
       func(2,3,4,4,5,6,7,8,8,9,0); // the output will be in arrays.
    }
    static void func(int a, int b)
    {
       System.out.println(a+""+b);
    }

    static void func(int ...v){
        System.out.println(Arrays.toString(v)); //variable length arguments will convert the user-inputs to arrays.
    }
}
