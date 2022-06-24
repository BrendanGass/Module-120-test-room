import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Start extends JFrame implements ActionListener {

  JButton startgame = new JButton("Start");
  JButton quit = new JButton("Quit");
  JLabel player1Label = new JLabel("Player 1");
  JLabel player2Label = new JLabel("Player 2");
  JTextField player1 = new JTextField();
  JTextField player2 = new JTextField();
  public String name1;
  public String name2;
  
  


  public void showDialog() {
    setLayout(null);

    player1.setBounds(10, 40, 250, 20);
    player2.setBounds(310, 40, 250, 20);
    player1Label.setBounds(10, 20, 250, 20);
    player2Label.setBounds(310, 20, 250, 20);
    startgame.setBounds(35, 70, 200, 40);
    quit.setBounds(335, 70, 200, 40);

    this.add(player1);
    this.add(player2);
    this.add(player1Label);
    this.add(player2Label);
    this.add(startgame);
    this.add(quit);

    startgame.addActionListener(this);
    quit.addActionListener(this);
  
    setTitle("Welcome to CyberDice");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(570,300);
    setVisible(true); 

    }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == startgame) {
      new GameView();
    } else if (e.getSource() == quit) {
      dispose();
    }
 

  }
  
}