package U10.ejer7;

import java.util.ArrayList;
public class ejer7 {
    public static void main(String[] args) {
        ArrayList<Moneda>  m = new ArrayList<Moneda>();
        Moneda monedaAux = new Moneda();
        m.add(monedaAux);
        String ultimaPosicion= monedaAux.getPosicion();
        String ultimaCantidad= monedaAux.getCantidad();
        
        for(int i = 0; i < 5; i++){
            do {
                monedaAux = new Moneda();
            } while (monedaAux.getPosicion().equals(ultimaPosicion) && ! monedaAux.getCantidad().equals(ultimaCantidad));

            m.add(monedaAux);
            ultimaCantidad = monedaAux.getCantidad();
            ultimaPosicion = monedaAux.getPosicion();
        }
        for(Moneda a : m ){
            System.out.println(a);
        }
    }
}
