import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
  
public class Start extends JFrame implements ActionListener {

  JButton startprg = new JButton("Start");

  JButton quit = new JButton("Quit");
  JLabel budgetLabel = new JLabel("Input your budget!");
  JLabel title = new JLabel("PC Building Assistant");
  JTextField budgetfield = new JTextField();

  public String budget;

  
  


  public void showDialog() {
    setLayout(null);

    budgetfield.setBounds(75, 200, 250, 20);

    budgetLabel.setBounds(75, 180, 250, 20);
//    title.setBounds(75, 100, 250, 20);
    title.setBounds(30, 70, 400, 50);
    
    startprg.setBounds(100, 240, 200, 40);

    quit.setBounds(100, 295, 200, 40);

    title.setFont(new Font("Arial", Font.PLAIN, 32));
    
    this.add(title);
    this.add(budgetfield);

    this.add(budgetLabel);

    this.add(startprg);

    this.add(quit);

    startprg.addActionListener(this);

    quit.addActionListener(this);
  
    setTitle("PC Building Assistant");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(400,400);
    setVisible(true); 

    }

  public void actionPerformed(ActionEvent e) {
 //   if (e.getSource() == quit) {
 //     dispose();
//    } 
    if (e.getSource() == startprg) {
      budget = budgetfield.getText();
      Select gui = new Select(budget);

      dispose();
      
    } else if (e.getSource() == quit) {
      dispose();
    
    }
  }

}