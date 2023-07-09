package leetcode;
import java.util.*;
public class wordpattern290 {
    public static void main(String[] args) {
        String pattern = "aaaa";
        String s = "dog cat cat dog";
        System.out.print(wordPattern(pattern,s));
    }
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length())
            return false;
        HashMap<Character, Integer> charToIndex = new HashMap<>();
        HashMap<String, Integer> stringToIndex = new HashMap<>();
        for (Integer i = 0; i < pattern.length(); ++i)
            if (charToIndex.put(pattern.charAt(i), i) != stringToIndex.put(words[i], i))
                return false;

        return true;

    }
}
