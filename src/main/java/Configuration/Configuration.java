
// This configuration class uses Singleton Pattern

package Configuration;

import java.util.HashMap;
import java.util.Map;

public class Configuration {
    
    private static Configuration instance;  
    private Map<String, Integer> configSettings; // All configurations here
    
    private Configuration(){
        configSettings = new HashMap<>();
        // Relevant Data
        setConfigValue("boardSize", 13);
        setConfigValue("startEnemies", 20);
        setConfigValue("playerLifes", 3);
        setConfigValue("maxLevel", 8);
        setConfigValue("startLevel", 1);

        
        setConfigValue("initialTankX", 4);
        setConfigValue("initialTankY", 12);
        
        // Behavior
        setConfigValue("timeBetweenShots", 500);
        setConfigValue("higherTimeBetweenShots", 1000);
        setConfigValue("speed", 1);
        setConfigValue("higherSpeed", 10);
        
        // PowerUp
        setConfigValue("clockTime", 10000); // Miliseconds
        setConfigValue("shovelTime", 20000); // Miliseconds
        setConfigValue("helmetTime", 10000); // Miliseconds
    }
    
    public static synchronized Configuration getInstance(){
        if(instance == null){
            instance = new Configuration();
        }
        return instance;
    }
    
    public int getConfigValue(String key) {
        return configSettings.get(key);
    }

    private void setConfigValue(String key, int value) {
        configSettings.put(key, value);
    }

    public void removeConfigValue(String key) {
        configSettings.remove(key);
    }

    public Map<String, Integer> getAllConfigSettings() {
        return new HashMap<>(configSettings);
    }
}
