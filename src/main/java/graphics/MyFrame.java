/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphics;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Elisa Bothy
 */
public class MyFrame extends JFrame {
    MyButton b1, b2, b3 ;
    String a, b, c;
    JLabel north; 
    public MyFrame(){
        a = "Moi";
        b ="Toi";
        c = "Lui";
        b1= new MyButton(Color.PINK, a);
        b2= new MyButton(Color.BLUE, b);
        b3= new MyButton(Color.GREEN, c);
        north = new JLabel();
        initGui();
        
        this.pack();
        //centrer fenêtre
        this.setLocationRelativeTo(null);
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void initGui() {
        north.setLayout(new BoxLayout(north, BoxLayout.LINE_AXIS));
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.LINE_AXIS));
        this.add(b1);
        this.add(b2);
        this.add(b3);
       
        b1.addActionListener((ActionEvent ae) -> {
            JOptionPane.showMessageDialog(
                null, 
                "Vous avez cliqué sur " + a , 
                "Alerte !", 
                JOptionPane.ERROR_MESSAGE
        );
        });
        b2.addActionListener((ActionEvent ae) -> {
           JOptionPane.showMessageDialog(
               null, 
               "Vous avez cliqué sur " + b , 
               "Alerte !", 
               JOptionPane.ERROR_MESSAGE
        );
        });
        b3.addActionListener((ActionEvent ae) -> {
          JOptionPane.showMessageDialog(
              null, 
              "Vous avez cliqué sur " + c , 
               "Alerte !", 
               JOptionPane.ERROR_MESSAGE
        );
        });
    }
}
