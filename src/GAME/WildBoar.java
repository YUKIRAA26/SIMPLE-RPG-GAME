package GAME;


public class WildBoar extends Enemy {
	
	public WildBoar() {
		super( "Wild Boar",
		        1,
		        EnemyRarity.COMMON,
		        150,    // HP
		        18,     // Attack
		        10,      // Defense
		        8,      // Agility
		        0,      // Intelligence
		        5,      // Critical Chance
		        150,    // Critical Damage
		        92,     // Accuracy
		        3,      // Dodge Chance
		        25,     // EXP Reward
		        19,     // Gold Reward
		        MapLocation.FOREST
		        );
	}
	
	@Override
	public void attack(GameCharacter player) {
	    System.out.println(getName() + " Charge into you!");
	    player.takeDamage(getAttack());
	}

	@Override
	public void skill(GameCharacter player) {
	    System.out.println(getName() + " uses Tusk Rush!");
	    
	    int damage = getAttack() + 10;
	    
	    if(random.nextInt(100) < getCriticalChance() ) {
	    	System.out.println("Critical hit! ");
	    	
	    	damage = damage * getCriticalDamage() / 100;
	    }
	    
	    player.takeDamage(damage);
	    
	}
	
	@Override
	public void takeTurn(GameCharacter player) {

	    if(random.nextInt(100) < 20) {
	        skill(player);
	    } else {
	        attack(player);
	    }
	}
	
	public Items getDrop() {

	    int roll = random.nextInt(100);

	    if (roll < 60) {
	        return MaterialsFactory.boarTusk();
	    } else if (roll < 70) {
	        return ConsumablesFactory.smallPotion();
	    } else {
	        return null;
	    }
	}
}
