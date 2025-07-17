import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;




public class SnakeGame extends JPanel{
    private class Tile{
        int x;
        int y;

        Tile(int x, int y){
            this.x = x;
            this.y = y;

        }

    }


    int boardHeight;
    int boardWidth;
    int tileSize = 25;

    Tile snakeHead;


    SnakeGame(int boardWidth,int boardHeight){
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;

        setPreferredSize(new Dimension(this.boardWidth,this.boardHeight));
        setBackground(Color.DARK_GRAY);

        snakeHead = new Tile(5, 5);

    }





}
