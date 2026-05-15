package src;

public class reverse_num {
    public static void main(String[] args) {
        int num=23597;
        int res=0;
        while (num>0) {
            int rem=num%10;
            num/=10;
            res=res*10+rem;


        }
     System.err.println(res);
    }
}
