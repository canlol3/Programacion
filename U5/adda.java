package U5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class adda extends JFrame implements ActionListener, KeyListener {

    private static final int WIDTH = 10;
    private static final int HEIGHT = 20;
    private static final int CELL_SIZE = 30;

    private Timer timer;
    private int[][] board;
    private int currentPieceX, currentPieceY;
    private boolean isFalling;

    public adda() {
        setTitle("Tetris");
        setSize(WIDTH * CELL_SIZE, (HEIGHT + 1) * CELL_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        board = new int[WIDTH][HEIGHT];
        timer = new Timer(500, this);
        timer.start();

        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

        newPiece();
    }

    public void newPiece() {
        currentPieceX = WIDTH / 2;
        currentPieceY = 0;
        isFalling = true;
    }

    public void actionPerformed(ActionEvent e) {
        if (isFalling) {
            moveDown();
        }
        repaint();
    }

    public void moveDown() {
        if (isValidMove(currentPieceX, currentPieceY + 1)) {
            currentPieceY++;
        } else {
            mergePiece();
            clearLines();
            newPiece();
        }
    }

    public void mergePiece() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (Piece.getShape()[i][j] != 0) {
                    board[currentPieceX + i][currentPieceY + j] = 1;
                }
            }
        }
    }

    public boolean isValidMove(int x, int y) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (Piece.getShape()[i][j] != 0) {
                    int newX = x + i;
                    int newY = y + j;

                    if (newX < 0 || newX >= WIDTH || newY >= HEIGHT || board[newX][newY] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public void clearLines() {
        for (int j = HEIGHT - 1; j >= 0; j--) {
            boolean isLineFull = true;
            for (int i = 0; i < WIDTH; i++) {
                if (board[i][j] == 0) {
                    isLineFull = false;
                    break;
                }
            }

            if (isLineFull) {
                for (int k = j; k > 0; k--) {
                    for (int i = 0; i < WIDTH; i++) {
                        board[i][k] = board[i][k - 1];
                    }
                }
            }
        }
    }

    public void paint(Graphics g) {
        super.paint(g);

        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                if (board[i][j] != 0) {
                    g.setColor(Color.BLUE);
                    g.fillRect(i * CELL_SIZE, j * CELL_SIZE, CELL_SIZE, CELL_SIZE);
                    g.setColor(Color.BLACK);
                    g.drawRect(i * CELL_SIZE, j * CELL_SIZE, CELL_SIZE, CELL_SIZE);
                }
            }
        }

        if (isFalling) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (Piece.getShape()[i][j] != 0) {
                        g.setColor(Color.RED);
                        g.fillRect((currentPieceX + i) * CELL_SIZE, (currentPieceY + j) * CELL_SIZE, CELL_SIZE, CELL_SIZE);
                        g.setColor(Color.BLACK);
                        g.drawRect((currentPieceX + i) * CELL_SIZE, (currentPieceY + j) * CELL_SIZE, CELL_SIZE, CELL_SIZE);
                    }
                }
            }
        }
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT && isValidMove(currentPieceX - 1, currentPieceY)) {
            currentPieceX--;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && isValidMove(currentPieceX + 1, currentPieceY)) {
            currentPieceX++;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN && isValidMove(currentPieceX, currentPieceY + 1)) {
            moveDown();
        } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            rotatePiece();
        }

        repaint();
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

    public void rotatePiece() {
        // Implement piece rotation logic here
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            adda tetris = new adda();
            tetris.setVisible(true);
        });
    }
}

class Piece {
    private static final int[][][] SHAPES = {
            {
                    {1, 1, 1, 1},
            },
            {
                    {1, 1},
                    {1, 1},
            },
            {
                    {1, 1, 1},
                    {0, 1, 0},
            },
            {
                    {1, 1, 1},
                    {1, 0, 0},
            },
    };

    public static int[][] getShape() {
        int[][] shape = SHAPES[(int) (Math.random() * SHAPES.length)];
        return shape.clone();
    }
}