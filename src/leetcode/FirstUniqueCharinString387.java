package leetcode;
import java.util.*;
public class FirstUniqueCharinString387 {
    public static void main(String[] args) {
        String str = "aabb";
        int ans = firstUniqChar(str);
        System.out.println(ans);
    }
    public static int firstUniqChar(String s){
//        brut force
//        int index=-1;
//        for(int i=0; i<s.length(); i++){
//            boolean flag=true;
//            char ch1= s.charAt(i);
//            for(int j=0; j<s.length(); j++){
//                char ch2=s.charAt(j);
//                if(i!=j && ch1==ch2){
//                    flag=false;
//                    break;
//                }
//            }
//            if(flag){
//                return i;
//            }
//        }
//        return index;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.get(ch) == 1) {
                return i;
            }
        }

        return -1;

    }
}
