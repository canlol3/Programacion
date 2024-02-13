package U9.Ejercicio3;

public abstract class Animal {
    private Sexo sexo;

    public Animal(Sexo Sexo_introducido){
        this.sexo = Sexo_introducido;
    }
    public Sexo getSexo(){
        return this.sexo;
    }
    public void duerme(){
        System.out.println("Zzzzzz");
    }
    public void comer(String comida){
        System.out.println("Estoy comiendo "+ comida);
    }
}
