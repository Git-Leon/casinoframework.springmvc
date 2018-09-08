package rocks.zipcodewilmington.casinoapplication.casino.games.cardgames.toolkit;

/**
 * @author leon on 9/8/18.
 */
public class Card {

    private final Rank rank;
    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public int getValue() {
        return rank.getValue();
    }

    public String toString() {
        return getRank().name() + " of " + getSuit().name();
    }
}
