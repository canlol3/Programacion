package U6;

public class ejer16 {
    public static void main(String[] args) {
        
        int res = 0;
        res = (int)(Math.random()*5);

        int res2 = 0;
        res2 = (int)(Math.random()*5);

        int res3 = 0;
        res = (int)(Math.random()*5);

        int res_anterior = 0;
        int win = 0;
        for(int i = 0; i<3; i++){
            if (res == res_anterior && i > 0){
                win++;
            }
            res_anterior = res;
            if(res == 0){
                System.out.print(" 🔔​");
            }
                        if(res == 1){
                System.out.print(" ​🍎​");
            }
                        if(res == 2){
                System.out.print(" ​🍋​​");
            }
                        if(res == 3){
                System.out.print(" ​​💎​​");
            }
                        if(res == 4){
                System.out.print(" ​​​🧲​​");
            }
            if(i ==0 ){
                res = res2;
            }if(i == 1){
                res = res3;
            }
        }
        System.out.println();
        if(win == 0){
            System.out.print("Lo siento, ha perdido\n");
        }if(res == res2 && win ==1|| res == res3 && win == 1){
            System.out.print("Bien, ha recuperado la moneda\n");

        }if(win == 2 ){
         System.out.print("Enhorabuena, ha ganado 10 monedas\n");

        }
    
    }
}
