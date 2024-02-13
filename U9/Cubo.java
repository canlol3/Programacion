package U9;

public class Cubo {
    int capacidad;
    int contenido;
    //CONSTRUCTOR
    Cubo(int c){
        this.capacidad = c;
    }
    //GETTERS
    int getCapacidad(){
        return this.capacidad;
    }
    int getContenido(){
        return this.contenido;
    }
    //SETTERS
    void setContenido(int litros){
        this.contenido = litros;
    }
    //OTROS
    void vacia(){
        this.contenido = 0;
    }
    void llena(){
        this.contenido = this.capacidad;
    }
    void pinta(){
        for(int nivel = this.capacidad; nivel > 0; nivel--){
            if(this.contenido >= nivel){
                System.out.println("*===*");
            }else{
                System.out.println("*   *");
            }
        }
        System.out.println("*****");
    }
    void vuelcaEn(Cubo destino ){
        int libres = destino.getCapacidad() - destino.getContenido();
        
        if(libres > 0) {
            if (this.contenido <= libres){
                destino.setContenido(destino.getContenido() + this.contenido);
                this.vacia();
            }else{
                this.contenido = libres;
                destino.llena();
            }
        }
    }
}
