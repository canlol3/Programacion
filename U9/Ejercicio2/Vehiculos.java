package U9.Ejercicio2;

public abstract class Vehiculos {
    //Atributos de clase
    private static int kilometrosTotales = 0;
    private static int vehiculosCreados = 0;
    //Atributos de instancia
    private int kilometrosRecorridos;
    //Construnctor
    public Vehiculos(){
        this.kilometrosRecorridos = 0;
    }
    public int getKilometrosRecorridos(){
        return this.kilometrosRecorridos;
    }
    public static int getKilometrosTotales(){
        return Vehiculos.kilometrosTotales;
    }
    public void recorre(int distancia){
        this.kilometrosRecorridos += distancia;
        Vehiculos.kilometrosTotales += distancia;   
    }
}
