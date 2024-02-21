package matematicas;

public class Capicua {
    public static boolean EsCapicuo(int num3){
        
        int[] numeros = Voltea.volteado(num3);
        if(numeros[1] == numeros[0]){
            return true;
        }if(numeros[1] != numeros[0]){
            return false;
        }else{
            return false;
        }
    }
}
