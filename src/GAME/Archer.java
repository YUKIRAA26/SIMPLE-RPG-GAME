package GAME;

public class Archer extends GameCharacter {

	Archer(String Name){
		super(Name);
		setCharacterClass(CharacterClass.ARCHER);
		setMaxHp(90);
		setHp(90);
		setMana(60);
		setMaxMana(60);
		setAttack(28);
		setDefense(12);
		setCriticalChance(25);
		setCriticalDamage(180);
		setIntelligence(15);
		setAgility(35);
		setExp(0);
		
		
	}
	
	void attack(Enemy enemy) {
		System.out.println(getName() + " uses 🏹 Arrow Shot! ");
		enemy.takeDamage(getAttack() + getAgility());
	}
	
    void skill1(Enemy enemy) {
    	if(!manaCost(5))
    		return;
    	System.out.println(getName() + " uses 🎯 Piercing Arrow!");
    	enemy.takeDamage(getAttack() + getAgility() + 10);
    	setMana(getMana() - 5);
    }
    void skill2(Enemy enemy) {
    	if(!manaCost(20))
    		return;
    	System.out.println(getName() + " uses 🎯 Piercing Arrow!");
    	enemy.takeDamage(getAttack() + getAgility() * 2);
    	setMana(getMana() - 20);
    }
    void skill3(Enemy enemy) {
    	if(!manaCost(40))
    		return;
    	
    	
    	System.out.println(getName() + "uses 🏹🌧 Arrow Rain!");
    	enemy.takeDamage(getAttack() + getAgility() * 4);
    	setMana(getMana() - 40);
    }
	
	
	public Weapon getStarterWeapon() {
		System.out.println(Colors.CYAN +"🏹 Hunter Bow" + Colors.RESET);
		System.out.println("+12 Agility! ");
		System.out.println("+8 Critical Chance! ");
		System.out.println("+18 Critical Damage! ");
		System.out.println();
		System.out.println(Colors.RED + "2 Heal Potion " + Colors.RESET);
		System.out.println(Colors.BLUE + "2 Mana Potion " + Colors.RESET);
		System.out.println(Colors.YELLOW + "🪙 100 Gold" + Colors.RESET);
		
	    return WeaponFactory.hunterBow();
	}
}
