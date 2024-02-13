package U9;

public class GatoSimple {
    String color, raza, sexo;
    int edad;
    double peso;
    GatoSimple (String s){
        this.sexo = s;
    }
    String getSexo(){
    return this.sexo;
    }
    void maulla(){
        System.out.println("MIAUUUUU");
    }
    void ronronear(){
        System.out.print("rrrrrrr");
    }
    void Comer(String comida){
        if(comida.equals("pescado")){
            System.out.println("Hmmmm, gracias");
        }else{
            System.out.print("No me gusta :(");
        }
    }
    void Pelea(GatoSimple contrincante){
        if(this.sexo.equals("hembra")){
            System.out.println("No me gusta pelear");
        }else{
            if(contrincante.getSexo().equals("hembra")){
                System.out.println("No peleo con gatitas");
            }else{
                System.out.println("Te voy a reventar");
            }
        }
    }
}
