package src;

public class passing_value_methods {
    public static void main(String[] args) {
//         String name= "Suman";
//         greet(name);
//         System.out.println(name);
//     }
//     static void greet(String naam){
//         // System.out.println(naam );
//         naam="giriveer";
        //  int res= add(10, 20);
        //  System.out.println(ress);
        // boolean res=isEligible(12);
        // System.out.println(res);
        int res = max(2, 2);
        System.out.println(res);

  }
    // static int add(int a, int b){
    //   return a+b;
    // }

 static int max(int a, int b){
    // if(a>b || a<b){
    //     return ;
    // }
    if(a==b){
        return 0;
    }
    if(a>b){
        return a;
    }
    return b;
 }
}
