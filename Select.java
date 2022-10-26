import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
  
public class Select extends JFrame implements ActionListener {

  JButton next = new JButton("Next");

  JButton back = new JButton("Back");
  String[] gpu = { "Choose your Graphics Card!", "Nvidia RTX 4090", "Nvidia GTX 650", "AMD RX 470", "Nvidia GT 710" };
  String[] cpu = { "Choose your Processor!", "AMD Ryzen 7 7700X", "Intel Core i3 550", "AMD Opteron", "Intel Core i9 9900K" };
  String[] size = { "Choose your Case Size!", "ATX", "m-ATX", "ITX", "EATX" };
  String[] storage = { "Choose your Storage!", "1TB HDD", "1TB SSD", "2TB SSD", "46TB SSD" };
  String[] ram = { "Choose your Memory!", "2GB DDR1", "512MB SDRAM", "512GB DDR5", "4GB DDR3" };
  String[] psu = { "Choose your Power Supply!", "350W", "550W", "850W", "1250W" };
  String[] gpu2 = { "Choose your 2nd Graphics Card!", "None", "Nvidia RTX 4090", "Nvidia GTX 650", "AMD RX 470", "Nvidia GT 710" };
  

  JComboBox gpulist = new JComboBox(gpu);
  JComboBox cpulist = new JComboBox(cpu);
  JComboBox sizelist = new JComboBox(size);
  JComboBox storagelist = new JComboBox(storage);
  JComboBox ramlist = new JComboBox(ram);
  JComboBox psulist = new JComboBox(psu);
  JComboBox gpu2list = new JComboBox(gpu2);



  public String budget1;

  
  


  public Select(String budget) {
    setLayout(null);



    
    next.setBounds(310, 330, 80, 30);

    back.setBounds(10, 330, 80, 30);
    cpulist.setBounds(75, 30, 250, 20);
    gpulist.setBounds(75, 60, 250, 20);
    ramlist.setBounds(75, 90, 250, 20);
    storagelist.setBounds(75, 120, 250, 20);
    psulist.setBounds(75, 150, 250, 20);
    sizelist.setBounds(75, 180, 250, 20);
    gpu2list.setBounds(60, 280, 280, 20);





    this.add(next);
    this.add(cpulist);
    this.add(gpulist);
    this.add(ramlist);
    this.add(storagelist);
    this.add(psulist);
    this.add(sizelist);
    this.add(gpu2list);
    this.add(back);


    this.cpulist.setSelectedIndex(0);
    this.gpulist.setSelectedIndex(0);
    this.ramlist.setSelectedIndex(0);
    this.storagelist.setSelectedIndex(0);
    this.psulist.setSelectedIndex(0);
    this.sizelist.setSelectedIndex(0);
    this.gpu2list.setSelectedIndex(0);
    budget1 = budget;
    next.addActionListener(this);

    back.addActionListener(this);
  
    setTitle("PC Building Assistant - Selection");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(400,400);
    setVisible(true); 

    }

  public void actionPerformed(ActionEvent e) {
 //   if (e.getSource() == quit) {
 //     dispose();
//    } 
    if (e.getSource() == next) {
      End gui = new End(budget1);
      
      dispose();
      
    } else if (e.getSource() == back) {
      Start gui = new Start();
      gui.showDialog();
      dispose();
    
    }
  }

}