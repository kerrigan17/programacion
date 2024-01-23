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

  public Hero(String name, int level, int health, int maxHealth, int attack, int experience,int defense){
    this.name=name;
    this.level=level;
    this.health=health;
    this.maxHealth=maxHealth;
    this.experience=experience;
    this.attack=attack;
    this.defense=defense;
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

  void rest(){
    int newHealth=this.getHealth()+50;
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
    int damage = Math.max(1, this.getAttack() - otherHero.getDefense());
    int newHealth = otherHero.getHealth() - damage;
    otherHero.setHealth(newHealth);
    setExperience(getExperience() + 10);
    if (getExperience() >= 50) {
      levelUp();
    }
  }

  public String toString (){

    System.out.println("Nombre: " + name);
    System.out.println("Nivel: " + level);
    System.out.println("MaxHealth: " + maxHealth);
    System.out.println("Vida: " +health);
    System.out.println("Defensa: " + defense);
    System.out.println("Ataque: " + attack);
    System.out.println("Experiencia: "+ experience);
    System.out.println("**********************");
    return "Heroe -> " + name +
            "\n Nivel ->" +level+
            "\n Vida maxima ->" +maxHealth+
            "\n Vida ->" +health+
            "\n Defensa ->" +defense+
            "\n Ataque ->" +attack;
  }


}
