package src;

public class shadowing {
    static int x=90; //statuc us used to access into main() function.
    // int x is outside main() acting like global variable.
    public static void main(String[] args) {
        System.out.println(x); // this will print the outside x.

        int x=80; // this is a function scope valid to only upto main() function scope.
        System.out.println(x);// this will print the inside x.
        num(); //this will print global x as the num() function is outside the main scope
    }
    
    static void num() {
        System.out.println(x);

    }
}

