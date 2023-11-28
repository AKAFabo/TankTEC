
package Tank;

public interface IComponent {
    public String getIcon();
    public void setIcon(String icon);
    
    public int getDuration();
    public void setDuration(int duration);
    
    public int getHealth();
    public void setHealth(int health);
    public void takeDamage();
    
    public int getTimeBetweenShots();
    public void setTimeBetweenShots(int timeBetweenShots);
    
    public int getSpeed();
    public void setSpeed(int speed);
    
    public char getDirection();
    public void setDirection(char direction);
    
    public int getX();
    public void setX(int x);
    public int getY();
    public void setY(int y);
    
    
}