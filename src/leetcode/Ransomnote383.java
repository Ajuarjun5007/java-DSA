package leetcode;
import  java.util.*;
public class Ransomnote383 {
    public static void main(String[] args) {
        String str1="amar";
        String str2="raghurman";
        System.out.print(canConstruct(str1,str2));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        char arr1[]  = ransomNote.toCharArray();
        char arr2[]  = magazine.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String str1="";
        String str2="";
        for(int i=0; i<arr1.length; i++){
            str1+=arr1[i];
        }
//        System.out.print(str1);
//        System.out.println();
        for(int i=0; i<arr2.length; i++){
            str2+=arr2[i];
        }
//        System.out.print(str2);
        if(str1.length()<=str2.length()){
            
        }

        return false;
    }
}
