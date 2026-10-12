package GAME;
import java.util.Random;

abstract class Enemy {
	protected final Random random = new Random();
	 // Basic Information
    private String name;
    private int level;
    private EnemyRarity rarity;

    // Stats
    private int hp;
    private int maxHp;
    private int attack;
    private int defense;
    private int agility;
    private int intelligence;

    // Combat
    private int criticalChance;
    private int criticalDamage;
    private int accuracy;
    private int dodgeChance;

    // Rewards
    private int expReward;
    private int goldReward;

    // Location
    private MapLocation location;

    // Status
    private boolean alive = true;

    // Constructor
    public Enemy(String name,
                 int level,
                 EnemyRarity rarity,
                 int hp,
                 int attack,
                 int defense,
                 int agility,
                 int intelligence,
                 int criticalChance,
                 int criticalDamage,
                 int accuracy,
                 int dodgeChance,
                 int expReward,
                 int goldReward,
                 MapLocation location) {

        this.name = name;
        this.level = level;
        this.rarity = rarity;

        this.hp = hp;
        this.maxHp = hp;

        this.attack = attack;
        this.defense = defense;
        this.agility = agility;
        this.intelligence = intelligence;

        this.criticalChance = criticalChance;
        this.criticalDamage = criticalDamage;
        this.accuracy = accuracy;
        this.dodgeChance = dodgeChance;

        this.expReward = expReward;
        this.goldReward = goldReward;

        this.location = location;
    }

    public abstract void attack(GameCharacter player);

    public abstract void skill(GameCharacter player);
    
    public abstract void takeTurn(GameCharacter player);
    
    
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public EnemyRarity getRarity() {
        return rarity;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getAgility() {
        return agility;
    }

    public int getCriticalChance() {
        return criticalChance;
    }

    public int getCriticalDamage() {
        return criticalDamage;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public int getDodgeChance() {
        return dodgeChance;
    }

    public int getExpReward() {
        return expReward;
    }

    public int getGoldReward() {
        return goldReward;
    }

    public MapLocation getLocation() {
        return location;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void takeDamage(int damage) {
        hp -= damage;

        if (hp <= 0) {
            hp = 0;
            alive = false;
        }
    }

    public void heal(int amount) {
        hp += amount;

        if (hp > maxHp) {
            hp = maxHp;
        }
    }

	public abstract Items getDrop();
	
}

