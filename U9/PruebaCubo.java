package U9;

public class PruebaCubo {
    public static void main(String[] args){
        Cubo cubo1 = new Cubo(4);
        Cubo cubo2 = new Cubo(6);
        System.out.println("Cubo1");
        cubo1.pinta();
        System.out.println("Cubo2");
        cubo2.pinta();
        System.out.println("Lleno el cubo1: ");
        cubo1.llena();
        cubo1.pinta();
        System.out.println("Vuelco cubo1 en el 2");
        cubo1.vuelcaEn(cubo2);
        System.out.println("Cubo1");
        cubo1.pinta();
        System.out.println("Cubo2");
        cubo2.pinta();
        System.out.println("ahora alreves");
        cubo2.vuelcaEn(cubo1);
        System.out.println("Cubo1");
        cubo1.pinta();
        System.out.println("Cubo2");
        cubo2.pinta();
    }
}
