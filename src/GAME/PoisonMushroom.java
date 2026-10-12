package GAME;

public class PoisonMushroom extends Enemy {

	public PoisonMushroom() {
		super( "PoisonMushroom",
		        1,
		        EnemyRarity.UNCOMMON,
		        140,    // HP
		        14,     // Attack
		        12,      // Defense
		        2,      // Agility
		        15,      // Intelligence
		        3,      // Critical Chance
		        130,    // Critical Damage
		        90,     // Accuracy
		        0,      // Dodge Chance
		        32,     // EXP Reward
		        25,     // Gold Reward
		        MapLocation.FOREST
		        );
	}
	
	@Override
	public void attack(GameCharacter player) {
	    System.out.println(getName() + " Poison Spores!");
	    player.takeDamage(getAttack());
	}

	@Override
	public void skill(GameCharacter player) {
	    System.out.println(getName() + " uses Toxic Cloud!");
	    
	    int damage = getAttack() + 10;
	    
	    if(random.nextInt(100) < getCriticalChance() ) {
	    	System.out.println("Critical hit! ");
	    	
	    	damage = damage * getCriticalDamage() / 100;
	    }
	    
	    player.takeDamage(damage);
	    
	    
	}
	
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
	        return MaterialsFactory.poisonMushroom();
	    } else if (roll < 70) {
	        return ConsumablesFactory.smallPotion();
	    } else {
	        return null;
	    }
	}
}
