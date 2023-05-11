package leetcode;
import java.util.*;
public class findthedfrnceoftwoarrays2215 {
    public static void main(String[] args) {
        int[] nums1={1,2,3};
        int[] nums2={2,4,6};
        List<List<Integer>> ans=finddfrnce(nums1,nums2);
        System.out.println(ans);
    }
    public static List<List<Integer>> finddfrnce(int[] nums1, int[] nums2){
        List<List<Integer>>aList=new ArrayList<>();
        ArrayList<Integer>a1=new ArrayList<>();
        for(int i=0; i<nums1.length; i++){
            if(!a1.contains(nums1[i])){
                a1.add(nums1[i]);
            }
        }
        aList.add(a1);

        ArrayList<Integer>a2=new ArrayList<>();
        for(int j=0; j<nums2.length; j++){
            if(!a2.contains(nums2[j])){
                a2.add(nums2[j]);
            }
        }
        aList.add(a2);

        for(int i=0; i<a1.size(); i++){
            int val=a1.get(i);
            if(a2.contains(val)){
                a1.remove(i);
                a2.remove(a2.indexOf(val));
                i--;
            }

        }
        return aList;
    }
}
