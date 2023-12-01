import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import static java.lang.Math.*;


/**
 * Cubo que gira 360° de manera continua en el eje x.
 * @author Sebastian Rossi
 * Comentado a lo bestia para mejor comprension mia.
 * Idea sacada de una lista de desafios de programacion:
 *      Desafio 102 - Dibujar un cubo 3D que gire.
 * Para esto sirve aprender Algebra Lineal.
 */
public class Cubo extends JPanel { //en si, el cubo es un JPanel, asi que es como si estuviese de fondo el dibujo girando


    //nada elemento de nodos guarda las coordenadas de la linea
    double[][] nodos = {{-100, -100, -100}, {-100, -100, 100},  {-100, 100, -100}, {-100, 100, 100},
                        {100, -100, -100}, {100, -100, 100}, {100, 100, -100}, {100, 100, 100}};


    //cada elemento de bordes guarda que nodo tenrdra la linea {principio, final}
    int[][] bordes = {{0, 1}, {1, 3}, {3, 2}, {2, 0}, {4, 5}, {5, 7},
                      {7, 6}, {6, 4}, {0, 4}, {1, 5}, {2, 6}, {3, 7}};

    public Cubo() {
        setPreferredSize(new Dimension(640, 640)); //tamaño del JPanel (ocupara completamente el JFrame)
        setBackground(Color.ORANGE); // color de fondo del JPanel, no es necesario pero queda lindo

        girarCubo(PI/4, atan(sqrt(2))); // le da angulo

        // cambiara el angulo del cubo cada 17 milisegundos
        new Timer(17, (ActionEvent e)-> {
                girarCubo(PI/180,0); //el nuevo angulo, que sumara al anterior y dandole numeros locos nuevos
                repaint(); //tiene que redibujarlo cada vez qye cambia los valores
        }).start(); // esto lo arranca
    }

    /**
     * Este metodo deja sentado los datos para dibujar el Cubo
     * @param g2d
     */
    void dibujarCubo(Graphics2D g2d) {
        //el método paintComponent puede aplicar una transformación que le permita hacer que el origen este en el centro
        // del panel de visualizacion, para ello tiene que establecer la transformacion de coordenadas a una traslacion
        g2d.translate(getWidth() / 2, getHeight() / 2);

        // marcamos las lineas
        for (int[] borde : bordes) { // elige un borde
            //comienzo de la linea tendra los datos que estan en el nodo al cual se llega mediante el primer valor guardado en el nodo
            double[] comienzo = nodos[borde[0]];

            //final de la linea tendra los datos que estan en el nodo al cual se llega mediante el segundo valor guardado en el nodo
            double[] fin = nodos[borde[1]];

            //dibujamos la linea con los datos
            g2d.drawLine((int) round(comienzo[0]), (int) round(comienzo[1]), (int) round(fin[0]), (int) round(fin[1]));
        }
    }

    //por esto usa double en vez de int para matriz nodos

    /**
     * Metodo que le da angulo al cubo.
     * @param anguloX
     * @param anguloY
     */
    final void girarCubo(double anguloX, double anguloY){
        // calculamos las "constantes" para X
        double sinX = sin(anguloX);
        double cosX = cos(anguloX);

        // calculamos las "constantes" para Y
        double sinY = sin(anguloY);
        double cosY = cos(anguloY);

        // para cada nodo se calcula el angulo
        for (double[] nodo : nodos) {
            double x = nodo[0];
            double y = nodo[1];
            double z = nodo[2];

            nodo[0] = x * cosX - z * sinX;
            nodo[2] = z * cosX + x * sinX;

            z = nodo[2];

            nodo[1] = y * cosY - z * sinY;
            nodo[2] = z * cosY + y * sinY;
        }
    }


    /**
     * Sin esto no se dibujaria el cubo
     *          https://www.bogotobogo.com/Java/tutorials/javagraphics3.php
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // gracias a esto se hace el dibujo
        Graphics2D g2d = (Graphics2D) g; // Graphics2D hereda de Graphics, o sea, es lo mismo, péro tiene mas cosas, las cuales necesitamos aca.
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); //con esto, el dibujo se ve mejor.

        // y ahora, el dibujo
        dibujarCubo(g2d);

    }

    public static void main(String arg[]) {
        /*
        Los objetos Swing no son seguros en hilos (thread safe, no se como traducirlo bien).
        SwingUtilities.invokeLater() permite que una tarea sea ejectuda ejecutado en algún momento posterior,
         pero lo que es mas importante, la tarea sera ejecutada en el hilo de despacho de eventos AWT.
         Cuando se usa invokeLater, la tarea es ejecutada asincornicamente; tambien esta invokeAndWait,
         el cual no dara return hasta que la tarea sea terminada de ejecutar.
         Relacionado para toda esta clase:
         https://www.oracle.com/technetwork/java/painting-140037.html
        */
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.setTitle("El Cubo de Sebi");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.add(new Cubo(), BorderLayout.CENTER);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}