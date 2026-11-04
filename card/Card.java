package card;

/**
 * The Card class represents a common playing card.
 * The Card class will be set up as immutable. This means
 * the state of an object cannot be changed. 
 * Why would we make an immutable Card class?
 * Do we want user clients to be able to mutate the state of a card
 * that has been dealt?
 * <p>
 * This class uses the {@link Suit} enum for the card's suit
 * (such as Hearts or Spades) and the {@link Rank} enum for
 * its value (such as Ace or King).
 * </p>
 */
public class Card {
    // instance variables
    private final Suit SUIT;
    private final Rank RANK;

    // Constructors
    public Card(Suit suit, Rank rank){
        SUIT = suit;
        RANK = rank;
    }

    public int getRankValue(){
        return RANK.getValue();
    }
    
    public String getRankString(){
        String rankStr = RANK.toString();
        rankStr = rankStr.toLowerCase();
        rankStr = rankStr.substring(0, 1).toUpperCase() + rankStr.substring(1);
        return rankStr;
    }

    public String getSuitString(){
        return SUIT.toString().substring(0, 1) + SUIT.toString().substring(1).toLowerCase();
    }

    public String toString(){
        return getSuitString() + " of " + getRankString();
    }
}
