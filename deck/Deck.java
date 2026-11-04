package deck;

import java.util.ArrayList;
import card.*;

public class Deck {
    // list of cards
    private ArrayList<Card> deck;

    // constructors
    public Deck(){
        loadDeck();
        shuffleDeck();
    }

    public Deck(ArrayList <Card> deck){
        this.deck = deck; // null check
        shuffleDeck();
    }

    // load deck method
    public void loadDeck(){
        for(Suit s : Suit.values()){
            for (Rank r : Rank.values()) {
                Card c = new Card(s, r);
                deck.add(c);
            }
        }
    }

    // shuffle the deck method
    public void shuffleDeck() {
        for (int i = deck.size() - 1; i > 0; i--) {
            int randPos = (int) (Math.random() * i);
            swapElements(randPos, i);
        }

    }

    private void swapElements(int left, int right) {
        // make a temp assign left into it
        Card temp = deck.get(left);
        // replace the value left with the value at right
        deck.set(left, deck.get(right));
        // replace the value at right with the value in temp
        deck.set(right, temp);
    }


    // deal a card method
    public Card dealCard(){
        return deck.remove(deck.size() - 1);
    }

}
