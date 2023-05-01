package leetcode;

public class detectcapital520 {
    public static void main(String[] args) {
        String s="leetcode";
        boolean ans=detect(s);
        System.out.print(ans);
    }

    public static boolean detect(String  word) {
          int cap=0,small=0;

                for(int i=0; i<word.length(); i++){

                    if(Character.isUpperCase(word.charAt(i))){
                        cap++;
                    } else{
                        small++;
                    }
                }
                if(cap==word.length() || small==word.length()){
                    return true;
                }else if(cap==1 && Character.isUpperCase(word.charAt(0))){
                    return true;
                }
                return false;
            }
        }


