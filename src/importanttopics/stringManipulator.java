package importanttopics;
import java.util.*;
public class stringManipulator {
    public static void main(String[] args){

        String str = "2|231,2|432";
        ArrayList<ArrayList<Integer>> result = stringChanger(str);

            System.out.print(result);
        }


    public static ArrayList<ArrayList<Integer>> stringChanger (String str){
        ArrayList<ArrayList<Integer>> aList = new ArrayList<>();
        String[] pairs = str.split(",");

        for(String pair:pairs){

            String[] values = pair.split("\\|");
            if(values.length==2){
                int num1 = Integer.parseInt(values[0]);

                int num2 = Integer.parseInt(values[1]);

                ArrayList<Integer> list = new ArrayList<>();
                list.add(num1);
                list.add(num2);
                aList.add(list);
            }
        }
        return aList;
    }
}
