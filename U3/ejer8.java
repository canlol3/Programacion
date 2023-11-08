package U3;

public class ejer8 {
    public static void main(String[] args){
        String horas;
        int res;
        System.out.println("¿Cuantas hotas has trabajado?");
        horas = System.console() .readLine();
        res = Integer.parseInt(horas);
        System.out.println(res * 12);
    }
}
