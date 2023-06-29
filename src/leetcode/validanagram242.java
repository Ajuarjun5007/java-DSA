package leetcode;

import java.util.Arrays;

public class validanagram242 {
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        System.out.print(isvalid(s,t));
    }

    public static boolean isvalid(String s, String t) {

                boolean flag=true;
            char [] ch=s.toCharArray();
            char[] ch1=t.toCharArray();
            if(s.length()==t.length()){
                Arrays.sort(ch);
                Arrays.sort(ch1);
                for (int i = 0; i < s.length(); i++) {
                    if(ch[i]==ch1[i]){
                        flag=true;

                    }else{
                        flag=false;
                        break;
                    }
                }
            }else{
                 flag= false;

            }
            return((flag)?true:false);
    }
}
