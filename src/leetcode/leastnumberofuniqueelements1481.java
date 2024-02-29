package leetcode;
import java.util.*;
public class leastnumberofuniqueelements1481{
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer> list  =  new ArrayList<>();

        for(  HashMap.Entry<Integer,Integer> entry : map.entrySet()){
            // System.out.print(entry.getKey()+" "+entry.getValue());
            list.add(entry.getValue());
        }
        int count=0;
        for(int i : list){
            if(k>=i){
                k-=i;
                count++;
            }else{
                break;
            }
        }
        
        return list.size()-count;
    }
}
