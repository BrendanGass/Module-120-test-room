import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class GameView extends JFrame implements ActionListener {
      private JPanel pnl1 = new JPanel(); //Panel, welches andere Panels aufnimmt
      private int y = 0;

      public GameView() {
        this.setLayout(null);
        pnl1.setLayout(null);
        pnl1.setSize(210, 210);

        this.setSize(450, 450);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

      }
      @Override
      public void actionPerformed(ActionEvent e) {
  
      }
        
}








