package matematicas;

public class QuitarDer {
    public static int getQuitar(int num3, int cant){
        for(int i = 0; i<cant; i++){
            num3 = num3/10;

        }
        return (int)num3;
    }
}
