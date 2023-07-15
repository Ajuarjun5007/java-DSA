package leetcode;
import java.util.*;
public class isomorpicstrings205 {
    public static void main(String[] args) {
        String s = "paper";
        String t = "title";
        boolean ans = isIsomorphic(s,t);
        System.out.print(ans);
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> charToIndex_s = new HashMap<>();
        Map<Character, Integer> charToIndex_t = new HashMap<>();

        for (Integer i = 0; i < s.length(); ++i)
            if (charToIndex_s.put(s.charAt(i), i) != charToIndex_t.put(t.charAt(i), i))
                return false;

        return true;
    }
}
