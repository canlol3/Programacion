package U9.Ejercicio12;

public class Revista extends Publicacion {
    int numero;

    public Revista(int iSBN, String titulo, int año, int numero) {
        super(iSBN, titulo, año);
        this.numero = numero;
    }
}
