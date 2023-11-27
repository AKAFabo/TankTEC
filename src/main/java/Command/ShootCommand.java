
package Command;

import Game.Game;

public class ShootCommand implements ICommand{
    public static final String COMMAND_NAME = "shoot";
    Game game;

    public ShootCommand(Game game) {
        this.game = game;
    }
    
    @Override
    public void execute(){
        //game.shoot();
    }
}
