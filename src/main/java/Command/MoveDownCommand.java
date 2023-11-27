
package Command;

import Game.Game;

public class MoveDownCommand implements ICommand{
    public static final String COMMAND_NAME = "moveDown";
    Game game;

    public MoveDownCommand(Game game) {
        this.game = game;
    }
    
    @Override
    public void execute(){
        //game.moveDown();
    }
}
