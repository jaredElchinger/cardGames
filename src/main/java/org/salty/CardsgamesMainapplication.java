package org.salty;

import org.salty.decks.Card;

import java.util.ArrayList;
import java.util.List;

public class CardsgamesMainapplication {

    public static void main(String[] args) {

        List<Card> cards = new ArrayList<>();

        Card.CardSuit[] cardSuits = Card.CardSuit.values();
        for (Card.CardSuit cardSuit : cardSuits) {

            Card.CardValue[] cardValues = Card.CardValue.values();
            for (Card.CardValue cardValue : cardValues) {

                cards.add(new Card(cardSuit, cardValue));
            }
        }

        for(Card card : cards){
            System.out.println(card.toString());

        }
    }
}
