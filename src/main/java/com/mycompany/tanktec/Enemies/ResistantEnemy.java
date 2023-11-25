/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tanktec.Enemies;

/**
 *
 * @author Fabo
 */
public class ResistantEnemy extends EnemyTank{
    
    public ResistantEnemy(String icon, String name, int health, int timeBetweenShots, int speed) {
        super(icon, name, health, timeBetweenShots, speed);
    }
    
    
    public ResistantEnemy() {
        super("icono_predeterminado", "ResistantEnemy", 4, 2000, 2);
    }
    
}
