import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;


public class GameView extends JFrame implements ActionListener {
    public void showDialog() {
        JFrame frame = new JFrame("CyberDice");
        frame.setSize(300, 300);
        frame.setLocation(5, 5);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        
        
    
        frame.show();
    }

  public void actionPerformed(ActionEvent e) {
  }
}
