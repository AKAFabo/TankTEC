/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tanktec.Enemies;

/**
 *
 * @author Fabo
 */
public class SimpleEnemy extends EnemyTank{
    
    private SimpleEnemy(String icon, String name, int health, int timeBetweenShots, int speed) {
        super(icon, name, health, timeBetweenShots, speed); //Used for testing
    }
    
    public SimpleEnemy() {
        super("icono_predeterminado", "Simple Enemy", 2, 2000, 2);
    }
    
}
