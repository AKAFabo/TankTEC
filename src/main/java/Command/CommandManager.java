
package Command;

import java.util.HashMap;

public class CommandManager {   
    // CommandManager uses Singleton Pattern
    private static CommandManager commandManager;  
    //Hash of ICommands: command name, class that instance ICommand
    private static final HashMap<String, Class<? extends ICommand>> COMMANDS =          
            new HashMap<String, Class<? extends ICommand>>();       
    
    private CommandManager() {   
        registerCommand(PauseCommand.COMMAND_NAME, PauseCommand.class);
        registerCommand(ResumeCommand.COMMAND_NAME, ResumeCommand.class);   
        registerCommand(ShootCommand.COMMAND_NAME, PauseCommand.class);
        registerCommand(MoveUpCommand.COMMAND_NAME, ResumeCommand.class); 
        registerCommand(MoveDownCommand.COMMAND_NAME, PauseCommand.class);
        registerCommand(MoveLeftCommand.COMMAND_NAME, ResumeCommand.class); 
        registerCommand(MoveRightCommand.COMMAND_NAME, PauseCommand.class);
    }       
    
    public static synchronized CommandManager getInstance() {           
        if (commandManager == null) {               
            commandManager = new CommandManager();   
        }
        return commandManager;   
    }       
    
    public ICommand getCommand(String commandName) {           
        if (COMMANDS.containsKey(commandName.toUpperCase())) {               
            try {   
                   // returns a new instance of the require command
                return COMMANDS.get(commandName.toUpperCase()).newInstance();
            } catch (Exception e) {   
                e.printStackTrace();     
            }           
        } 
        else {

        }
        return null;
    }
    
    public void registerCommand(String commandName, Class<? extends ICommand> command) {   
        COMMANDS.put(commandName.toUpperCase(), command);   
    }   
}

