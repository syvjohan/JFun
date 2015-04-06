package clocks;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.regex.Pattern;


public class Input extends JFrame implements ActionListener, MouseListener {
    private Controller controller;
        
    private JPanel panel = new JPanel();
    private JFrame frame = new JFrame();
    
    private JLabel lbltimeAdjustment = new JLabel("Insert time adjustment: ");  
    private JLabel lblCity= new JLabel("insert city: ");
    private JLabel lblCityIs = new JLabel("");
    private JLabel lblDateTimeIs = new JLabel("");
    private JLabel lblErrWrongInput = new JLabel("Wrong input");
    
    private JTextField txtTimeadjustment = new JTextField("write adjustment time");
    private JTextField txtCity= new JTextField("write city name");
    
    private JButton btnCalculate = new JButton("Calculate time");
    
    public Input() {
        controller = new Controller();
        createGUI();
        
        frame.add(panel);
        frame.setSize(800, 600);
        frame.setVisible(true);
        
        txtCity.addMouseListener(this);
    }
    
    private void createGUI() {
        frame.setTitle("Welcome to the clockProgram");
        lblErrWrongInput.setVisible(false);
        
        GridBagLayout layout = new GridBagLayout();
        panel.setLayout(layout);
        
        GridBagConstraints gbl = new GridBagConstraints();
              
        //city
        gbl.fill = GridBagConstraints.HORIZONTAL;
        gbl.ipady = 10; 
        gbl.gridx = 0;
        gbl.gridy = 0;
        panel.add(this.lblCity, gbl);
        
        gbl.gridx = 1;
        gbl.gridy = 0;
        panel.add(this.txtCity, gbl);
        
        //Adjustment
        gbl.fill = GridBagConstraints.HORIZONTAL;
        gbl.ipady = 10; 
        gbl.gridx = 0;
        gbl.gridy = 1;
        panel.add(this.lbltimeAdjustment, gbl);
        
        gbl.gridx = 1;
        gbl.gridy = 1;
        panel.add(this.txtTimeadjustment, gbl);
        
        //Calculate
        gbl.fill = GridBagConstraints.HORIZONTAL;
        gbl.ipady = 10;
        gbl.gridx = 0;
        gbl.gridy = 2;
        panel.add(this.btnCalculate, gbl);
        
        //result
        gbl.fill = GridBagConstraints.HORIZONTAL;
        gbl.ipady = 10; 
        gbl.gridx = 0;
        gbl.gridy = 3;
        panel.add(this.lblCityIs, gbl);
        
        gbl.gridx = 1;
        gbl.gridy = 3;
        panel.add(lblDateTimeIs, gbl);
        
        gbl.fill = GridBagConstraints.HORIZONTAL;
        gbl.ipady = 10;
        gbl.gridx = 0;
        gbl.gridy = 4;
        panel.add(lblErrWrongInput, gbl);
        
        btnCalculate.addActionListener(this);
    }
    
    private void clearTextFields() {
        txtTimeadjustment.setText("write adjustment time");
        txtCity.setText("write city name");
    }
    
    private boolean onlyAlpha(String value) {
        String regex = "[a-zA-Z]+";
        if (value.matches(regex)) {
            return true;
        }
        return false;
    }
    
    private boolean onlyNumbers(String value) {
        String regex = "[0-9]+";
        if (value.matches(regex)) {
            return true;
        }
        return false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        boolean res = onlyNumbers(txtTimeadjustment.getText());
        boolean res2 = onlyAlpha(txtCity.getText());
           
        if (res && res2) {
            Data data = new Data(null, txtCity.getText(), Integer.parseInt(txtTimeadjustment.getText()));
            
            controller.calculateData(data);
            
            lblDateTimeIs.setText(controller.getTime());
            lblCityIs.setText(controller.getCity());
            lblErrWrongInput.setVisible(false);
            
        } else {         
            lblErrWrongInput.setVisible(true);
            lblCityIs.setText(null);
            lblDateTimeIs.setText(null);
        }
       
       clearTextFields();
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        txtCity.setText(null);
        txtTimeadjustment.setText(null);
    }
    
    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
    @Override
    public void mouseEntered(MouseEvent e) {
        
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
        
    }
}
