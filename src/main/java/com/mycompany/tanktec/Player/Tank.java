/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tanktec.Player;

/**
 *
 * @author Fabo
 */
public class Tank {
    
    private int timeBetweenShots;
    private String icon;
    private int health;
    private int x = 4; //Posicion coordenada x, siempre empieza en 4
    private int y = 12; //Posicion coordenada y, siempre empieza en 12
    private char direction;
    
    public Tank(int timeBetweenShots, String icon, int health, char direction) {
        this.timeBetweenShots = timeBetweenShots;
        this.icon = icon;
        this.health = health;
        this.direction = direction;
    }

    public char getDirection() {
        return direction;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }
    
    

    public int getTimeBetweenShots() {
        return timeBetweenShots;
    }

    public void setTimeBetweenShots(int timeBetweenShots) {
        this.timeBetweenShots = timeBetweenShots;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    


    
    
    
}
