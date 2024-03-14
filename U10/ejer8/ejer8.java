package U10.ejer8;

import java.util.ArrayList;

public class ejer8 {
    public static void main(String[] args) {
    ArrayList<Carta> cartaAux = new ArrayList<Carta>();
    Carta carta;
    for(int i = 0; i<10; i++){
        do{
            carta = new Carta();
            cartaAux.remove(carta);
        }while(cartaAux.contains(carta));
        cartaAux.add(carta);
        System.out.println(carta);

    }
    }
}
