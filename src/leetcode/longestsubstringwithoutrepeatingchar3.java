package leetcode;
import java.util.HashMap;
public class longestsubstringwithoutrepeatingchar3 {
    public static void main(String[] args) {
        String s="adswwwe";
       int ans=longestsubstringwithoutrepeatingchar(s);
        System.out.println(ans);
    }

    public static int longestsubstringwithoutrepeatingchar(String s) {
        HashMap<Character,Integer>map=new HashMap<Character,Integer>();
        int maxlength=0;//0
        int strtch=0;//0
        for(int endch=0; endch<s.length(); endch++){
            char ch =s.charAt(endch); // e=0,1,2,3,4        ; ch=a;d;s;w;w;
            if(map.containsKey(ch)){//w
                strtch=Math.max(strtch,map.get(ch)+1); // (0,4)
            }//strtch 4;
            map.put(ch,endch); // (a,0),(d,1),(s,2),(w,3)
            maxlength=Math.max(maxlength,endch-strtch+1);//

        }
        return maxlength;
    }
}
