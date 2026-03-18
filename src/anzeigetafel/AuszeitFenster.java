/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package anzeigetafel;

/**
 *
 * @author kokojambo
 */
import java.awt.GridLayout;
import javax.swing.*;

public class AuszeitFenster extends JFrame {

    private AuszeitButton[] buttons = new AuszeitButton[4];
    private AuszeitLabel team1Label;
    private AuszeitLabel team2Label;

    public AuszeitFenster() {
        super("Anzeige Tafel");

        JPanel mainPanel = new JPanel(new GridLayout(3, 2));

        team1Label = new AuszeitLabel("Team 1");
        team2Label = new AuszeitLabel("Team 2");

        mainPanel.add(team1Label);
        mainPanel.add(team2Label);

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new AuszeitButton();
            mainPanel.add(buttons[i]);
        }

        this.add(mainPanel);
        this.setLocation(500, 500);
        this.setSize(300, 300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public AuszeitButton[] getButtons() {
        return buttons;
    }

    public AuszeitLabel getTeam1Label() {
        return team1Label;
    }

    public AuszeitLabel getTeam2Label() {
        return team2Label;
    }
}
