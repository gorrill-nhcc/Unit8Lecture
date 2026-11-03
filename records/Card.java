package records;

// A record automatically generates:
// - private final fields for suit and face
// - a canonical constructor Card(Suit suit, Face face)
// - public getter methods suit() and face() (note: no 'get' prefix)
// - toString(), equals(), and hashCode() implementations
public record Card(Suit suit, Rank rank) {

    // Compact constructor for validation (no parameter list needed here)
    public Card {
        if (suit == null || rank == null) {
            throw new IllegalArgumentException("Card suit and face cannot be null.");
        }
    }

    // Custom instance method specific to Blackjack logic
    public boolean isAce() {
        return rank == Rank.ACE;
    }

    // Overriding toString for a clean custom display format
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

enum Suit {
    HEARTS, DIAMONDS, CLUBS, SPADES
}

enum Rank {
    TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7),
    EIGHT(8), NINE(9), TEN(10), JACK(10), QUEEN(10), KING(10), ACE(11);

    private final int value;

    Rank(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}