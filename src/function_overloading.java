package src;

public class function_overloading {
    public static void main(String[] args) {
        func(23);
    }

    static void func(int a){
        System.out.println(a);
    }

    static void func(String name){
        System.out.println(name);
    }
}
