package U10.ejer8;

public class Carta {
    private static String[] cartas = 
    {"1 oro","2 oro","3 oro","4 oro","5 oro","6 oro","7 oro","8 oro","9 oro","10 oro",
    "1 bastos","2 bastos","3 bastos","4 bastos","5 bastos","6 bastos","7 batos","8 batos","9 bastos","10 bastos",
    "1 espada","2 espada","3 espada","4 espada","5 espada","6 espada","7 espada","8 espada","9 espada","10 espada"
    }; 
    private String carta;
    public Carta(){
        this.carta = cartas[(int)(Math.random()*30)];
    }

    public String getCarta() {
        return carta;
    }

    @Override
    public String toString() {
        return "Carta [carta=" + carta + "]";
    }
    
}
