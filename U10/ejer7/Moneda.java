package U10.ejer7;
public class Moneda {
    private static String posiciones[] = {"cara","cruz"};
    private static String cantidades[] = {"1 céntimos","2 céntimos","5 céntimos","10 céntimos","25 céntimos","50 céntimos","1 euro","2 euro"};
    private String cantidad;
    private String posicion;
    
    public Moneda(){
        this.posicion = posiciones[(int)(Math.random()*2)];
        this.cantidad = cantidades[(int)(Math.random()*8)];
    }

    public String getCantidad() {
        return cantidad;
    }

    public String getPosicion() {
        return posicion;
    }

    public String toString(){
        return this.cantidad +" - "+ this.posicion; 
    }
}