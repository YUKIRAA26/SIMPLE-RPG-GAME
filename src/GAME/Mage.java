package GAME;

public class Mage extends GameCharacter {
	
	Mage(String Name){
		super(Name);
		setCharacterClass(CharacterClass.MAGE);
		setMaxHp(80);
		setHp(80);
		setMana(150);
		setAttack(20);
		setDefense(8);
		setCriticalChance(12);
		setCriticalDamage(170);
		setIntelligence(40);
		setAgility(12);
		setExp(0);
		
		
	}
	
	void attack(Enemy enemy) {
		System.out.println(getName() + " uses Magic Bolt! ");
		enemy.takeDamage(getAttack() + getIntelligence());
	}
	
	
    void skill1(Enemy enemy) {
    	if(!manaCost(10))
    		return;
    	System.out.println(getName() + " uses Fireball!");
    	enemy.takeDamage(getAttack() + getIntelligence() + 10);
    	setMana(getMana() - 10);
    }
    void skill2(Enemy enemy) {
    	if(!manaCost(15))
    		return;
    	System.out.println(getName() + " uses Lightning Strike!");
    	enemy.takeDamage(getAttack() + getIntelligence() * 2);
    	setMana(getMana() - 15);
    }
    void skill3(Enemy enemy) {
    	if(!manaCost(40))
    		return;
    	System.out.println(getName() + " uses Raining Meteor!");
    	enemy.takeDamage(getAttack() + getIntelligence() * 4);
    	setMana(getMana() - 40);
    }
	
	
	public Weapon getStarterWeapon() {
		System.out.println(Colors.CYAN +"🪄 Wooden Staff" + Colors.RESET);
		System.out.println("+15 Intelligence! ");
		System.out.println("+50 Mana! ");
		System.out.println();
		System.out.println(Colors.RED + "2 Heal Potion " + Colors.RESET);
		System.out.println(Colors.BLUE + "2 Mana Potion " + Colors.RESET);
		System.out.println(Colors.YELLOW + "🪙 100 Gold" + Colors.RESET);
		
		
	    return new Weapon("Wooden Staff",  WeaponTypes.STAFF, 0,15,0,0,0,50,0,0);
	}
}
