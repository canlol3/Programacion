package U7;

public class Zejer3 {
    public static void main(String[] args) {
        int num[][] = new int[4][5];
        int total = 0;
        int total_final = 0;
        int total_columna = 0;
        for(int z = 0; z<4; z++){
        for(int i = 0; i<5; i++){
            num[z][i] = (int)(Math.random()*899)+100;
        }
        System.out.printf(" \n");
    }
    for(int z = 0; z<4;z++){
        for(int i = 0; i<5; i++){
            System.out.printf("%6d   ", num[z][i]);
            total = total + num[z][i];
            total_final= total_final+num[z][i];
        }
        System.out.print(total);
        System.out.println();
        total = 0;
    }
    for(int i = 0; i<6; i++){
        if(i<5){
            for(int z = 0; z<4; z++){
                total_columna = total_columna + num[z][i];
            }
            
            System.out.printf("%6d   ",total_columna);
            total_columna = 0;
        }else{
            System.out.print(total_final + " ");
        }
    }
    System.out.println();
    }
}
