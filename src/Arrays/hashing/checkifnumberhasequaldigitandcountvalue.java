package Arrays.hashing;
import java.util.*;
public class checkifnumberhasequaldigitandcountvalue {
    public static void main(String[] args) {
        String num="1210";
        boolean ans=istrue(num);
        System.out.println(ans);
    }

    public static boolean istrue(String num) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<num.length();i++){
            int ch=num.charAt(i)-'0';
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        // StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=0;i<num.length();i++){

            if(map.containsKey(i)){
                count=map.get(i);
            }
            else{
                count=0;
            }
            int x=num.charAt(i)-'0';
            if(x!=count){
                return false;
            }
        }
        return true;
    }
    }
