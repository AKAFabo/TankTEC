/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tanktec.Enemies;

/**
 *
 * @author Fabo
 */
public class FastEnemy extends EnemyTank{
    
    private FastEnemy(String icon, String name, int health, int timeBetweenShots, int speed, int x, String direction) {
        super(icon, name, health, timeBetweenShots, speed, x, 'S');
    }
    
   // public FastEnemy() {
    //    super("icono_predeterminado", "Fast Enemy", 1, 2000, 2);
    //}
    
}
