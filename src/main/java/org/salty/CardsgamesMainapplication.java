package org.salty;

import org.salty.decks.Card;
import org.salty.examples.Conditionals;
import org.salty.examples.Loops;

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

        runLoopsExamples();

        new Conditionals().ifStatement();

    }

    private static void runLoopsExamples() {
        Loops loops = new Loops();

        loops.whileLoopExample();
        System.out.println();

        loops.doWhileLoopExample();
        System.out.println();

        loops.forLoopExample();
        System.out.println();

        loops.forEachLoopExample();
        System.out.println();

        loops.forEachLambdaExample();
        System.out.println();
    }

}
