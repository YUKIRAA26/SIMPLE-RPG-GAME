package GAME;
import java.util.Scanner;
import java.util.Random;

public class Battle {
	private GameCharacter player;
	private Enemy enemy;
	
	public Battle(GameCharacter player, Enemy enemy){
		this.player = player;
		this.enemy = enemy;
	}
	
	public void StartBattle(Scanner scanner) {
		while (player.getHp() > 0 && enemy.getHp() > 0) {

		    BattleMenu.displayBattleMenu(player, enemy);
		  
		    

		    int choice = scanner.nextInt();
		    scanner.nextLine();

		    switch(choice) {

		        case 1 -> player.attack(enemy);
		        

		        case 2 -> {
		        	SkillMenu.displaySkillMenu(player, enemy, scanner);
		        }

		        case 3 -> {
		        	player.getInventory().displayInventory(player);
			    	
			    	int invChoice = scanner.nextInt();
			    	scanner.nextLine();
			    	
			    	switch(invChoice){
			    	case 1 -> player.getInventory().useItem(player);
			    	case 2 -> player.getInventory().equipWeapon(player);
			    	case 3 -> player.getInventory().equipArmor(player);
			        case 4 -> player.getInventory().dropItem(player);
			        case 5 -> {
			        	return;
			        }
			        default -> System.out.println("Invalid input");
			    	}
		        }

		        case 4 -> {
		            // Defend
		        }

		        case 5 -> {
		            System.out.println("You fled!");
		            return;
		        }

		        default -> {
		            System.out.println("Invalid choice!");
		            continue;
		        }
		    }
		    

		    if(enemy.getHp() <= 0) {

		        System.out.println("You defeated " + enemy.getName());

		        player.addExp(enemy.getExpReward());
		        player.levelUp();
		        player.addGold(enemy.getGoldReward());
		        
		        Items drop = enemy.getDrop();
		        
		        if(drop != null) {
		        	player.getInventory().addItem(drop);
		            System.out.println("Obtained " + drop.getItemName() + "!");
		        }

		        System.out.println(Colors.CYAN + "+" + enemy.getExpReward() + " EXP" + Colors.RESET);
		        System.out.println(Colors.YELLOW + "+" + enemy.getGoldReward() + " Gold" + Colors.RESET);

		        break;
		    }
		    
		    enemy.takeTurn(player);
		    
		    if(player.getHp() <= 0) {
		        System.out.println();
		        System.out.println("You were defeated...");
		        
		        player.setHp(player.getTotalMaxHp());
		        player.setMana(player.getMaxMana());
		        player.setGold(player.getGold() - 50);
		        System.out.println("You've lost " + Colors.YELLOW + "-50" + " Gold" + Colors.RESET);
		        break;
		    }
		    
		    
		}
		
		
	}
}
