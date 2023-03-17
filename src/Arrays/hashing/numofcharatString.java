package Arrays.hashing;
import java.util.HashSet;
public class numofcharatString {
    public static void main(String[] args) {

        String str ="aju arjun";
        HashSet<Character> set=new HashSet<>();

        int count =0;
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(str.charAt(i)!=' '){
                set.add(ch);

            }
            count=set.size();
        }
        System.out.print(count);
    }
}
