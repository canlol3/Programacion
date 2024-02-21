package U9.Ejercicio12;

public class Publicacion {
   private int ISBN;
   private String titulo;
   private int año;
    Publicacion(int iSBN, String titulo, int año) {
        this.ISBN = iSBN;
        this.titulo = titulo;
        this.año = año;
    }
    @Override
    public String toString() {
        return "ISBN= " + ISBN + ", titulo= " + titulo + ", año= " + año;
    }

}
