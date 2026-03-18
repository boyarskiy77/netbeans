/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anzeigetafel;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author kokojambo
 */
public class AuszeitLabel extends JLabel {

    public AuszeitLabel(String text) {
        super(text, CENTER);
        this.setOpaque(true);
        this.setBackground(Color.white);   
    }

    public void setAuszeit() {
        this.setBackground(Color.yellow);  
    }

    public void endAuszeit() {
        this.setBackground(Color.white);   
    }
}

