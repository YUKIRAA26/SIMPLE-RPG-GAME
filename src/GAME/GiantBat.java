package GAME;

public class GiantBat extends Enemy{
	public GiantBat() {
		super( "GiantBat",
		        1,
		        EnemyRarity.UNCOMMON,
		        80,    // HP
		        17,     // Attack
		        5,      // Defense
		        22,      // Agility
		        5,      // Intelligence
		        8,      // Critical Chance
		        160,    // Critical Damage
		        98,     // Accuracy
		        18,      // Dodge Chance
		        28,     // EXP Reward
		        20,     // Gold Reward
		        MapLocation.FOREST
		        );
	}
	
	@Override
	public void attack(GameCharacter player) {
	    System.out.println(getName() + " Sonic Screech!");
	    player.takeDamage(getAttack());
	}

	@Override
	public void skill(GameCharacter player) {
	    System.out.println(getName() + " uses Blood Bite!");
	    
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
	        return MaterialsFactory.batWing();
	    } else if (roll < 70) {
	        return ConsumablesFactory.smallPotion();
	    } else {
	        return null;
	    }
	}
}
