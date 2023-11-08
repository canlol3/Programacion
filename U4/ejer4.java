package U4;

public class ejer4 {
    public static void main(String[] args){
        double euro;
        System.out.println("¿Cuantas horas has trabajado esta semana?");
        String res = System.console() .readLine();
        int horas = Integer.parseInt(res);
        if (horas <= 40){
             euro = horas * 12;
        } else{
             euro = (horas - 40 ) * 16 + 480;
        }
        System.out.println("Su cobro de esta semana es: " + euro );
    }
}
