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


      private JButton roundnew = new JButton("start a new round");
      private JLabel player1 = new JLabel("Player 1");
      private JLabel player2 = new JLabel("Player 2");

      public GameView() {
        this.setLayout(null);
        this.setTitle("CyberDice");
        roundnew.setBounds(510, 610, 170, 40);
        player1.setBounds(20, 30, 100, 20);
        player2.setBounds(340, 30, 100, 20);

        this.add(roundnew);
        this.add(player1);
        this.add(player2);

        this.setSize(690, 690);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

      }
      @Override
      public void actionPerformed(ActionEvent e) {
  
      }
        
}








