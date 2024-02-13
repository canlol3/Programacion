package U9.Ejercicio3;

public class Gato extends Mamifero {
    private String raza;
    public Gato(Sexo Sexo_introducido,String raza){
        super(Sexo_introducido);
        this.raza = raza;
    }
    public void Pelar(Sexo contrincante){
        if(getSexo() == Sexo.MACHO && contrincante == Sexo.MACHO){
            System.out.println("Te voy a rebentar pringao");
        }else{
            System.out.println("No puedo pelear losiento");
        }
    }
    public void Maullar(){
        System.out.println("Miauuuu");
    }
    public void getInfo(){
        System.out.println(this.raza);
        System.out.println(this.getSexo());
    }
}
