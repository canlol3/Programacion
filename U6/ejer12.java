package U6;

public class ejer12 {
    public static void main(String[] args) {
        int num; 
        char ascii;
        for(int i = 1; i>0; i++){
            num = (int)(Math.random()*94)+33;
            ascii =(char)num;
            System.out.print("\033[0;32m "+ascii+"\u001B[0m");
        }
            
        
    }
}
