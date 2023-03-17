package Arrays.hashing;
import java.util.HashMap;

public class longestsubsetwithuniquechar {
    public static void main(String[] args) {
        String str = "ajuarjun";
        HashMap<Character,Integer>map=new HashMap<Character,Integer>();
        int maxlength=0;
        int strt=0;
        for (int end = 0; end < str.length(); end++) {
            char ch=str.charAt(end);
            if(map.containsKey(ch)){//
                strt=Math.max(strt,map.get(ch)+1);
            }
            map.put(ch,end);//a,0;
            maxlength=Math.max(maxlength,end-strt+1);
        }
        System.out.println(maxlength);
    }
}

