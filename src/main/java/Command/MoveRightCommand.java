
package Command;

import Game.Game;

public class MoveRightCommand implements ICommand{
    public static final String COMMAND_NAME = "moveRight";
    Game game;

    public MoveRightCommand(Game game) {
        this.game = game;
    }
    
    @Override
    public void execute(){
        //game.moveRight();
    }
}
