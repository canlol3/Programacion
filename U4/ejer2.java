package U4;

public class ejer2 {
    public static void main(String[] args){
        System.out.println("¿Que hora es?");
        String res = System.console() .readLine();
        int hora = Integer.parseInt(res);
        if (hora>=6 && hora<12){
            System.out.println("Buenos dias");
        }
                if (hora>13 && hora<20){
            System.out.println("Buenas tardes");
        }
                if (hora>21 || hora<=5){
            System.out.println("Buenas noches");
        }
    }
}
