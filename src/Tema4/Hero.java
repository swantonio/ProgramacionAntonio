package Tema4;

public class Hero {
    String name;
    int level;
    int health;
    int maxHealth;
    int experience;
    int attack;
    int defense;

    public Hero() {
        this.name = "";
        this.level = 5;
        this.health = 5;
        this.maxHealth = 5;
        this.experience = 5;
        this.attack = 5;
        this.defense = 5;
    }
    public Hero(String name, int level, int health, int maxHealth, int experience, int attack, int defense) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.maxHealth = maxHealth;
        this.experience = experience;
        this.attack = attack;
        this.defense = defense;
    }
    public int drinkPotion(int health) {
        return health + 10;
    }
    public int rest (int health) {
        return health + 50;
    }
}
