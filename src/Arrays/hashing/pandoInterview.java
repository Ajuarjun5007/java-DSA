package Arrays.hashing;
import java.util.HashMap;

public class pandoInterview {
      public static void main(String[] args) {
       int[] arr = {19,19,2,3,2,19,3,4,4,4};
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i=0; i<arr.length; i++){
           map.put(arr[i],map.getOrDefault(arr[i],0)+1);
       }
            int count=0;
            int minKey=Integer.MAX_VALUE;
       for(HashMap.Entry<Integer,Integer> entry: map.entrySet()){
           if(entry.getValue()>=count && entry.getValue()<=minKey){
               minKey=entry.getKey();
           }
       }
       System.out.print(minKey);
    }
}
