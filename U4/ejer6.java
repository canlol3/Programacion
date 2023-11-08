package U4;

public class ejer6 {
    public static void main(String[] args){
        System.out.println("¿A cuanta altura esta tu objeto");
        String res = System.console() .readLine();
        float h = Integer.parseInt(res);
        System.out.println("Tu objeto tardara en caer " + Math.sqrt((2*h)/9.8) + "s");
    }
}
