package subarray;

import java.util.*;
  // subarray with sum equal to zero
public class subarraywithsumzero {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int [] arr = {4,1,3,3,-13,7};
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        map.put(arr[0],1);
        int sum=arr[0];
        for (int i = 1; i <arr.length; i++) {
            sum+=arr[i];
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        boolean flag=false;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>=2){
                flag=true;
            }
        }
//        System.out.println(map);
        System.out.println(flag);
    }
}
