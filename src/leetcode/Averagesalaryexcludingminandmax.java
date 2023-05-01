package leetcode;
import java.util.Arrays;
public class Averagesalaryexcludingminandmax {
    public static void main(String[] args) {
        int[] salary={1000,2000,3000,4000,5000};
    }

    public static double avg(int[] salary) {


            Arrays.sort(salary);
            double sum=0.00000;
            for(int i=1; i<salary.length-1; i++){
                sum+=salary[i];
            }
            double ans=sum/(salary.length-2);

            return ans;
        }
    }


