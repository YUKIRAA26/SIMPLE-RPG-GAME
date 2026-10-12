package GAME;

public class Tank extends GameCharacter {
	Tank(String Name){
		super(Name);
		setCharacterClass(CharacterClass.TANK);
		setMaxHp(180);
		setHp(120);
		setMana(30);
		setAttack(18);
		setDefense(35);
		setCriticalChance(5);
		setCriticalDamage(140);
		setIntelligence(10);
		setAgility(8);
		setExp(0);
		
		
	}
	
	void attack(Enemy enemy) {
		System.out.println(getName() + " uses Shield Strike! ");
		enemy.takeDamage(getAttack());
	}
	
    void skill1(Enemy enemy) {
    	if(!manaCost(2))
    		return;
    	System.out.println(getName() + " uses Shield Bash!");
    	enemy.takeDamage(getAttack() + 10);
    	setMana(getMana() - 2);
    }
    void skill2(Enemy enemy) {
    	if(!manaCost(10))
    		return;
    	System.out.println(getName() + " uses Iron Wall!");
    	enemy.takeDamage(getAttack() + 15);
    	setMana(getMana() - 10);
    }
    void skill3(Enemy enemy) {
    	if(!manaCost(40))
    		return;
    	System.out.println(getName() + " uses Earth Slam!");
    	enemy.takeDamage(getAttack() + 40);
    	setMana(getMana() - 35);
    }
	

	
	public Weapon getStarterWeapon() {
		System.out.println(Colors.CYAN +"🛡 Training Shield" + Colors.RESET);
		System.out.println("+25 Defense! ");
		System.out.println("+50 HP! ");
		System.out.println();
		System.out.println(Colors.RED + "2 Heal Potion " + Colors.RESET);
		System.out.println(Colors.BLUE + "2 Mana Potion " + Colors.RESET);
		System.out.println(Colors.YELLOW + "🪙 100 Gold" + Colors.RESET);
		
	    return new Weapon("Training Shield", WeaponTypes.SHIELD, 0,0,0,25,50,0,0,0);
	}
}
