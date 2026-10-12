package GAME;

public class SwordMan extends GameCharacter{

		public SwordMan(String Name){
			super(Name);
			setCharacterClass(CharacterClass.SWORDMAN);
			setMaxHp(120);
			setHp(120);
			setMana(40);
			setMaxMana(40);
			setAttack(30);
			setDefense(20);
			setCriticalChance(10);
			setCriticalDamage(150);
			setIntelligence(20);
			setAgility(15);
			setExp(0);
			
		}
		
		
		
		void attack(Enemy enemy) {
			System.out.println(getName() + "Swing sword! ");
			enemy.takeDamage(getTotalAttack());
		}
		
	    void skill1(Enemy enemy) {
	    	if(!manaCost(5))
	    		return;
	    	System.out.println(getName() + "uses Slash!");
	    	enemy.takeDamage(getTotalAttack() + 10);
	    	setMana(getMana() - 5);
	    }
	    void skill2(Enemy enemy) {
	    	if(!manaCost(10))
	    		return;
	    	System.out.println(getName() + "uses Double Slash!");
	    	enemy.takeDamage(getTotalAttack() + 15);
	    	enemy.takeDamage(getTotalAttack());
	    	setMana(getMana() - 10);
	    }
	    void skill3(Enemy enemy) {
	    	if(!manaCost(40))
	    		return;
	    	
	    	System.out.println(getName() + "uses Sword Storm!");
	    	enemy.takeDamage(getAttack() + 50);
	    	setMana(getMana() - 40);
	    	
	    	
	    }
	    
	    
		
		public Weapon getStarterWeapon() {
			System.out.println(Colors.CYAN +"⚔ Rusty Sword" + Colors.RESET);
			System.out.println("+15 attack! ");
			System.out.println("+2 Critical Chance! ");
			System.out.println("+10 Critical Damage! ");
			System.out.println();
			System.out.println(Colors.RED + "2 Heal Potion " + Colors.RESET);
			System.out.println(Colors.BLUE + "2 Mana Potion " + Colors.RESET);
			System.out.println(Colors.YELLOW + "🪙 100 Gold" + Colors.RESET);
			
		    return WeaponFactory.rustySword();
		    
		}
		
		
		
}
