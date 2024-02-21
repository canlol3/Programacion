package U9;

public class trycatch {
    public static void main(String[] args) {
        int division;
        try{
            division = 2/0;
        }catch(Exception e ){
            System.out.println("No se puede dividir por cero!!!");
        }
    }
}
