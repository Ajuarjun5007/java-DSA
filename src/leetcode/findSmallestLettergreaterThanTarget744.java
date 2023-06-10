package leetcode;
import java.util.*;
public class findSmallestLettergreaterThanTarget744 {
    public static void main(String[] args) {
        char[] letters ={'c','f','j'};
        char target = 'a';
        char ans = nextGreatestLetter(letters,target);
        System.out.println(ans);
    }
    public static char nextGreatestLetter(char[] letters, char target) {

        Arrays.sort(letters);
        for(int i=0; i<letters.length; i++){
            if(target<letters[i]){
                return letters[i];
            }
        }
        return letters[0];
    }
}
