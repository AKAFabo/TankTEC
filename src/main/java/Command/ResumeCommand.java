
package Command;

import Game.Game;

public class ResumeCommand implements ICommand{
    public static final String COMMAND_NAME = "resume";
    Game game;

    public ResumeCommand(Game game) {
        this.game = game;
    }
    
    @Override
    public void execute(){
        //game.shoot();
    }
}
