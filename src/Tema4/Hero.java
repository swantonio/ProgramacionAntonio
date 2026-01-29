package Tema4;

public class Hero {
    private String name;
    private int level;
    private int health;
    private int maxHealth;
    private int experience;
    private int attack;
    private int defense;

    private final int potionVal = 10;
    private final int restVal = 50;
    private final int xpLimit = 50;
    private final int xpGain = 10;
    private final int minDmgCap = 10;
    private final int levelUpHealth = 5;
    private final int levelUpStat = 1;

    public Hero(String name, int health, int attack, int defense) {
        this.name = name;
        this.health = health;
        this.maxHealth = health;
        this.attack = attack;
        this.defense = defense;
        this.level = 1;
        this.experience = 0;
    }

    public void drinkPotion() {
        this.health += potionVal;
        if (this.health > this.maxHealth) {
            this.health = this.maxHealth;
        }
    }

    public void rest() {
        this.health += restVal;
        if (this.health > this.maxHealth) {
            this.health = this.maxHealth;
        }
    }

    public void attack(Hero enemy) {
        int damageCalc = this.attack - enemy.getDefense();
        int maxDmg = Math.max(damageCalc, minDmgCap);
        int damageDealt = (int) (Math.random() * maxDmg) + 1;

        enemy.receiveDamage(damageDealt);
        this.experience += xpGain;

        if (this.experience >= xpLimit) {
            levelUp();
        }
    }

    public void receiveDamage(int amount) {
        this.health -= amount;
        if (this.health < 0) {
            this.health = 0;
        }
    }
    private void levelUp() {
        this.level++;
        this.maxHealth += levelUpHealth;
        this.health += levelUpHealth;
        this.attack += levelUpStat;
        this.defense += levelUpStat;
        this.experience = 0;
    }
    public int getHealth() {
        return health;
    }

    public int getDefense() {
        return defense;
    }

    public String getName() {
        return name;
    }
    public String toString() {
        return "Nombre: " + name + " Nivel: " + level + " Salud: " + health + "/" + maxHealth +
                " Ataque: " + attack + " Defensa: " + defense + " XP: " + experience;
    }
}