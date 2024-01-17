package U7;

public class ejer10 {
    public static void main(String[] args) {
        int []num = new int[20];
        int []par = new int[20];
        int []impar = new int[20];
        int pares = 0;
        int impares = 0; 
        for(int i = 0; i<20; i++){
            num[i] = (int)(Math.random()*101);
            if(num[i]%2 == 0 ){
                par[pares++] = num[i];
            }else{
                impar[impares++] = num[i];
            }
        }  
        for(int i = 0; i<20; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < pares; i++){
            num[i] = par[i];
        }
        for(int i = pares; i<20; i++){
            num[i] = impar[i - pares];
        }
        for(int i = 0; i <20 ; i++){
            System.out.print(num[i] + " ");
        }
    }
}
