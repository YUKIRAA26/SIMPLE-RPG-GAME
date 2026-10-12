package GAME;

public class TreantSapling extends Enemy {

	public TreantSapling() {
		super( "TreantSapling",
		        1,
		        EnemyRarity.ELITE,
		        320,    // HP
		        35,     // Attack
		        25,      // Defense
		        30,      // Agility
		        20,      // Intelligence
		        10,      // Critical Chance
		        180,    // Critical Damage
		        88,     // Accuracy
		        2,      // Dodge Chance
		        80,     // EXP Reward
		        70,     // Gold Reward
		        MapLocation.FOREST
		        );
	}
	
	@Override
	public void attack(GameCharacter player) {
	    System.out.println(getName() + " Root Bind!");
	    player.takeDamage(getAttack());
	}

	@Override
	public void skill(GameCharacter player) {
	    System.out.println(getName() + " uses Branch Smash!");
	    
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
	        return MaterialsFactory.treantBark();
	    } else if (roll < 70) {
	        return ConsumablesFactory.mediumPotion();
	    } else {
	        return null;
	    }
	}
}
