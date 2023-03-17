package Arrays.hashing;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class missingelem {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,5,6};
        int[] arr1={4,3,5,4,6,8};
        repeatedelememt(arr1);
        //missingelement(arr);
    }
    public static void repeatedelememt(int[] arr){

        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int key=arr[i];
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }else{
                map.put(key,1);
            }
        }
        for(HashMap.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()==2){
                System.out.println(entry.getKey());
            }
        }
        System.out.println();
        Arrays.sort(arr);
        HashSet <Integer> set = new HashSet<>();
        for (int i=0; i<arr.length; i++) {
            set.add(arr[i]);
        }
        // 4,3,5,4,6,8
         // 3,4,5,6,8
        int k = arr[0]; // 4
        set.toArray();
        for (int i : set) {
            if (k != i) {
                System.out.print("your missing number is :-"+ k+" ");
                break;
            }
            k++;
        }
    }




}
