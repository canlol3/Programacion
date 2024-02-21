package U9.Ejercicio12;

public class Libro extends Publicacion implements Prestable{
    private boolean prestado = false;
    Libro(String isbn, String titulo, int año){
        super(año, titulo, año);
    }
    
}
