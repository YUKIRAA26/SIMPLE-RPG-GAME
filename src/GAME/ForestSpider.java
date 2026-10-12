package GAME;

public class ForestSpider extends Enemy {
	public ForestSpider(){
		super(
	
            "Forest Spider",
            1,
            EnemyRarity.UNCOMMON,
            90,                    // HP
            20,                     // Attack
            4,                      // Defense
            18,                     // Agility
            5,                      // Intelligence
            10,                      // Critical Chance
            175,                    // Critical Damage
            96,                     // Accuracy
            15,                      // Dodge Chance
            30,                     // EXP Reward
            22,                     // Gold Reward
            MapLocation.FOREST
        );
	}
	
	public void attack(GameCharacter player) {
		 System.out.println(getName() + " Poison Bite!");
		 player.takeDamage(getAttack());
	}
	
	
	    public void skill(GameCharacter player) {
	    	 System.out.println(getName() + " Web Trap!");
	 	    
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
		        return MaterialsFactory.spiderSilk();
		    } else if (roll < 70) {
		        return ConsumablesFactory.smallPotion();
		    } else {
		        return null;
		    }
		}

}
