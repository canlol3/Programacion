package U3;

public class ejer10 {
    public static void main(String[] args){
        String res;
        int cant;
        System.out.println("Cuantos MB quieres pasar a KB?");
        res = System.console() .readLine();
        cant = Integer.parseInt(res);
        System.out.println(cant * 1000);
    }
}
