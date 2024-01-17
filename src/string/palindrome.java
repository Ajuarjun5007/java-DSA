package string;

public class palindrome {
    public static void main(String[] args) {
       int num=1211;
        System.out.println(palindrome(num));

    }

    public static boolean palindrome (int num) {

        int temp=num;
        int sum=0;
        while(num!=0){
            int rem=num%10;
            sum=sum*10+rem;
            num/=10;
        }
        return(sum==temp);
    }
}
