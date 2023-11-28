
package Game;

import Command.CommandManager;
import Configuration.Configuration;
import Observer.Counter;
import Observer.DisplayCounter;
import com.mycompany.tanktec.levelBuilder;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Game {
    private GUI window;
    private Configuration config;
    private CommandManager manager;   
    
    private boolean isPaused;
    
    private int actualLevel;
    private int maxLevel;
    private int remainingEnemies;
    private int playerLifes;
    
    private int tankX; // Tank X coordenates
    private int tankY;
    
    private Counter shotsCounter;
    private Counter powerUpsCounter;
    private Counter destroyedTanks;
    
    /*
    private int TankX = 4;
    private int TankY = 12;
    int labelSize = 620 / 13;
    */
    
    public Game(GUI window){
        this.window = window;
        this.config = Configuration.getInstance();
        this.manager = CommandManager.getInstance();
        
        this.isPaused = false;
        
        this.actualLevel = config.getConfigValue("startLevel");
        this.maxLevel = config.getConfigValue("maxLevel");
        this.remainingEnemies = config.getConfigValue("startEnemies");
        this.playerLifes = config.getConfigValue("playerLifes");
        
        this.tankX = config.getConfigValue("initialTankX");
        this.tankY = config.getConfigValue("initialTankY");
        
        this.shotsCounter = new Counter();
        this.powerUpsCounter = new Counter();
        this.destroyedTanks = new Counter();
    }
    
    /*          Getters and Setters           */
    public int getActualLevel() {
        return actualLevel;
    }

    public int getRemainingEnemies() {
        return remainingEnemies;
    }

    public int getPlayerLifes() {
        return playerLifes;
    }
    
    
    
    /*                Methods                 */
    public void startGame(){
        
    }
    
    public void nextLevel() {
        actualLevel++;
        if (actualLevel <= maxLevel) {
            window.loadNextLevel(/*levelBuilder.levelChooser(actualLevel)*/);
        } else {
            System.out.println("¡Has completado todos los niveles!");
        }
    }
    
    public void increaseShots(){
        shotsCounter.increaseCounter();
    }
    
    public void increasePowerUp(){
        powerUpsCounter.increaseCounter();
    }
    
    public void increaseDestroyTanks(){
        destroyedTanks.increaseCounter();
    }
    
    public void addShotsCounterLabel(JLabel label, String title){
        shotsCounter.addObserver(new DisplayCounter(label, title));
    }
    
    public void addPowerUpsCounterLabel(JLabel label, String title){
        powerUpsCounter.addObserver(new DisplayCounter(label, title));
    }
    
    public void addDestroyedTanksLabel(JLabel label, String title){
        destroyedTanks.addObserver(new DisplayCounter(label, title));
    }
}
