package Entities;

import java.util.ArrayList;

public class Player {
    private int playerID;
    private int playerEnergy;
    private int playerHealthPoints;
    private ArrayList<Card> playerCards;

    public Player(int playerID, int playerEnergy, int playerHealthPoints, ArrayList<Card> playerCards) {
        this.playerID = playerID;
        this.playerEnergy = playerEnergy;
        this.playerHealthPoints = playerHealthPoints;
        this.playerCards = playerCards;
    }

    public int getPlayerID() {
        return playerID;
    }

    public int getPlayerEnergy() {
        return playerEnergy;
    }

    public void setPlayerEnergy(int playerEnergy) {
        this.playerEnergy = playerEnergy;
    }

    public int getPlayerHealthPoints() {
        return playerHealthPoints;
    }

    public void setPlayerHealthPoints(int playerHealthPoints) {
        this.playerHealthPoints = playerHealthPoints;
    }

    public ArrayList<Card> getPlayerCards() {
        return playerCards;
    }

    public void setPlayerCards(ArrayList<Card> playerCards) {
        this.playerCards = playerCards;
    }
}
