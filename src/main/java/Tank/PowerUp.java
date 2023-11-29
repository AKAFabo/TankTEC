/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tank;

import Game.GUI;

public abstract class PowerUp extends Thread{
    GUI window;
    
    public PowerUp(GUI window){
        this.window = window;
    }
    
    public void run(){
        System.out.println("Tank.PowerUp.run()");
    }
}
