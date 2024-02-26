/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphics;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Elisa Bothy
 */
public class MyFrame extends JFrame {
    MyButton b1 ;
    String a;
    public MyFrame(){
        a = "Moi";
        b1= new MyButton(Color.PINK, a);
        initGui();
        
        this.pack();
        //centrer fenêtre
        this.setLocationRelativeTo(null);
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void initGui() {
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.add(b1);
        b1.addActionListener((ActionEvent ae) -> {
            JOptionPane.showMessageDialog(
                null, 
                "Vous avez cliqué " , 
                "info", 
                JOptionPane.WARNING_MESSAGE
        );
        });
    }
}
