package U6;

public class ejer7 {
    public static void main(String[] args) {
        System.out.println("Este programa te dirá los resultados de la lotería");
        System.out.printf(" 1 = premio\n 2 = Perdido\n X = empate\n ");
        System.out.print("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n");
        System.out.print("| 1 |");
        double resultado;
        for(int i = 0; i<15; i++){
            resultado= Math.random()*10+1;
            if(resultado <= 1.6){
            System.out.printf("\033[033m 1 \u001B[0m",resultado);
            System.out.print("|");
            }if(resultado > 1.6 && resultado<5){
            System.out.printf("\033[034m X \u001B[0m",resultado);
            System.out.print("|");
            }if(resultado >= 5){
            System.out.printf("\u001B[31m 2 \u001B[0m",resultado);
            System.out.print("|");

            }
        }
        System.out.println();
        System.out.print(" --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n");
        System.out.print("| 2 |");
        for(int i = 0; i<15; i++){
            resultado= Math.random()*10+1;
            if(resultado <= 1.6){
            System.out.printf("\033[033m 1 \u001B[0m",resultado);
            System.out.print("|");
            }if(resultado > 1.6 && resultado<5){
            System.out.printf("\033[034m X \u001B[0m",resultado);
            System.out.print("|");
            }if(resultado >= 5){
            System.out.printf("\u001B[31m 2 \u001B[0m",resultado);
            System.out.print("|");

            }
        }
        System.out.println();
        System.out.print(" --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n");
        System.out.print("| 3 |");
        for(int i = 0; i<15; i++){
            resultado= Math.random()*10+1;
            if(resultado <= 1.6){
            System.out.printf("\033[033m 1 \u001B[0m",resultado);
            System.out.print("|");
            }if(resultado >= 1.6 && resultado<5){
            System.out.printf("\033[034m X \u001B[0m",resultado);
            System.out.print("|");
            }if(resultado >= 5){
            System.out.printf("\u001B[31m 2 \u001B[0m",resultado);
            System.out.print("|");

            }
        }
        System.out.println();
        System.out.print(" --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n");

    }
}

