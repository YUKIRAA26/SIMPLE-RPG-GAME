package GAME;

public class Weapon extends Items {
	private int Attack;
	private int Intelligence;
	private int Defense;
	private int Agility;
	private int Hp;
	private int Mana;
	private int CriticalChance;
	private int CriticalDamage;
	private WeaponTypes weaponType;

	
	
	public Weapon(String name, WeaponTypes weaponType, int Attack,int Intelligence,int Defense,int Agility
			,int Hp,int Mana,int CriticalChance,int CriticalDamage){
		
		super(name , ItemType.WEAPON);
		this.setWeaponType(weaponType);
		this.Attack = Attack;
		this.Intelligence = Intelligence;
		this.Defense = Defense;
		this.Agility = Agility;
		this.Hp = Hp;
		this.Mana = Mana;
		this.CriticalChance = CriticalChance;
		this.CriticalDamage = CriticalDamage;
	}


	public int getAttack() {
		return Attack;
	}

	public void setAttack(int attack) {
		Attack = attack;
	}

	public int getIntelligence() {
		return Intelligence;
	}

	public void setIntelligence(int intelligence) {
		Intelligence = intelligence;
	}

	public int getDefense() {
		return Defense;
	}

	public void setDefense(int defense) {
		Defense = defense;
	}

	public int getAgility() {
		return Agility;
	}

	public void setAgility(int agility) {
		Agility = agility;
	}

	public int getHp() {
		return Hp;
	}

	public void setHp(int hp) {
		Hp = hp;
	}

	public int getMana() {
		return Mana;
	}

	public void setMana(int mana) {
		Mana = mana;
	}

	public int getCriticalChance() {
		return CriticalChance;
	}

	public void setCriticalChance(int criticalChance) {
		CriticalChance = criticalChance;
	}

	public int getCriticalDamage() {
		return CriticalDamage;
	}

	public void setCriticalDamage(int criticalDamage) {
		CriticalDamage = criticalDamage;
	}


	public WeaponTypes getWeaponType() {
		return weaponType;
	}


	public void setWeaponType(WeaponTypes weaponType) {
		this.weaponType = weaponType;
	}
	
	
	
	
}
