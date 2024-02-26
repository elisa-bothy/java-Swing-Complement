/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphics;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author Elisa Bothy
 */
public class MyButton extends JButton {
    
    public MyButton(Color color, String a){
        this.setBackground(color);
        this.setText(a);
    }
}
