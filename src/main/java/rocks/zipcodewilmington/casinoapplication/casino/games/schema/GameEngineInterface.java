package rocks.zipcodewilmington.casinoapplication.casino.games.schema;

/**
 * @author leon on 9/1/18.
 */
public interface GameEngineInterface<
        GameTypePlayer extends PlayerInterface,
        GameType extends GameInterface<GameTypePlayer>> {
    GameType getGame();
    void evaluateTurn(GameTypePlayer player);
    void run();
}
