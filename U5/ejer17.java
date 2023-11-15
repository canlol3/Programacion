package U5;
import java.util.Scanner;
public class ejer17 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num =s.nextInt();

        if( num >= 0 ){
            for(int i = num; i<num+100; i++){
                num = num;
                System.out.println(num);
            }
            System.out.println(num);
        }else{
            System.out.println("Tu número no es valido porque no es positivo");
        }
        s.close();
 
    }
}
