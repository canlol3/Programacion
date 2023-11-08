package U3;

public class ejer11 {
    public static void main(String[] args){
        String res;
        float cant;
        System.out.println("Cuantos KB quieres pasar a MB?");
        res = System.console() .readLine();
        cant = Integer.parseInt(res);
        System.out.println(cant / 1000);
    }
}
