package GAME;

public class ForestGuardianStag extends Enemy{
	//boss
	
	public ForestGuardianStag(){
		super(
	
            "Forest Guardian Stag",
            1,
            EnemyRarity.MINI_BOSS,
            500,                    // HP
            50,                     // Attack
            35,                      // Defense
            25,                     // Agility
            35,                      // Intelligence
            20,                      // Critical Chance
            200,                    // Critical Damage
            98,                     // Accuracy
            20,                      // Dodge Chance
            150,                     // EXP Reward
            120,                     // Gold Reward
            MapLocation.FOREST
        );
	}
	
	public void attack(GameCharacter player) {
		 System.out.println(getName() + " Horn Charge!");
		 player.takeDamage(getAttack());
	}
	
	
	    public void skill1(GameCharacter player) {
	    	 System.out.println(getName() + " uses Forest Judgment !");
	 	    
	 	    int damage = getAttack() + 10;
	 	    
	 	    if(random.nextInt(100) < getCriticalChance() ) {
	 	    	System.out.println("Critical hit! ");
	 	    	
	 	    	damage = damage * getCriticalDamage() / 100;
	 	    }
	 	    
	 	    player.takeDamage(damage);
	    }
	    
	    public void skill(GameCharacter player) {
	    	 System.out.println(getName() + " uses Nature's Blessing !");
	    	 
	    	 setHp(Math.min(getHp() + 50 , getMaxHp()) );
	    	 System.out.println("+ 50 Hp");
	    }
	    
	    @Override
	    public void takeTurn(GameCharacter player) {
	    	
	    	 if(getHp() <= getMaxHp() / 3) {
	    	        skill(player); // Heal
	    	        return;
	    	    }

	        int chance = random.nextInt(100);

	        if(chance < 10) {
	            skill1(player);      // Ultimate
	        }
	        else if(chance < 60) {
	            skill(player);
	        }
	        else {
	            attack(player);
	        }
	    }
	    
	    public Items getDrop() {

		    int roll = random.nextInt(100);

		    if (roll < 60) {
		        return MaterialsFactory.stagHorn();
		    } else if (roll < 70) {
		        return ConsumablesFactory.largePotion();
		    }else if (roll < 65) {
			        return ConsumablesFactory.largeManaPotion();
		    } else if(roll < 5){
		    	return WeaponFactory.steelClaymore();
		    }else{
		        return null;
		    }
		}

}
