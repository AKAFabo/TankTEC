package com.mycompany.tanktec;

public class GeneralTank {

    private String icon;
    private int health;
    private int x; //Posicion coordenada x, siempre empieza en 4
    private int y; //Posicion coordenada y, siempre empieza en 12
    private char direction;

    public GeneralTank(String icon, int health, int x, int y, char direction) {
        this.icon = icon;
        this.health = health;
        this.x = x;
        this.y = y;
        this.direction = direction;
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

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public char getDirection() {
        return direction;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void takeDamage(){
        this.health--;
    }
    
}
