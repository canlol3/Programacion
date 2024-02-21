package Arrays;

public class BuscarNum {
    public static boolean getNum(int[] array,int num){
        
        for(int i = 0; i<array.length;i++){
            if(array[i] == num){
                return true;
            }
                
         }
         return false;
     }
}

