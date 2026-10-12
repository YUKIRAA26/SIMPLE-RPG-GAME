package GAME;

public class GoblinScout extends Enemy {
	public GoblinScout() {
		super( "GoblinScout",
		        1,
		        EnemyRarity.RARE,
		        170,    // HP
		        24,     // Attack
		        14,      // Defense
		        20,      // Agility
		        10,      // Intelligence
		        12,      // Critical Chance
		        180,    // Critical Damage
		        95,     // Accuracy
		        10,      // Dodge Chance
		        45,     // EXP Reward
		        35,     // Gold Reward
		        MapLocation.FOREST
		        );
	}
	
	@Override
	public void attack(GameCharacter player) {
	    System.out.println(getName() + " Dagger Throw!");
	    player.takeDamage(getAttack());
	}

	@Override
	public void skill(GameCharacter player) {
	    System.out.println(getName() + " uses Ambush!");
	    
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
	
	@Override
	public Items getDrop() {

	    int roll = random.nextInt(100);

	    if (roll < 60) {
	        return MaterialsFactory.goblinEar();
	    } else if (roll < 70) {
	        return ConsumablesFactory.smallPotion();
	    } else {
	        return null;
	    }
	}
}
