package POO;

import javax.sound.midi.Soundbank;

public class Hero {
    private String name;
    private int level;
    private int health;
    private int maxHealth;
    private int experience;
    private int attack;
    private int defense;

    public Hero(String name, int level, int health, int maxHealth, int attack, int experience, int defense) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.maxHealth = maxHealth;
        this.experience = experience;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getExperience() {
        return experience;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int nivel) {
        this.level = nivel;
    }

    public void setHealth(int health) {
        if (health<0){
            health=0;
        }
        if (health>maxHealth){
            health=maxHealth;
        }
        this.health = health;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void drinkPotion() {
        int newHealth = health + 10;
        this.setHealth(newHealth);
    }

    void rest() {
        int newHealth = this.getHealth() + 50;
        this.setHealth(newHealth);
    }

    private void levelUp() {
        level++;
        health += 5;
        attack++;
        defense++;
        experience = 0;
    }

    public void attack(Hero otherHero) {
        int damage = Math.max(this.attack - otherHero.defense * 4, 10);
        int newHealth = otherHero.health - damage;
        otherHero.setHealth(newHealth);
        otherHero.health = Math.max(otherHero.health, 0);
        setExperience(experience + 10);
        if (experience >= 50) {
            levelUp();
        }
    }

    public String toString() {
        return "Heroe: " + name + "\n Nivel: " + level + "\n Vida: " + health + "\n Defensa: " + defense + "\n Ataque: " + attack + "\n Experience: " + experience;
    }


}
