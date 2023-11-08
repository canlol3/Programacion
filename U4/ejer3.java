package U4;

public class ejer3 {
    public static void main(String[] args){
        System.out.println("Dime un número del 1 al 7");
        String res = System.console() .readLine();
        int x = Integer.parseInt(res);
        if (x == 1){
            System.out.println("El uno corresponde con el lunes");
        }
                if (x == 2){
            System.out.println("El dos corresponde con el martes");
        }
                if (x == 3){
            System.out.println("El tres corresponde con el miercoles");
        }
                if (x == 4){
            System.out.println("El cuatro corresponde con el jueves");
        }
                if (x == 5){
            System.out.println("El cinco corresponde con el viernes");
        }
                if (x == 6){
            System.out.println("El seis corresponde con el sabado");
        }
                if (x == 7){
            System.out.println("El siete corresponde con el domingo");
        }
    }
}
