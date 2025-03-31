

import javax.swing.JFrame;

public class Game extends JFrame{

    public Game() {
        
        setTitle("Tower Defence");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        GamePanel gamePanel = new GamePanel();
        add(gamePanel);
        pack();
        
        setLocationRelativeTo(null);
        setVisible(true);
    }
    

    public static void main(String[] args) {
        Game game = new Game();

    }

}
