package U9.Ejercicio3;

public abstract class Mamifero extends Animal {
    public Mamifero (Sexo Sexo_introducido){
        super(Sexo_introducido);
    }
    public void amamanta(){
        if(this.getSexo() == Sexo.MACHO){
        System.out.println("Soy macho no puedo amantar");
        }else{
            System.out.println("(Lo amamanta)");
        }
    }
    public void Criar(){
        System.out.println("Estoy cuidando de mi cria");
    }
    public void Andar(){
        System.out.println("Estoy andando");
    }
}
