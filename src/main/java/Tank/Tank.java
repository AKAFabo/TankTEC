
package Tank;


public abstract class Tank implements IComponent{
    private String icon;
    private int duration;
    private int health;
    private int timeBetweenShots;
    private int speed; //means how fast the tank changes fields, the higher the lower the speed, because it means seconds between tile change
    private char direction;
    private int x; //Posicion coordenada x, siempre empieza en 4
    private int y; //Posicion coordenada y, siempre empieza en 12
    
    public Tank(String icon, int health, int timeBetweenShots, int speed, char direction, int posicionX, int posicionY){
        this.icon = icon;
        this.health = health;
        this.timeBetweenShots = timeBetweenShots;
        this.speed = speed;
        this.direction = direction;
        this.x = posicionX;
        this.y = posicionY;
    }
    
    @Override
    public int getDuration(){
        return duration;
    }
    
    @Override
    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    @Override
    public String getIcon() {
        return icon;
    }
    
    @Override
    public void setIcon(String icon) {
        this.icon = icon;
    }
    
    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }    
    
    @Override
    public void takeDamage(){
        this.health--;
    }

    @Override
    public int getTimeBetweenShots() {
        return timeBetweenShots;
    }
    
    @Override
    public void setTimeBetweenShots(int timeBetweenShots) {
        this.timeBetweenShots = timeBetweenShots;
    }
    
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    @Override
    public char getDirection() {
        return direction;
    }

    @Override
    public void setDirection(char direction) {
        this.direction = direction;
    }
    
    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }
}
