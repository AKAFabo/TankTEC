/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tank;

/**
 *
 * @author fabri
 */
public class Test {
    public static void main(String[] args) {
        IComponent tank = new PlayerTank("", 4, 500, 5, 'w',0, 0);
        //tank = new HelmetPowerUp(tank);
    
        System.out.println("Speed: " + ((AbstractDecorator) tank).getDuration());
    }
}
