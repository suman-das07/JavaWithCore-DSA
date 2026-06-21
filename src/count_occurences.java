package src;

public class count_occurences {
    public static void main(String[] args) {
    //     int num=133126;
    //     int target=3;
    //     int count=0;
    //     while(num>0){
    //         int rem=num%10;
    //         if(rem==target){
    //             count++;
    //         }
    //         num=num/10;

    //     }
    //     System.out.println(count);
    int n=1234562345;
    int count=0;

    while(n>0){
        int res=n%10;
        n/=10;
        count++;
    }
    System.out.println(count);

     }
}
