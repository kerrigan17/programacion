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
  private static int POR_DEFECTO=200;

  public Hero(String name, int level, int health,int experience,int attack,int defense){
    this.name=name;
    this.level=level;
    this.health=health;
    this.maxHealth=POR_DEFECTO;
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

  public static int drinkPotion(Hero hero){
    int newHealth=hero.getHealth()+10;
    return newHealth;
  }

  public static int rest (Hero hero){
    int newHealth=hero.getHealth()+50;
    return newHealth;
  }
  private void levelUp() {
    level++;
    health += 5;
    attack++;
    defense++;
    experience = 0;
  }

  public static int attack(Hero hero, Hero otherHero) {
    int damage = Math.max(1, hero.getAttack() - otherHero.getDefense());
    int newHealth = otherHero.getHealth() - damage;
    hero.setExperience(hero.getExperience() + 10);
    if (hero.getExperience() >= 50) {
      hero.levelUp();
    }
    return newHealth;
  }

  public static void toString (Hero hero, Hero hero2){
    System.out.println("Nombre: " + hero.getName());
    System.out.println("Nivel: " + hero.getLevel());
    System.out.println("Nivel: " + hero.getMaxHealth());
    System.out.println("Vida: " + hero.getHealth());
    System.out.println("Defensa: " + hero.getDefense());
    System.out.println("Ataque: " + hero.getAttack());
    System.out.println("Experiencia: "+hero.getExperience());
    System.out.println("**********************");

    System.out.println("Estado inicial:");
    System.out.println("Hero1: " + hero.getHealth());
    System.out.println("Hero2: " + hero2.getHealth());

  }
  public static void toString1 (Hero hero, Hero hero2){
    System.out.println("\nDespués del ataque:");
    System.out.println("Hero1: " + hero.getHealth());
    System.out.println("Hero2: " + hero2.getHealth());

    System.out.println("\nDespués de beber poción y descansar:");
    System.out.println("Hero1: " + hero.getHealth());
    System.out.println("Hero2: " + hero2.getHealth());
  }

}
