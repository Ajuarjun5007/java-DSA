package leetcode;
import java.util.*;
public class Dota2Senate649 {
    public static void main(String[] args) {
     String s= "DDRRR";// DDRD;
     String ans=predictPartyVictory(s);
        System.out.println(ans);
    }
    public static String  predictPartyVictory(String senate) {
        String ans = "";
        int len=senate.length();
        char maxChar='a';

//        } else {
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
//            if(len%2==0){
//                maxChar =senate.charAt(len-2);
//            }else{
//                maxChar=senate.charAt(len-1);
//            }
//            if(maxChar=='R'){
//                ans="Radiant";
//            }else{
//                ans="Dire";
//            }        FP
            ArrayList<Character>list=new ArrayList<>();
            for (int i = 0; i < len; i++) {
                list.add(senate.charAt(i));
            }
              int start=0, end=len-1;
                int ptr1=0; int ptr2=len-1;
            // DDRRR; DRRD;RDD;DR
              while(list.size()>2){
                char ch=list.get(start);
                char ch1=list.get(end);
                //D,D,R,R,R
                //0,1,2,3,4
                if(ch==ch1){
                    int index=list.size()-1;
                    while(ch==list.get(index)){
                        index--;
                    }
                    if(ch!=list.get(index)){
                        list.set(end,ch);
                        list.remove(start);
                        end--;
                    }
                }else{
                    list.set(end,ch);
                    list.remove(start);
                    end--;
                }
            }

        if (list.size()<= 2) {
            if (list.get(0) == 'R') {
                ans = "Radiant";
            } else {
                ans = "Dire";
            }
        }

        return ans;
        }

       
    }


