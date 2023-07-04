package leetcode;

public class findtheindexoffirstoccurence28 {
    public static void main(String[] args) {
        String haystack="sadbutsad";
        String needle = "sad";
        int ans = firstoccurence(haystack,needle);
        System.out.println(ans);
    }

    public static int firstoccurence(String haystack,String needle) {
        int ans=-1;
        if(haystack.contains(needle)){
            ans=haystack.indexOf(needle);
        }
        return ans;
    }

}
