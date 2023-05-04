package leetcode;
import java.util.*;
public class Dota2Senate649 {
    public static void main(String[] args) {
     String s= "RD";
     String ans=predictPartyVictory(s);
        System.out.println(ans);
    }
    public static String  predictPartyVictory(String senate) {
        String ans = "";
        int len=senate.length();
        char maxChar='a';
        if (len<= 2) {
            if (senate.charAt(0) == 'R') {
                ans = "Radiant";
            } else {
                ans = "Dire";
            }
        } else {
//            HashMap<Character, Integer> map = new HashMap<>();
//            for (int i = 0; i < senate.length(); i++) {
//                char ch = senate.charAt(i);
//                map.put(ch, map.getOrDefault(ch, 0) + 1);
//            }
//
//            int max = Integer.MIN_VALUE;
//
//            for (HashMap.Entry<Character, Integer> entry : map.entrySet()) {
//                if (entry.getValue() > max) {
//                    max= entry.getKey();
//                    maxChar = entry.getKey();
//                }
//            }
//            if(maxChar=='R'){
//                ans="Radiant";
//            }else{
//                ans="Dire";
//            }
            if(len%2==0){
                maxChar =senate.charAt(len-2);
            }else{
                maxChar=senate.charAt(len-1);
            }
            if(maxChar=='R'){
                ans="Radiant";
            }else{
                ans="Dire";
            }
        }
        return ans;
        }

       
    }


