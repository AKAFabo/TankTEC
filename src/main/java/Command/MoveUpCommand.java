
package Command;

import Game.Game;

public class MoveUpCommand implements ICommand{
    public static final String COMMAND_NAME = "moveUp";
    Game game;

    public MoveUpCommand(Game game) {
        this.game = game;
    }
    
    @Override
    public void execute(){
        //game.moveUp();
    }
}
