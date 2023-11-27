
package Command;

import Game.Game;

public class MoveLeftCommand implements ICommand{
    public static final String COMMAND_NAME = "moveLeft";
    Game game;

    public MoveLeftCommand(Game game) {
        this.game = game;
    }
    
    @Override
    public void execute(){
        //game.leftUp();
    }
}
