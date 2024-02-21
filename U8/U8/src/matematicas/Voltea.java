package matematicas;

public class Voltea {
    public static int[] volteado(int num3){
        int[] numeros= new int[2];
        int resto;
        int num3_invertido = 0;
        int numReserva = num3;
        numeros[1] = numReserva;
        while (num3 > 0) {
          resto = num3 % 10;
          num3_invertido = num3_invertido * 10 + resto;
          num3 /= 10;
        }
        numeros[0] = num3_invertido;
        return numeros;
    }
}
