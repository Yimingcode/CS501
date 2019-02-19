import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;

public class Snake extends JFrame {

    public Snake() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Board());
        
        setResizable(false);
        pack();
        
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            JFrame ex = new Snake();
            ex.setVisible(true);
          
        });
       
        System.out.println("The size of each of the joints of a snake is 10 px.\n"
        		+ "The snake is controlled with the arrow keys.\n"
        		+ "Initially, the snake has two joints.\n"
        		+ "If the game is finished, the \"Game Over\" message is displayed in the middle of the board.");
        
    }
}