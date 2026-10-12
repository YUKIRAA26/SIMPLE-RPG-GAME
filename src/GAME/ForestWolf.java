package GAME;

public class ForestWolf extends Enemy{

	public ForestWolf(){
		super(
	
            "Forest Wolf",
            1,
            EnemyRarity.COMMON,
            100,                    // HP
            15,                     // Attack
            5,                      // Defense
            12,                     // Agility
            0,                      // Intelligence
            5,                      // Critical Chance
            150,                    // Critical Damage
            95,                     // Accuracy
            5,                      // Dodge Chance
            20,                     // EXP Reward
            15,                     // Gold Reward
            MapLocation.FOREST
        );
	}
	
	public void attack(GameCharacter player) {
		 System.out.println(getName() + " bites!");
		 player.takeDamage(getAttack());
	}
	
	
	    public void skill(GameCharacter player) {
	    	 System.out.println(getName() + " uses Tusk Rush!");
	 	    
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
		        return MaterialsFactory.wolfFang();
		    } else if (roll < 70) {
		        return ConsumablesFactory.smallPotion();
		    } else {
		        return null;
		    }
		}

}
