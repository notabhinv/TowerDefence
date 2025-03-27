package Main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

//SCREEN SETTINGS
final int OringnalTileSIze = 16; //16x16
final int scale = 3;
final int tileSize =OringnalTileSIze*scale; //48x48 tile
final int MaxScrColumn = 16;
final int MaxScrROw = 16;
final int screenWidth = MaxScrColumn * tileSize;  //768 pixels
final int screenHeight = MaxScrROw * tileSize;  //768 pixels


    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillRect(0, 0,32,32);
        g.setColor(Color.BLACK);

    }

}
