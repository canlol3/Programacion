package U10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ejer11 {
    public static void main(String[] args) {
        HashMap<String,String> m = new HashMap<String,String>();
        String[] seleccion = new String[5];
        Scanner s = new Scanner(System.in);
        m.put("ordenador", "computer");
        m.put("gato", "cat");
        m.put("rojo", "red");
        m.put("árbol", "tree");
        m.put("pingüino", "penguin");
        m.put("sol", "sun");
        m.put("agua", "water");
        m.put("viento", "wind");
        m.put("siesta", "siesta");
        m.put("arriba", "up");
        m.put("ratón", "mouse");
        m.put("estadio", "arena");
        m.put("calumnia", "aspersion");
        m.put("aguacate", "avocado");
        m.put("cuerpo", "body");
        m.put("concurso", "contest");
        m.put("cena", "dinner");
        m.put("salida", "exit");
        m.put("lenteja", "lentil");
        m.put("cacerola", "pan");
        m.put("pastel", "pie");
        m.put("membrillo", "quince");
        for(int i = 0; i<5; i++){
            seleccion = m.getKey();
        }
    }
}
