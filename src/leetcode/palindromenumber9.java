package leetcode;

public class palindromenumber9 {
    public static void main(String[] args) {
        int num=1021;
    boolean ans=palindromenumber(num);
        System.out.println(ans);
    }

    public static boolean palindromenumber(int num) {
        int rem=0;
        int sum=0;
        int temp=num;
        if(num>=0){
            while(num>0) {
                rem = num % 10;
                sum = sum * 10 + rem;
                num = num / 10;
            }
            if(temp==sum){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }

    }
}
