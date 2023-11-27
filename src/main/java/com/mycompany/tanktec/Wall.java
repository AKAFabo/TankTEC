/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tanktec;

/**
 *
 * @author Fabo
 */
public class Wall {
    
    private int health = 4; //setted on the constructor

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }


    public void takeDamage(){
        this.health--;
    }
    
}
