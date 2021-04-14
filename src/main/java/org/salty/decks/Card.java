package org.salty.decks;

public class Card {

    private final CardSuit cardSuit;
    private final CardValue cardValue;

    public Card(CardSuit cardSuit, CardValue cardValue) {
        this.cardSuit = cardSuit;
        this.cardValue = cardValue;
    }

    public CardSuit getCardSuit() { return cardSuit; }
    public CardValue getCardValue() { return cardValue; }

    @Override
    public String toString() {
        return String.format("%s OF %s", cardValue.getName(), cardSuit.toString());
    }

    public enum CardSuit { DIAMONDS, HEARTS, SPADES, CLUBS }

    public enum CardValue {

        ACE("ACE", 13),
        KING("KING", 12),
        QUEEN("QUEEN", 11),
        JACK("JACK", 10),
        TEN("TEN", 9),
        NINE("NINE", 8),
        EIGHT("EIGHT", 7),
        SEVEN("SEVEN", 6),
        SIX("SIX", 5),
        FIVE("FIVE", 4),
        FOUR("FOUR", 3),
        THREE("THREE", 2),
        TWO("TWO", 1),
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
