package Entities;

public class Card {
    private String type;
    private String name;
    private int healthPoints;
    private int damage;
    private int energyCost;

    //spell
    public Card(String type, String name, int damage, int energyCost) {
        this.type = type;
        this.name = name;
        this.damage = damage;
        this.energyCost = energyCost;
    }

    //animal
    public Card(String type, String name, int healthPoints, int damage, int energyCost) {
        this.type = type;
        this.name = name;
        this.healthPoints = healthPoints;
        this.damage = damage;
        this.energyCost = energyCost;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getDamage() {
        return damage;
    }

    public int getEnergyCost() {
        return energyCost;
    }

    public String toString() {
        return "Type: " + type
            + "\nName: " + name
            + "\nHP: " + healthPoints
            + "\nDamage: " + damage
            + "\nEnergy Cost: " + energyCost;

    }
}
