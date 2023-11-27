/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tanktec.Enemies;

/**
 *
 * @author Fabo
 */
public class StrongEnemy extends EnemyTank{
    
    public StrongEnemy(String icon, String name, int health, int timeBetweenShots, int speed){
        super(icon, name, health, timeBetweenShots, speed);
    }
    
    public StrongEnemy() {
        super("icono_predeterminado", "Strong Enemy", 1, 2000, 2);
    }
}
