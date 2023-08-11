package Arrays;

public class largestelementinarray {
    public static void main(String[] args) {
        int[] array = {111,1112,3,4422,90,2122};
        int first=-1;
        int second=-1;
        int third=-1;
        for(int i=0; i<array.length; i++){
            if(array[i]>first){
                third=second;
                second=first;
                first=array[i];
            }else if(array[i]>second){
                third=second;
                second=array[i];
            }else if(array[i]>third){
                third=array[i];
            }
        }
        System.out.println(third);

    }
}
