package U9.Ejercicio4;

public class Fraccion {
    int numerador;
    int denominador;
    public Fraccion(int numerador2, int denominador2){
        this.numerador = numerador2; 
        this.denominador = denominador2;
    }
    void Invierte(){
        System.out.println(this.denominador);
        System.out.println("---");
        System.out.println(this.numerador);
    }
    void Simplifica(){
        while(this.denominador%2 == 0){
            this.denominador = this.denominador/2;
        }
        while (this.numerador%2 == 0) {
            this.numerador = this.numerador/2;
        }
        System.out.println(this.numerador);
        System.out.println("---");
        System.out.println(this.denominador);
    }
    void Multiplica(){
        System.out.println(this.denominador * this.numerador);
    }
    void Divide(){
        System.out.println(this.numerador / this.denominador);
    }
}
