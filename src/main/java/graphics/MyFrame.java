/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Elisa Bothy
 */
public class MyFrame extends JFrame {
    MyButton b1, b2, b3 ;
    String a, b, c;
    JPanel north; 
    JPanel south;
    public MyFrame(){
        a = "ROUGE";
        b ="VERT";
        c = "BLEU";
        b1= new MyButton(Color.BLUE, a);
        b2= new MyButton(Color.RED, b);
        b3= new MyButton(Color.GREEN, c);
        north = new JPanel();
        south = new JPanel();
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
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        north.add(b1);
        north.add(b2);
        north.add(b3);
        south.setPreferredSize(new Dimension(200, 400));
        south.setOpaque(true);
        this.add(north);
        
        north.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        b1.addActionListener((ActionEvent ae) -> {
            south.setBackground(Color.RED);
        });
        b2.addActionListener((ActionEvent ae) -> {
            south.setBackground(Color.GREEN);
        });
        b3.addActionListener((ActionEvent ae) -> {
           south.setBackground(Color.BLUE);
        });
        this.add(south);
    }
}
