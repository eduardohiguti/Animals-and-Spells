package Entities;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck;

    public Deck() {
        initializeDeck();
    }

    private void initializeDeck() {
        deck = new ArrayList<>();

        // Initialize animal cards
        deck.add(new Card("animal", "cat", 2, 4, 2));
        deck.add(new Card("animal", "dog", 3, 3, 2));
        deck.add(new Card("animal", "bird", 1, 2, 1));
        deck.add(new Card("animal", "cow", 8, 2, 3));
        deck.add(new Card("animal", "lion", 5, 6, 4));
        deck.add(new Card("animal", "hypo", 9, 10, 8));
        
        // Initialize spell cards
        deck.add(new Card("spell", "fireball", 6, 4));
   
        Collections.shuffle(deck);
    }

    public void distributeCards(ArrayList<Card> playerCards1, ArrayList<Card> playerCards2) {
        for (Card card : deck) {
            playerCards1.add(card);
            playerCards2.add(card);
        }

        deck.clear();
    }

}