package string;

public class palindrome {
    public static void main(String[] args) {
        String s = "malayalam";
        // String rev="";
//          for(int i=s.length()-1; i>0; i--){
//              rev+=s.charAt(i);
//
//          }
//          if(s.equals(rev)){
//              System.out.println("yes");
//          }else{
//              System.out.println("No");
//          }
//         boolean flag=false;
//        int p1=0 , p2=s.length()-1;
//        while (p1<p2){
//            if(s.charAt(p1)!=s.charAt(p2)){
//                flag=true;
//                break;
//            }
//            p1++;
//            p2--;
//
//        }
//
//        if(!flag){
//            System.out.println("true");
//        }else {
//            System.out.println("No");
//        }
//    }

        int a = 4;

        boolean f = false;
        if (a % 2 == 0) {
            System.out.println(!f);
        } else {
            System.out.println(f);
        }
    }

}
