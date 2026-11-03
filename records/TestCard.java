package records;

public class TestCard {
    public static void main(String[] args) {
        Card c1 = new Card(Suit.HEARTS, Rank.ACE);
        Card c2 = new Card(Suit.CLUBS, Rank.KING);
        System.out.println(c1.rank() + " of " + c1.suit());
        System.out.println(c1);

        if(c1.rank().getValue() > c2.rank().getValue()){
            System.out.println(c1.toString() + " is higher than " + c2);
        } else {
            System.out.println(c2 + " is higher than " + c1);
        }
    }
}
