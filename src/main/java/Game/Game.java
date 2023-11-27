
package Game;

import Command.CommandManager;
import Configuration.Configuration;
import com.mycompany.tanktec.levelBuilder;
import java.awt.Dimension;
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
}
