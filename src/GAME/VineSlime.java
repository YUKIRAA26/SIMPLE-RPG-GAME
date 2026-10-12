package GAME;

public class VineSlime extends Enemy{

	public VineSlime() {
		super( "Forest Slime",
		        1,
		        EnemyRarity.COMMON,
		        120,    // HP
		        10,     // Attack
		        8,      // Defense
		        5,      // Agility
		        0,      // Intelligence
		        2,      // Critical Chance
		        125,    // Critical Damage
		        90,     // Accuracy
		        2,      // Dodge Chance
		        18,     // EXP Reward
		        12,     // Gold Reward
		        MapLocation.FOREST
		        );
	}
	
	@Override
	public void attack(GameCharacter player) {
	    System.out.println(getName() + " bounces into you!");
	    player.takeDamage(getAttack());
	    System.out.println(Colors.RED + "-" + getAttack() + "Hp" + Colors.RESET);
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
		    System.out.println(Colors.RED + "-" + damage + "Hp" + Colors.RESET);
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
	        return MaterialsFactory.healingHerb();
	    } else if (roll < 70) {
	        return ConsumablesFactory.smallPotion();
	    } else {
	        return null;
	    }
	}
}
