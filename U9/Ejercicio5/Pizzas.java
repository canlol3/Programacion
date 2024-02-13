package U9.Ejercicio5;

public class Pizzas {
    String tamaño;
    String tipo;
    String estado = "pedida";
    private static int servidas;
    private static int pedidas;
    public Pizzas(String tamaño2, String tipo2){
        this.tamaño = tamaño2;
        this.tipo = tipo2;
        Pizzas.pedidas++;
    }
    public String toString(){
        return "pizza "+ this.tipo + " " + this.tamaño + ", " + this.estado;
    }
    void Servir(){
        if(this.estado.equals("pedida")){
            System.out.println("servida");
            this.estado = "servida";
            Pizzas.servidas++;
        }else{
            System.out.println("Ya esta servida");
        }
    }
    public  static int getTotalesPedidas(){
        return Pizzas.pedidas;
    }
    public  static int getTotalesServidas(){
        return Pizzas.servidas;
    }
}
