/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tanktec.Player;

import com.mycompany.tanktec.GeneralTank;

/**
 *
 * @author Fabo
 */
public class Tank extends GeneralTank{
      
    public Tank(String icon, int health,  char direction) {
        super(icon, health, 4, 12, direction);
    }
      
}
