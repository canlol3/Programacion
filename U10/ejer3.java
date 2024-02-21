package U10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;;
public class ejer3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for(int i = 0; i<10;i++){
            numeros.add(s.nextInt());
        }
        System.out.println(numeros);
        Collections.sort(numeros); 
        System.out.println(numeros);
        s.close();
    }
}
