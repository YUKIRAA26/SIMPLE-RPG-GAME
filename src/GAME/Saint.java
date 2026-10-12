package GAME;

public class Saint extends GameCharacter {
	Saint(String Name){
		super(Name);
		setCharacterClass(CharacterClass.SAINT);
		setMaxHp(100);
		setHp(100);
		setMana(140);
		setAttack(15);
		setDefense(15);
		setCriticalChance(8);
		setCriticalDamage(150);
		setIntelligence(35);
		setAgility(18);
		setExp(0);
		
		
	}
	
	void attack(Enemy enemy) {
		System.out.println(getName() + " uses Holy Light! ");
		enemy.takeDamage(getAttack() + getIntelligence());
	}
	
    void skill1(Enemy enemy) {
    	if(!manaCost(5))
    		return;
    	System.out.println(getName() + " uses Heal!");
    	heal(getIntelligence() * 2 );
    	setMana(getMana() - 5);
    }
    void skill2(Enemy enemy) {
    	if(!manaCost(5))
    		return;
    	System.out.println(getName() + " uses Blessingl!");
    	heal(20);
    	setMana(getMana() + 20);
    }
    void skill3(Enemy enemy) {
    	if(!manaCost(40))
    		return;
    	System.out.println(getName() + " uses Judgment!");
    	enemy.takeDamage(getAttack() + getIntelligence() * 4);
    	setMana(getMana() - 40);
    }
	

	
	public Weapon getStarterWeapon() {
		System.out.println(Colors.CYAN +"✨ Blessed Staff" + Colors.RESET);
		System.out.println("+12 Intelligence! ");
		System.out.println("+40 Mana! ");
		System.out.println("+5 Defense! ");
		System.out.println();
		System.out.println(Colors.RED + "2 Heal Potion " + Colors.RESET);
		System.out.println(Colors.BLUE + "2 Mana Potion " + Colors.RESET);
		System.out.println(Colors.YELLOW + "🪙 100 Gold" + Colors.RESET);
		
	    return new Weapon("Blessed Staff", WeaponTypes.STAFF, 0,12,0,5,0,40,0,0);
	}
}
