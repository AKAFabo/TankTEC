
package Tank;

import Configuration.Configuration;

public class AbstractDecorator implements IComponent{
    protected IComponent tank;
    private int duration; // Wildcard duration, negative if not has limit time 
    private String description;
    private int timeBetweenShots;
    private int speed;
    
    public AbstractDecorator(IComponent tank, int duration, String description, int timeBetweenShots, int speed){
        this.tank = tank;
        this.duration = duration;
        this.description = description;
        this.timeBetweenShots = timeBetweenShots;
        this.speed = speed;
    }
    
    public int getDuration(){
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getDescription(){
        return description;
    }
    
    @Override
    public int getTimeBetweenShots() {
        return tank.getTimeBetweenShots() + this.timeBetweenShots;
    }
    
    @Override
    public int getSpeed() {
        return tank.getSpeed() + this.speed;
    }

    @Override
    public String getIcon() {
        return tank.getIcon();
    }

    @Override
    public void setIcon(String icon) {
        tank.setIcon(icon);
    }

    @Override
    public int getHealth() {
        return tank.getHealth();
    }

    @Override
    public void setHealth(int health) {
        tank.setHealth(health);
    }

    @Override
    public void takeDamage() {
        tank.takeDamage();
    }

    @Override
    public void setTimeBetweenShots(int timeBetweenShots) {
        this.timeBetweenShots = timeBetweenShots;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public char getDirection() {
        return tank.getDirection();
    }

    @Override
    public void setDirection(char direction) {
        tank.setDirection(direction);
    }

    @Override
    public int getX() {
        return tank.getX();
    }

    @Override
    public void setX(int x) {
        tank.setX(x);
    }

    @Override
    public int getY() {
        return tank.getY();
    }

    @Override
    public void setY(int y) {
        tank.setY(y);
    }
}

class ClockPowerUp_ extends AbstractDecorator{
    
    public ClockPowerUp_(IComponent tank) {
        super(tank, 0, "Stops the enemy tanks for 10 seconds.", 0, 0);
        Configuration config = Configuration.getInstance();
        setDuration(config.getConfigValue("clockTime"));
    }
}

class TankPowerUp_ extends AbstractDecorator{
    
    public TankPowerUp_(IComponent tank) {
        super(tank, -1, "higherSpeed", 0, 0);
        Configuration config = Configuration.getInstance();
        setSpeed(config.getConfigValue("higherSpeed"));
    }
}

class StartPowerUp_ extends AbstractDecorator{
    
    public StartPowerUp_(IComponent tank) {
        super(tank, -1, "The own tank fires more quickly.", 0, 0);
        Configuration config = Configuration.getInstance();
        setTimeBetweenShots(config.getConfigValue("higherTimeBetweenShots"));
    }
}

class ShovelPowerUp_ extends AbstractDecorator{
    
    public ShovelPowerUp_(IComponent tank) {
        super(tank, 0, "Protects the fort or base with metal for 20 seconds.", 0, 0);
        Configuration config = Configuration.getInstance();
        setDuration(config.getConfigValue("shovelTime"));
    }
}
class BombPowerUp_ extends AbstractDecorator{
    
    public BombPowerUp_(IComponent tank) {
        super(tank, 0, "Destroys all enemy tanks that are on-screen at that precise moment.", 0, 0);
        Configuration config = Configuration.getInstance();
    }
}
class HelmetPowerUp_ extends AbstractDecorator{
    
    public HelmetPowerUp_(IComponent tank) {
        super(tank, 0, "Provides a 10-second protective barrier to the own tank.", 0, 0);
        Configuration config = Configuration.getInstance();
        setDuration(config.getConfigValue("helmetTime"));
    }
}