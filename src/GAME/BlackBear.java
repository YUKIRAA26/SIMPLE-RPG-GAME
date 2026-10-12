package GAME;

public class BlackBear extends Enemy {
	public BlackBear(){
		super(
	
            "Black Bear",
            1,
            EnemyRarity.RARE,
            250,                    // HP
            30,                     // Attack
            18,                      // Defense
            10,                     // Agility
            0,                      // Intelligence
            8,                      // Critical Chance
            170,                    // Critical Damage
            90,                     // Accuracy
            5,                      // Dodge Chance
            55,                     // EXP Reward
            45,                     // Gold Reward
            MapLocation.FOREST
        );
	}
	
	public void attack(GameCharacter player) {
		 System.out.println(getName() + " Maul!");
		 player.takeDamage(getAttack());
	}
	
	
	    public void skill(GameCharacter player) {
	    	 System.out.println(getName() + " uses Roar!");
	 	    
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
		        return MaterialsFactory.boarTusk();
		    } else if (roll < 70) {
		        return ConsumablesFactory.smallPotion();
		    } else {
		        return null;
		    }
		}
}
