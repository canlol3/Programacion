package matematicas;

public class Digitos {
    public static int getDigitos(int num3){
        int i = 0;
        for( i = 0;num3>0;i++ ){
            num3 = num3/10;
        }
        return i;
    }
}
