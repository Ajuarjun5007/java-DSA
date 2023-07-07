package leetcode;

public class validpalindrome125 {
    public static void main(String[] args) {
        String s = "A mana, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {

        StringBuilder sb= new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            if(c>='a' && c<='z' || c>='A' && c<='Z' || c>='0' && c<='9'){
                sb.append(c);
            }
        }
        String s1="";
        s1+=sb.toString().toLowerCase();

        int left=0,right=s1.length()-1;
        while(left<right){
            if(s1.charAt(left)!=s1.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
