package src;

public class greeting_methods {
    public static void main(String[] args) {
        // greeting();
        String mes= myGreet("suman");
        System.out.println(mes);

    }
static String myGreet(String name){
    String message="Hello"+name;
    return message;
}

    static void greeting(){
        System.out.println("Hello, World!");
    }
}
