package org.salty.decks;

public class Card {

    private final CardSuit cardsuit;
    private final CardValue cardvalue;

    public Card(CardSuit cardsuit, CardValue cardvalue) {
        this.cardsuit = cardsuit;
        this.cardvalue = cardvalue;
    }

    public CardSuit getCardSuit() { return cardsuit; }
    public CardValue getCardValue() { return cardvalue; }

    @Override
    public String toString() {
        return String.format("%s of %s", cardvalue.getName(),cardsuit.toString());
    }

    public enum CardSuit{ DIAMONDS, HEARTS, SPADES, CLUBS }

    public enum CardValue {

        ACE("ACE",  13),
        KING("KING",  12),
        QUEEN("QUEEN",  11),
        JACK("JACK",  10),
        TEN("TEN",9),
        NINE("NINE",8),
        EIGHT("EIGHT",  7),
        SEVEN("SEVEN",  6),
        SIX("SIX",  5),
        FIVE("FIVE",  4),
        FOUR("FOUR",  3),
        THREE("THREE",  2),
        TWO("TWO",  1),
        ;

        CardValue(String name, int value) {
            this.name = name;
            this.value = value;
        }

        private final String name;
        private final int value;

        public String getName() { return name; }

        public int getValue() { return value; }
    }
}
