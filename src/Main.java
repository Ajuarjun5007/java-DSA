import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Scanner sc = new Scanner (System.in);
        int x = 1;
        int y = 12;
        int z= 5;


        for(int i=y+1; i<=1000000; i++){
            if(i%z==0) {
                System.out.println(i);
                break;
            }
        }
    }
}