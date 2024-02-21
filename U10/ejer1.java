package U10;

import java.util.ArrayList;

public class ejer1 {
    public static void main(String[] args) {
        ArrayList<String> alumnos = new ArrayList<String>();
        alumnos.add("jaime");
        alumnos.add("Antonio");
        alumnos.add("Lucas");
        alumnos.add("Adrian");
        alumnos.add("Noe");
        alumnos.add("Paco");
        for(String nombre: alumnos) { 
            System.out.println(nombre);
        }    }
}
