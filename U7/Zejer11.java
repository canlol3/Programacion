package U7;

public class Zejer11 {

  public static void main(String[] args) {
    int numeros[][] = new int[10][10];
    for (int z = 0; z < 10; z++) {
      for (int i = 0; i < 10; i++) {
        numeros[i][z] = (int) (Math.random() * 100) + 200;
        System.out.printf("%3d ", numeros[i][z]);
      }
      System.out.println();
    }
    System.out.println();
    int i = 0;
    int maximo = 0; 
    int minimo = 300;
    double media = 0;
    int sumatorio = 0; 
    for (int z = 0; z < 10; z++) {
        if (maximo < numeros[i][z]){
            maximo = numeros[i][z];
        }if(minimo > numeros[i][z]){
            minimo=numeros[i][z];
        }
         System.out.printf("%3d ", numeros[i][z]);
          
          sumatorio = numeros[i][z] + sumatorio;
          i++;
    }
    media = sumatorio/10;
    System.out.println();
    System.out.println("El máximo es: " + maximo);
    System.out.println("El mínimo es: "+ minimo);
    System.out.println("La media es: "+ media);
  }
}
