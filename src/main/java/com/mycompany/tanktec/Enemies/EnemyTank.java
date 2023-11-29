/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tanktec.Enemies;

import com.mycompany.tanktec.GeneralTank;

/**
 *
 * @author Fabo
 */
public class EnemyTank extends GeneralTank{
    private boolean hasPowerUp;
      
    public EnemyTank(String icon, int health, int x, char direction, boolean powerUp) {
        super(icon, health, x, 0, direction);
        this.hasPowerUp = powerUp;
    }
    
    public boolean getHasPowerUp(){
        return hasPowerUp;
    }
}
