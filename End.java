import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
  
public class End extends JFrame implements ActionListener {

  JButton finish = new JButton("Finish");


  JButton export = new JButton("Export");
  JLabel budgetLabel = new JLabel();

  
  public String budget1;
  
  


  public End(String budget1) {
    setLayout(null);

    DefaultListModel<String> l1 = new DefaultListModel<>();  
          l1.addElement("Intel Core i3 550");  
          l1.addElement("Nvidia RTX 4090");  
          l1.addElement("4GB DDR3");  
          l1.addElement("1TB HDD");  
          l1.addElement("350W");
          l1.addElement("EATX");  
          l1.addElement("Nvidia GT 710");  
    JList<String> list = new JList<>(l1);
    finish.setBounds(310, 330, 80, 30);


    export.setBounds(10, 330, 80, 30);
    budgetLabel.setBounds(75, 10, 250, 20);
    list.setBounds(75, 40, 250, 280);

 

    this.add(finish);
    this.add(budgetLabel);
    this.add(list);
    this.add(export);
    budgetLabel.setText("Budget: " + String.valueOf(budget1) + " CHF");
    
    finish.addActionListener(this);
    

    export.addActionListener(this);
  
    setTitle("PC Building Assistant - Done");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(400,400);
    setVisible(true); 

    }

  public void actionPerformed(ActionEvent e) {
 //   if (e.getSource() == quit) {
 //     dispose();
//    } 
    if (e.getSource() == finish) {
      
      dispose();
      
    
    } else if (e.getSource() == export) {
      
    
    }
  }

}