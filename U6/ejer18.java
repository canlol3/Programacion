package U6;

public class ejer18 {

  public static void main(String[] args) {
    int res1 = 0; 
    int res2 = 0;
    int res3 = 0;
    boolean diferentes = false;
    while(diferentes = false){
      res1 = (int)(Math.random()*6);
      res2 = (int)(Math.random()*6);
      res3 = (int)(Math.random()*6);
      if(res1 != res2 && res1 != res3 && res2 != res3){
        diferentes = true;
      }
    }
    for(int i = 0; i<3; i++){
      if(res1 == 0){
        System.out.print("rojo");
      }if(res1 == 1){
        System.out.print("azul");
      }if(res1 == 2){
        System.out.print("verde");
      }if(res1 == 3){
        System.out.print("amarillo");
      }if(res1 == 4){
        System.out.print("violeta");
      }if(res1 == 5){
        System.out.print("naranja");
      }
       
    }


    }
  }
