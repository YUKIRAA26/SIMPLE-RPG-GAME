package GAME;

abstract class GameCharacter {
	
	protected String Name;
	private CharacterClass characterClass;
	private int Intelligence;
	private int Agility;
	private int Level;
	private int Exp;
	private int limitExp;
	private int Gold;
	private int Hp;
	private int MaxHp;
	private int Mana;
	private int MaxMana;
	private int Attack;
	private int Defense;
	private int CriticalChance;
	private int CriticalDamage;
	private int SkillPoints;
	
	private Inventory inventory = new Inventory();
	
	public Inventory getInventory() {
		return inventory;
	}
	
	//characterWeapon
	
	private Weapon weapon;
	private Armors armor;
	
	GameCharacter(String Name) {
        this.Name = Name;
        this.Level = 1;
        this.Exp = 0;
        this.limitExp = 100;
        this.Gold = 0;
    }
	
	//characClass
	public void setCharacterClass(CharacterClass characterClass) {
		this.characterClass = characterClass;
	}
	
	public CharacterClass getCharacterClass() {
		return characterClass;
	}
	
	//Health
	
	public void setHp(int Hp) {
		this.Hp = Hp;
	}
	
	public int getHp() {
		return Hp;
	}
	
	//Name
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public String getName() {
		return Name;
	}
	
	//Exp
	
	public void setExp(int Exp) {
		this.Exp = Exp;
	}
	
	public int getExp() {
		return Exp;
	}
	
	//Mana
	
	public void setMana(int Mana) {
		this.Mana = Mana;
	}
	
	public int getMana() {
		return Mana;
	}
	
	//attack
	
	public void setAttack(int Attack) {
		this.Attack = Attack;
	}
	
	public int getAttack() {
		return Attack;
	}
	
	//defense
	
	public void setDefense(int Defense) {
		this.Defense = Defense;
	}
	
	public int getDefense() {
		return Defense;
	}
	
	//Critcal damage
	
	public void setCriticalDamage(int CriticalDamage) {
		this.CriticalDamage = CriticalDamage;
	}
	
	public int getCriticalDamage() {
		return CriticalDamage;
	}
	
	//Critical Chance
	
	public void setCriticalChance(int CriticalChance) {
		this.CriticalChance = CriticalChance;
	}
	
	public int getCriticalChance() {
		return CriticalChance;
	}
	
	//skill points
	
	public void setSkillPoints(int SkillPoints) {
		this.SkillPoints = SkillPoints;
	}
	
	public int getSkillPoints() {
		return SkillPoints;
	}
	
	
	public void setGold(int Gold) {
		this.Gold = Gold;
	}
	
	public int getGold() {
		return Gold;
	}
	
	public int getIntelligence() {
		return Intelligence;
	}

	public void setIntelligence(int intelligience) {
		Intelligence = intelligience;
	}

	public int getAgility() {
		return Agility;
	}

	public void setAgility(int agility) {
		Agility = agility;
	}
	
	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void setLevel(int Level) {
		this.Level = Level;
	}
	
	public int getLevel() {
		return Level;
	}
	
	abstract void attack(Enemy enemy);
    abstract void skill1(Enemy enemy);
    abstract void skill2(Enemy enemy);
    abstract void skill3(Enemy enemy);
    
    void displayStats() {
    	System.out.println("==============");
        System.out.println("Name: " + Name);
        System.out.println("Class: " + characterClass);
        System.out.println("Level: " + Level);
        System.out.println("Exp: " + Exp + "/" + limitExp);
        System.out.println("HP: " + Hp);
        System.out.println("Gold: " + Gold);
        System.out.println("--------------");
        System.out.println("Health: " + getHp() + "/" + getTotalMaxHp());
	    System.out.println("Mana: " + getTotalMana());
	    System.out.println("Attack " + getTotalAttack());
	    System.out.println("Defense: " + getTotalDefense());
	    System.out.println("Intelligence: " + getTotalIntelligence());
	    System.out.println("Agility: " + getTotalAgility());
	    System.out.println("CriticalChance: " + getTotalCriticalChance());
	    System.out.println("CriticalDamage: " + getTotalCriticalDamage());   
	    System.out.println("================");
    }
    
    
    
    
    //total stats
    //Adding Exp
    
    public void addExp(int ammount) {
    	Exp += ammount;
    }
    
    //Adding gold
    
    public void addGold(int ammount) {
    	Gold += ammount;
    }
    
    
    public int getTotalAttack() {

        if(weapon == null)
            return Attack;

        return Attack + weapon.getAttack();
    }
    
    public int getTotalIntelligence() {

        if(weapon == null)
            return Intelligence;

        return Intelligence + weapon.getIntelligence();
    }
    
    public int getTotalDefense() {

        if(weapon == null)
            return Defense;

        return Defense + weapon.getDefense();
    }
    
    public int getTotalAgility() {

        if(weapon == null)
            return Agility;

        return Agility + weapon.getAgility();
    }
    
    public int getTotalHp() {

        if(weapon == null)
            return Hp;

        return Hp + weapon.getHp();
    }
    
    public int getTotalMaxHp() {

        if(weapon == null)
            return MaxHp;

        return MaxHp + weapon.getHp();
    }
    
    
    
    public int getMaxTotalMana() {

        if(weapon == null)
            return MaxMana;

        return MaxMana + weapon.getMana();
    }
    
    public int getTotalMana() {

        if(weapon == null)
            return Mana;

        return Mana + weapon.getMana();
    }

    public int getTotalCriticalChance() {

        if(weapon == null)
            return CriticalChance;

        return CriticalChance + weapon.getCriticalChance();
    }
    
    public int getTotalCriticalDamage() {

        if(weapon == null)
            return CriticalDamage;

        return CriticalDamage + weapon.getCriticalDamage();
    }
	
    abstract Weapon getStarterWeapon();

	public int getLimitExp() {
		return limitExp;
	}

	public void setLimitExp(int limitExp) {
		this.limitExp = limitExp;
	}
	
	public void takeDamage(int damage) {

	    Hp -= damage;

	    if(Hp < 0)
	        Hp = 0;
	}
	
	public void heal(int amount) {

	    Hp += amount;

	    if(Hp > getTotalHp())
	        Hp = getTotalHp();
	}
	
	public void addMana(int amount) {

	    Mana += amount;

	    if(Mana > getTotalMana())
	        Mana = getTotalMana();
	}
	
	public void levelUp() {

		while(Exp >= limitExp) {
			 Level++;

			    limitExp *= 2;
			    	

			    Attack += 3;
			    Defense += 2;
			    Hp += 20;
			    Mana += 10;
			    
			    System.out.println("Level Up!");
			    System.out.println("You reached Level " + Level);
		}
		
	}

	public int getMaxHp() {
		return MaxHp;
	}

	public void setMaxHp(int maxHp) {
		MaxHp = maxHp;
	}

	public int getMaxMana() {
		return MaxMana;
	}

	public void setMaxMana(int maxMana) {
		MaxMana = maxMana;
	}
	
	protected boolean manaCost(int manaCost) {
		if(getMana() < manaCost) {
    		System.out.println("Not enough Mana");
    		return false;
    	}
		
		return true;
	}

	public Armors getArmor() {
		return armor;
	}

	public void setArmor(Armors armor) {
		this.armor = armor;
	}
}
