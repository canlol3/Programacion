package U4;
import java.util.Scanner;
    
public class ejer12 {
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double fin = 0;
        System.out.println("Vamos a ver cuanto sabes de League of Legends");
        
        System.out.println("1.¿En que linea puede ir Ashe?");
        System.out.println("(1) Top");
        System.out.println("(2) Mid");
        System.out.println("(3) ADC");
        int hola = s.nextInt();
        if (hola == 3 ){
        System.out.println("Correcto!!!");
        fin = fin+1;
        }else{
        System.out.println("Has fallado :( ");
        }
        System.out.println("2.Como es físicamente Fizz");
        System.out.println("(1) Es un gato");
        System.out.println("(2) Es una piedra");
        System.out.println("(3) Es un pez");
        int prim2 = s.nextInt();
        if (prim2 == 3){
        System.out.println("Correcto!!!");
        fin = fin+1;
        }else{
        System.out.println("Has fallado :( ");
        }
        System.out.println("3.Como se llama la pasiva de Miss Fortune");
        System.out.println("(1) Cachete");
        System.out.println("(2) Machete");
        System.out.println("(3) Filete");
        int prim3 = s.nextInt();
        if (prim3 == 1){
        System.out.println("Correcto!!!");
        fin = fin+1;
        }else{
        System.out.println("Has fallado :( ");
        }
        System.out.println("4.¿Que pasa si consigues el alma del dragón de viento?");
        System.out.println("(1) Consigues una gran cantidad de vida");
        System.out.println("(2) Nada, no existe");
        System.out.println("(3) Consigues una gran cantidad de movimiento");
        int prim4 = s.nextInt();
        if (prim4 == 3 ){
        System.out.println("Correcto!!!");
        fin = fin+1;
        }else{
        System.out.println("Has fallado :( ");
        }
        System.out.println("5.Cual de estas skins no existe");
        System.out.println("(1) Sona de recreativa");
        System.out.println("(2) Garen supernova");
        System.out.println("(3) Gnar galactico");
        int prim5 = s.nextInt();
        if (prim5 == 2){
        System.out.println("Correcto!!!");
        fin = fin+1;
        }else{
        System.out.println("Has fallado :( ");
        }
        System.out.println(fin*2);
    }
}
