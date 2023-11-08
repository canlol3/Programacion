package U4;

public class ejer8 {
    public static void main(String[] args){

        System.out.println("¿Cual es tu primera nota?");
        String res = System.console() .readLine();
        double a = Integer.parseInt(res);

        System.out.println("¿Cual es tu segunda nota?");
        String res2 = System.console() .readLine();
        double b = Integer.parseInt(res2);

        System.out.println("¿Cual es tu tercera nota?");
        String res3 = System.console() .readLine();
        double c = Integer.parseInt(res3);
        
        double nota = ((a+b+c)/3);
        if (nota < 5){
            System.out.printf("Tienes un %.3f , tu nota es insuficiente \n",nota);
        }
                if (nota > 5){
            System.out.printf("Tienes un %.3f , tu nota es suficiente \n",nota);
        }
    }
}
