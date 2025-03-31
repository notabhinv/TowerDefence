

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {

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
    Thread gameThread;

    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start();
    }


    @Override
    public void run() {
       while (gameThread != null) {
         
            // 1 Update
            update();
            // 2 Draw
            repaint();

       }
    }

    public void update(){
        System.out.println("Update");
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.red);
        g2.fillRect(48, 48, tileSize, tileSize);
        g2.dispose();
    }

}
