package Arrays;

public class largestelementinarray {
    public static void main(String[] args) {
        int[] array = {1,2,3,3,3,4,4,5,5,5,5};
        int first=-1;
        int second=-1;
        int third=-1;
        for(int i=0; i<array.length; i++){
            if(array[i]>=first){
                third=second;
                second=first;
                first=array[i];
            }else if(array[i]<first && array[i]>=second){
                third=second;
                second=array[i];
            }else if( array[i]<second && array[i]>=third ){
                third=array[i];
            }
        }
        System.out.println(third);

    }
}
