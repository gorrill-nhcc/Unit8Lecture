package card;

public class Main {
    public static void main(String[] args) {
        Rank aceRank = Rank.ACE;
        System.out.println(aceRank);
        System.out.println(aceRank.getValue());

        Suit heartSuit = Suit.HEARTS;

        System.out.println(heartSuit);

        for(Suit s : Suit.values()){
            for (Rank r : Rank.values()) {
                System.out.printf("%s of %s, Value: %d\n", r.toString(), s.toString(), r.getValue());
            }
        }

        
    }
}
