package U9.Ejercicio8;

public class Terminal {
    private String numero;
    private int tiempoDeConversacion;
    Terminal(String numero){
        this.numero = numero;
        this.tiempoDeConversacion = 0;
        }
        public String getNumero(){
            return numero;
        }
        public String toString(){
            return numero + " - " + tiempoDeConversacion +"s e conversación";
        }
        public void llama(Terminal t, int tiempo){
            this.tiempoDeConversacion += tiempo;
            t.tiempoDeConversacion += tiempo;

        }
}

