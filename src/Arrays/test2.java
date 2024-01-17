package Arrays;

public class test2 {
    public static void main(String[] args) {
//        String s ="abcde";
//        boolean ans = isValid(s);
//        System.out.println(ans);
//        String res = reverse(s);
//        System.out.println(res);
//        int n=-124521;
//        int out = palindrome(n);
//        System.out.println(out);
//        System.out.println(binary(34));
        int[] arr ={1,0,0,1,0,1};
        int[] answer = sortArray(arr);
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]+" ");
        }
    }


    public static int[] sortArray(int[] arr) {
        int start = 0;

        int last = arr.length-1;

        while(start<last){

            if(arr[start]==1 && arr[last]==0){
                arr[start++]=0;
                arr[last--]=1;
            }
            if(arr[start]==0){
                    start++;
            }
            if(arr[last]==1){
                last--;
            }
        }
        return arr;
    }








//    public static String binary(int n) {
//        String str ="";
//        while(n!=0){
//            str=n%2+str;
//            n/=2;
//        }
//        return str;
//    }

//    public static long sqrt(long n){
//        long low = 0;
//        long high = n;
//        long mid;
//        while((high-low) > 1){
//            mid =(high + low)/2;
//            if(mid*mid > n){
//                high = mid; }
//            else{
//                low = mid; }
//        }
//        return low;
//    }



//    public static int palindrome (int n) {
//        int rem, sum=0;
//        int temp=n;
//        while(n>0) {
//             rem =n%10;
//            sum=sum*10+rem;
//             n=n/10;
//        }
//        return sum;
//    }


//    public static String reverse(String str) {
//        StringBuilder sb = new StringBuilder();
//        Stack st = new Stack();
//        for(int i=0; i<str.length(); i++){
//            st.push(str.charAt(i));
//
//        }
//        for(char ch:str.toCharArray()){
//            sb.append(st.pop());
//        }
//        return  sb.toString();
//    }

//    public static boolean isValid(String s) {
//        Stack<Character> st = new Stack<>();
//        for(char ch:s.toCharArray()){
//           switch (ch){
//               case '(':
//               case '{':
//               case '[':
//                   st.push(ch);
//                   break;
//               case')':
//                   if(st.isEmpty() || st.pop()!='('){
//                       return false;
//                   }
//                   break;
//               case'}':
//                   if(st.isEmpty() || st.pop()!='{'){
//                       return false;
//                   }
//                   break;
//               case']':
//                   if(st.isEmpty() || st.pop()!='['){
//                       return false;
//                   }
//                   break;
//           }
//        }
//        return st.isEmpty();
//    }
    }

