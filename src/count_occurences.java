package src;

public class count_occurences {
    public static void main(String[] args) {
        int num=133126;
        int target=3;
        int count=0;
        while(num>0){
            int rem=num%10;
            if(rem==target){
                count++;
            }
            num=num/10;

        }
        System.out.println(count);

    }
}
