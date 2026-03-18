/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anzeigetafel;

/**
 *
 * @author kokojambo
 */
public class Hauptprogramm {
        /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        AuszeitFenster myFrame = new AuszeitFenster();
        AuszeitButton[] buttons = myFrame.getButtons();
                
        Thread.sleep(2000);

        myFrame.getTeam1Label().setAuszeit();
        buttons[0].setAuszeit();  
        Thread.sleep(2500);

        myFrame.getTeam1Label().endAuszeit();
        buttons[0].endAuszeit();
    }
}

