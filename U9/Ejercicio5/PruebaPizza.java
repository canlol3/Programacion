package U9.Ejercicio5;

public class PruebaPizza {
    public static void main(String[] args) {
        Pizzas p1 = new Pizzas("grande", "margarita");
        Pizzas p2 = new Pizzas("pequeña", "BBQ");
        Pizzas p3 = new Pizzas("grande", "pepperoni");
        p1.Servir();
        p3.Servir();
        System.out.println(p1);
       System.out.println( " "+ Pizzas.getTotalesPedidas() + " Pedidas");
       System.out.println(" "+ Pizzas.getTotalesServidas()+ " Servidas");
    }
}
