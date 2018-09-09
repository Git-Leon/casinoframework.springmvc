package rocks.zipcodewilmington.casinoapplication.casino.games.cardgame.blackjack;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.casinoapplication.casino.games.cardgames.blackjack.BlackJackGame;
import rocks.zipcodewilmington.casinoapplication.casino.games.cardgames.blackjack.BlackJackGameEngine;
import rocks.zipcodewilmington.casinoapplication.casino.games.cardgames.blackjack.BlackJackPlayer;
import rocks.zipcodewilmington.casinoapplication.casino.games.cardgames.toolkit.Card;
import rocks.zipcodewilmington.casinoapplication.casino.games.cardgames.toolkit.Rank;
import rocks.zipcodewilmington.casinoapplication.casino.games.cardgames.toolkit.Suit;

/**
 * @author leon on 9/8/18.
 */
public class BlackJackGameEngineTest {
    @Test
    public void testBlackJackPlayerWithBlackJack() {
        // Given : initialization
        Card ace = new Card(Rank.ACE, Suit.CLUBS);
        Card jack = new Card(Rank.JACK, Suit.CLUBS);
        BlackJackPlayer bjp = new BlackJackPlayer(null);
        BlackJackGame bjg = new BlackJackGame();
        BlackJackGameEngine bjge = new BlackJackGameEngine(bjg);

        // Given : Setup
        bjg.addPlayer(bjp);
        bjp.addCard(ace);
        bjp.addCard(jack);

        // When
        bjge.evaluateTurn(bjp);

        // Then : TODO - implement `then` clause
        Assert.fail();
    }
}
