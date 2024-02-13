package U9;



public class PruebaGato {
    public static void main(String[] args) {
        GatoSimple garfield = new GatoSimple("macho");

        System.out.println("Hola");
        garfield.maulla();
        System.out.println("Como estas");
        garfield.ronronear();
        System.out.println();
        System.out.println("Toma tarta");
        garfield.Comer("tarta");
        System.out.println();

        GatoSimple lisa = new GatoSimple("hembra");
        System.out.println("Holaaa");
        lisa.maulla(); 

        GatoSimple tom = new GatoSimple("macho");
        System.out.println("Maullar todos");
        garfield.maulla();
        tom.maulla();
        lisa.maulla();

        garfield.Pelea(lisa);
        garfield.Pelea(tom);
    }
}
