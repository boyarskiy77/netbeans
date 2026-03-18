/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anzeigetafel;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;

/**
 *
 * @author kokojambo
 */
public class AuszeitButton extends JButton {

    public AuszeitButton() {
        super();//optional
        this.setBackground(Color.green);
    }

    public void setAuszeit() {
        this.setText("A");
        this.setBackground(Color.GRAY);
        this.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
    }

    public void endAuszeit() {
        this.setText("");
        this.setBackground(Color.RED);
        this.setBorder(null);
    }
}
