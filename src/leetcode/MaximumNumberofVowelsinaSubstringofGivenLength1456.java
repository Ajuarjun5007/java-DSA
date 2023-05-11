package leetcode;

public class MaximumNumberofVowelsinaSubstringofGivenLength1456 {
    public static void main(String[] args) {
        String s = "abciiidef";
        int key=3;
        int ans=maxnum(s,key);
        System.out.println(ans);
    }

    public static int maxnum(String s, int k) {
        int count=0; int max=0;
        for(int i=0; i<k; i++){
            char ch=s.charAt(i);
            if(vowels(ch)){
                count++;
            }
            max=count;
        }
        for(int i=k; i<s.length(); i++){
            char ch1=s.charAt(i);
            char ch2=s.charAt(i-k);
            int count1=0,count2=0;
            if(vowels(ch1)){
                count1++;
            }
            if(vowels(ch2)){
                count2++;
            }
            count+=count1-count2;
            max=Math.max(count,max);
        }
        return max;
    }
    public static  boolean vowels(char ch){
        return (ch=='a'|| ch=='e'|| ch=='i' || ch=='o' || ch=='u');
    }
    }

