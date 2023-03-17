package Arrays.hashing;
import java.util.HashMap;
public class maxfreqcharmultiple {
    public static void main(String[] args) {
        String s="madae";
        HashMap<Character,Integer>map=new HashMap<>();
        int max=0,max1=0,l=0,k=0;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
                if(map.get(ch)>max){
                    max=map.get(ch);
                    l=i;
                }
                if(map.get(ch)>=max1){
                    max1=map.get(ch);
                    k=i;
                }
            }else{
                map.put(ch,1);
            }
        }
        if(max1==max){
            if(l!=k){
                System.out.print("-1");
            }else{
                System.out.println(s.charAt(k));
            }
        }

    }
}
