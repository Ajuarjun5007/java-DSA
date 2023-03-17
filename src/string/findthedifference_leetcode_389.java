package string;
import java.util.HashMap;

public class findthedifference_leetcode_389 {

    public static void main(String[] args) {
        String s="tigers";
        String t="tigeres";
        char ans=findTheDifference(s,t);
        System.out.println(ans);
    }

    public static char findTheDifference(String s, String t) {

        HashMap<Character,Integer>map=new HashMap<Character,Integer>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            map.put(ch,1);
        }
            char ch1=' ';
        if(s!="") {
            for (int i = 0; i < t.length(); i++) {
                char ch = t.charAt(i);

                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                } else {
                    map.put(ch, 1);
                }
            }

        }else{
            ch1=t.charAt(0);
        }
        for(HashMap.Entry<Character,Integer>entry: map.entrySet()){
            if(entry.getValue()>=2){
                ch1= entry.getKey();
            }
        }


        return ch1;

    }





}
