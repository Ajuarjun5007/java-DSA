package importanttopics;
public class StringReverse {
    public static void main(String[] args){
        String str = "i love india";
        String result = reverse(str).trim();
        System.out.print(result);
    }
    public static String reverse(String str){
        String[] strArray = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i=strArray.length-1; i>=0; i--){
            sb.append(strArray[i]+" ");
        }
        return  sb.toString();
    }
}
