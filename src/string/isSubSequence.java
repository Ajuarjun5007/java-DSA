package string;

public class isSubSequence {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "axgcvc";
        int i=0,j=0;
        while(i<str1.length() && j<str2.length()){
            if(str1.charAt(i)==str2.charAt(j)){
                i++;
            }
            j++;
        }
        System.out.print(i==str1.length());
    }
}
