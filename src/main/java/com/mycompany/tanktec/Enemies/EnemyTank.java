/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tanktec.Enemies;

/**
 *
 * @author Fabo
 */
public class EnemyTank {
    
    private String icon;
    private String name;
    private int health; //Means the amount of shots the tank can receive
    private int timeBetweenShots; //worked in ms using config archive
    private int speed; //means how fast the tank changes fields, the higher the lower the speed, because it means seconds between tile change
    private int x;
    private int y = 0;
    private char direction;

    public EnemyTank(String icon, String name, int health, int timeBetweenShots, int speed, int x, char direction) {
        this.icon = icon;
        this.name = name;
        this.health = health;
        this.timeBetweenShots = timeBetweenShots;
        this.speed = speed;
        this.x = x;
        this.direction = direction;
    }
    
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getTimeBetweenShots() {
        return timeBetweenShots;
    }

    public void setTimeBetweenShots(int timeBetweenShots) {
        this.timeBetweenShots = timeBetweenShots;
    }
    
    public void takeShot(){
        
        this.health--;
    }
    
    
    
}
