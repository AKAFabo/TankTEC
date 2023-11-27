
package Command;

import Game.Game;

public class PauseCommand implements ICommand{
    public static final String COMMAND_NAME = "pause";
    Game game;

    public PauseCommand(Game game) {
        this.game = game;
    }
    
    @Override
    public void execute(){
        //game.shoot();
    }
}
