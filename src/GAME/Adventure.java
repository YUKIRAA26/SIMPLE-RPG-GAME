package GAME;
import java.util.*;


public class Adventure{
	private final Scanner scanner;
	private final GameCharacter player;
	
	public Adventure(GameCharacter player, Scanner scanner) {
		this.scanner = scanner;
		this.player = player;
	}
	
	public void startAdventure() {
		
		while(true) {
			int choice = AdventureMenu.displayAdventureMenu(scanner);
			
			switch(choice) {
				case 1 -> {
					MapLocation location = ExploreMenu.displayExplore(scanner);
					
					if(location == MapLocation.RETURN) {
						continue;
					}
					
					switch(location) {
	                 case FOREST -> {
	                     System.out.println("Exploring Forest...");
	                     exploreForest();
	                 }

	                 case CAVE -> {
	                     System.out.println("Exploring Cave...");
	                     exploreCave();
	                 }

	                 case DUNGEON -> {
	                     System.out.println("Exploring Dungeon...");
	                     exploreDungeon();
	                 }

	                 case CASTLE -> {
	                     System.out.println("Exploring Castle...");
	                     exploreCastle();
	                 }

	                 case DEMON_KING_CASTLE -> {
	                	 System.out.println("Exploring Demon King's Castle...");
	                	 exploreDemonKingCastle();
	                 }
					default -> System.out.println("Invalid input! ");
	             }
					
					
					
			   }
				 case 2 -> {
		                System.out.println("Travel");
		            }

		            case 3 -> {
		                System.out.println("Quest Board");
		            }

		            case 4 -> {
		                System.out.println("Camp");
		            }

		            case 5 -> {
		                System.out.println("Area Information");
		            }

		            case 6 -> {
		                return;
		            }
		        }
		}
			
		
		}
	
		// exploreLocations
	
	private void exploreForest() {
		Enemy enemy = EnemyFactory.getRandomEnemy(MapLocation.FOREST);
		
		System.out.println("A wild " + enemy.getName() + " appeared! " );
		Battle battle = new Battle(player,enemy);
		
		battle.StartBattle(scanner);
		
	}

	private void exploreCave() {

	}

	private void exploreDungeon() {

	}

	private void exploreCastle() {

	}

	private void exploreDemonKingCastle() {

	}
	
	}
	
	
	

