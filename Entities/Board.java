package Entities;

import java.util.ArrayList;

public class Board {
    private ArrayList<Player> players;
    private ArrayList<Card> cardsInMiddle;

    public Board() {
        this.players = new ArrayList<>();
        this.cardsInMiddle = new ArrayList<>();
    }

    public void start(int playerID1, int playerID2) {
        Deck deck = new Deck();
        ArrayList<Card> playerCards1 = new ArrayList<>();
        ArrayList<Card> playerCards2 = new ArrayList<>();

        deck.distributeCards(playerCards1, playerCards2);

        players.add(new Player(playerID1, 1, 30, playerCards1));
        players.add(new Player(playerID2, 1, 30, playerCards2));
    }

    public void playCard(Player player, int cardIndex) {
        ArrayList<Card> playerCards = player.getPlayerCards();
        if (cardIndex >= 0 && cardIndex < playerCards.size()) {
            Card playedCard = playerCards.get(cardIndex);
            cardsInMiddle.add(playedCard);
            playerCards.remove(cardIndex);
        } else {
            System.out.println("Invalid card index");
        }
    }

    public void attack(Player attacker, Player target) {
        if (cardsInMiddle.isEmpty()) {
            System.out.println("No cards in the middle to attack with");
            return;
        }

        Card attackingCard = cardsInMiddle.get(0);

        int newHealth = target.getPlayerHealthPoints() - attackingCard.getDamage();
        target.setPlayerHealthPoints(newHealth);

        cardsInMiddle.clear();
    }

    public void updateGameState() {

    }

    public void showPlayerCards(Player player) {
        for(int i=0; i<player.getPlayerCards().size(); i++) {
            Card card = player.getPlayerCards().get(i);
            System.out.println(card);
        }
    }
}
