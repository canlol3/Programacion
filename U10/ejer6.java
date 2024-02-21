package U10;

import java.util.HashMap;
import java.util.Scanner;
public class ejer6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<String, String> cons = new HashMap<String, String>();
        cons.put("Antonio","1234");
        cons.put("Lucas", "hola");
        cons.put("adrito", "contraseña");
        int oportunidades = 3;
        do{
        System.out.print("Introduzca el usuario: ");
        String usuario = s.nextLine();
        System.out.print("Contraseña: ");
        String contraseña = s.nextLine();
            if(cons.containsKey(usuario)){
                if(cons.get(usuario).equals(contraseña)){
                    System.out.println("Has entrado!!");
                }else{
                    System.out.println("Contraseña incorrecta!!");
                }
            }else{
                System.out.println("El usuario no existe");
            }
            oportunidades--;
        }while(oportunidades>0);
    }
}
