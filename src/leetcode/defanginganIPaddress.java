package leetcode;

public class defanginganIPaddress {
    public static void main(String[] args) {
      String  address = "1.1.1.1";
      String ans=defanging(address);
        System.out.print(ans);
    }

    public static String defanging(String address ){
        String res=address.replace(".","[.]");
        return res;

    }
}
