import java.util.*;

public class firstrepeatingelementinarray {
    public static void main(String[] args) {
        int[] arr = {2,1,5,4,7,3,2};
        HashMap<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num=arr[i];
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();

        for(Map.Entry<Integer,Integer>entry: map.entrySet()) {
            if (entry.getValue() == 2) {
                list.add(entry.getKey());
            }
        }
        boolean flag =false;
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<list.size(); j++) {
                if (arr[i] == list.get(j)) {
                    System.out.println(arr[i]);
                    flag=true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
    }
}
