package P1;

import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Input implements ActionListener {
    private JPanel panel = new JPanel();
    private JFrame frame = new JFrame();
        
    private Controller controller;
        
    private JLabel lblTitle = new JLabel("Title");  
    private JLabel lblAuthor = new JLabel("Författare");
    private JLabel lblIsbn = new JLabel("ISBN");

    private JTextField txtTitle = new JTextField();
    private JTextField txtAuthor = new JTextField();
    private JTextField txtIsbn = new JTextField(50);
    
    private JButton btnAdd = new JButton("Lägg till bok");
    
    public Input(Controller controller) {
        this.controller = controller;
        
        createGUI();
        frame.add(panel);
        
        frame.pack();
        frame.setVisible(true);
    }

    private void createGUI() {
       frame.setTitle("Ny Bok");
    
        GridBagLayout layout = new GridBagLayout();
        panel.setLayout(layout);
        
        GridBagConstraints gbl = new GridBagConstraints();
        
        //Title
        gbl.fill = GridBagConstraints.HORIZONTAL;
        gbl.ipady = 10; 
        gbl.gridx = 0;
        gbl.gridy = 0;
        panel.add(this.lblTitle, gbl);
        
        gbl.gridx = 1;
        gbl.gridy = 0;
        panel.add(this.txtTitle, gbl);
        
        //Author
        gbl.fill = GridBagConstraints.HORIZONTAL;
        gbl.ipady = 10; 
        gbl.gridx = 0;
        gbl.gridy = 1;
        panel.add(this.lblAuthor, gbl);
        
        gbl.gridx = 1;
        gbl.gridy = 1;
        panel.add(this.txtAuthor, gbl);
        
        //ISBN
        gbl.fill = GridBagConstraints.HORIZONTAL;
        gbl.ipady = 10;    
        gbl.gridx = 0;
        gbl.gridy = 2;
        panel.add(this.lblIsbn, gbl); 

        gbl.gridx = 1;
        gbl.gridy = 2;       
        panel.add(this.txtIsbn, gbl);  
        
        //Button
        gbl.gridx = 0;
        gbl.gridy = 3;      
        gbl.fill = GridBagConstraints.HORIZONTAL;
        gbl.gridwidth = 2;
        panel.add(this.btnAdd ,gbl);  
        
        btnAdd.addActionListener(this);

    }
    
    private void clearTtxtFields() {
        txtTitle.setText(null);
        txtAuthor.setText(null);
        txtIsbn.setText(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
            String t = this.txtTitle.getText();
            String a = this.txtAuthor.getText();
            String i = this.txtIsbn.getText();
            
            controller.getInput(t, a, i);
           
            clearTtxtFields();
    }
    
}
