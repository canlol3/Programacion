package U9.Ejercicio2;
import java.util.Scanner;
public class PruebasVehiculos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int km;
        Bicicleta bici = new Bicicleta(0);
        Coche audi = new Coche(1000);
        int num = 0;
        while (num != 8) {
            km = 0;
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            System.out.print("Elige una opción (1-8): ");
            num = s.nextInt();
            
            switch (num) {
                case 1:
                    System.out.println("Cuantos kilometros quieres hacer en bicicleta?");
                    km = s.nextInt();
                    bici.recorre(km);
                    break;
                case 2:
                    bici.Caballito();
                    break;
                case 3:
                System.out.println("Cuantos kilometros quieres hacer con el coche?");
                    km = s.nextInt();
                    audi.recorre(km);
                break;
                case 4:
                audi.quemaRueda();
                break;
                case 5:
                System.out.println("Lleva recorrido: ");
                System.out.println(bici.getKilometrosRecorridos() + "Km");
                break;
                case 6:
                System.out.println("LLeva recorrido el coche: ");
                System.out.println(audi.getKilometrosRecorridos() + "Km");
                break; 
                case 7:
                System.out.println("En total llevas recorrido: ");
                System.out.println(Vehiculos.getKilometrosTotales());
                break;
                
            }
        }
        
    }
}
