/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tank;

import Game.GUI;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fabri
 */
public class ShovelPowerUp extends PowerUp{
    public ShovelPowerUp(GUI window){
        super(window);
    }
    
    @Override
    public void run(){
        window.protectBase();
        try {
            sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ShovelPowerUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        window.unprotectBase();
    }
}