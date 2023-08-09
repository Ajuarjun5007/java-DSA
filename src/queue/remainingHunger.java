package queue;

import java.util.*;

public class remainingHunger {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> q1  = new LinkedList<>();
        Queue<Integer> q2  = new LinkedList<>();
        q1.add(1);
        q1.add(0);
        q1.add(1);
        q1.add(0);
        q1.add(1);

        q2.add(1);
        q2.add(1);
        q2.add(0);
        q2.add(0);
        q2.add(0);
        int ans  = hungers(q1,q2);
        System.out.println(ans);
    }
    public static int hungers(Queue<Integer> q1,Queue<Integer>q2){
        int count=0;
        while(!q1.isEmpty()){
            if(q1.peek()==q2.peek()){
                q1.poll();
                q2.poll();
                count=0;
            }else{
                if(count==q1.size()){
                    break;
                }else{
                    int temp=q1.poll();
                    q1.add(temp);
                    count++;
                }
            }
        }

        return (q1.size());

    }
}
