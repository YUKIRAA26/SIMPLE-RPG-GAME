package GAME;

import java.util.Scanner;

public class Game {
	
			private final Scanner scanner = new Scanner(System.in);
			private GameCharacter player;
			
			Adventure adventure = new Adventure(player,scanner);
	
			public void start() {
				
			if(titleMenu()) {
					displayStory();
					startGame();
					starterWeapon();
					player.displayStats();
					System.out.println("Enter to Start" + Colors.RED + " ADVENTURE! " + Colors.RESET);
					scanner.nextLine();
					gameLoop();
					
				}
			}
				
			
			private void gameLoop() {
				Adventure adventure = new Adventure(player,scanner);
				
				while(true) {
					int choice = MainMenu.displayMainMenu(player, scanner);
					
					
					 if(choice <= 0 || choice > 7) {
				        	System.out.println();
				        	System.out.println("Invalid Input! ");
				        	System.out.println();
				        	continue;
				        }
				        
				        if(choice == 7) {
				        	break;
				        }
					
					switch(choice) {
					    case 1 -> adventure.startAdventure();
					    case 2 -> {
					    	player.getInventory().displayInventory(player);
					    	
					    	int invChoice = scanner.nextInt();
					    	scanner.nextLine();
					    	
					    	switch(invChoice){
					    	case 1 -> player.getInventory().useItem(player);
					    	case 2 -> player.getInventory().equipWeapon(player);
					    	case 3 -> player.getInventory().equipArmor(player);
					        case 4 -> player.getInventory().dropItem(player);
					    }
					    }
						case 3 -> {
							player.displayStats();
							System.out.println("Press Enter to go back! ");
							scanner.nextLine();
						}
						case 4 -> Shop.open(player);
					}
				}
			}
				
		//prologue
		
		private void displayStory() {
			System.out.println("Press Enter to next! ");
			scanner.nextLine();
			
			System.out.println("...");
			scanner.nextLine();
			System.out.println("For over one thousand years, the Kingdom of Eldoria lived in peace.");
			scanner.nextLine();
			System.out.println("Humans, elves, dwarves, and magical creatures coexisted under the protection of the World Tree, an ancient tree said to be the source of all life and mana.");
			scanner.nextLine();
			System.out.println("But one night...");
			scanner.nextLine();
			System.out.println("The World Tree began to wither.");
			scanner.nextLine();
			System.out.println("Its light disappeared.");
			scanner.nextLine();
			System.out.println("The monsters of the world became corrupted.");
			scanner.nextLine();
			System.out.println("Peace quickly turned into chaos.");
			scanner.nextLine();
			System.out.println("Entire villages vanished.");
			scanner.nextLine();
			System.out.println("Ancient dungeons reopened.");
			scanner.nextLine();
			System.out.println("Powerful Demon Lords awakened from their eternal slumber.");
			scanner.nextLine();
			System.out.println("As hope faded, the kingdom searched for a hero...");
			scanner.nextLine();
			System.out.println("Not a legendary knight.");
			scanner.nextLine();
			System.out.println("Not a chosen king.");
			scanner.nextLine();
			System.out.println("Just an ordinary adventurer willing to risk everything.");
			scanner.nextLine();
			System.out.println("That adventurer...");
			scanner.nextLine();
			System.out.println("is you.");
			scanner.nextLine();
		}
		
		//loadMenu
		
		private boolean titleMenu() {
			System.out.println("=====================================");
			System.out.println("||        Legends of Eldoria       ||");
			System.out.println("=====================================");
			System.out.println();
			
			while (true) {
				System.out.println("1. New Game");
				System.out.println("2. Load Game(coming soon)");
				System.out.print("Choice: ");
				int loadChoice = scanner.nextInt();
				scanner.nextLine();
				
				if(loadChoice == 2) {
					System.out.println();
					System.out.println("Coming soon! ");
					System.out.println();
					continue;
				}
				
				if(loadChoice > 2 || loadChoice < 1) {
					System.out.println();
					System.out.println("Invalid choice! ");
					System.out.println();
					continue;
				}
				
				return true;
			}
			
		}
		
		//Class Selection
		
		private void classSelection() {
			System.out.println("||== Choose Your Class ==||");
			System.out.println("1. Swordman");
			System.out.println("A fearless warrior who excels in close combat.");
			System.out.println();
			
			System.out.println("2. Mage");
			System.out.println("A master of destructive elemental magic.");
			System.out.println();
			
			System.out.println("3. Archer");
			System.out.println("A swift hunter with deadly accuracy.");
			System.out.println();
			
			System.out.println("4. Tank");
			System.out.println("A guardian with unmatched defense.");
			System.out.println();
			
			System.out.println("5. Saint");
			System.out.println("A holy healer who protects allies and defeats evil.");
			System.out.println();
			
			System.out.print("Choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 1 -> createCharacter(CharacterClass.SWORDMAN);
			case 2 -> createCharacter(CharacterClass.MAGE); 
			case 3 -> createCharacter(CharacterClass.ARCHER);
			case 4 -> createCharacter(CharacterClass.TANK);
			case 5 -> createCharacter(CharacterClass.SAINT);
			case 6 ->{
				return;
			}
			default -> System.out.println("Invalid input! ");
			}
			
			
		}
		
		private void starterWeapon() {
			System.out.println();
			System.out.println("Old Knight:");
			System.out.println("Every hero needs a weapon.");
			
			System.out.println();
			System.out.println("The kingdom doesn't have much left...");
			System.out.println("but take this. ");
			
			System.out.println();
			System.out.println("You received:");
			player.addGold(100);
			
			Weapon starter = player.getStarterWeapon();
			player.setWeapon(starter);
			player.getInventory().addItem(starter);
			
			 player.getInventory().addItem(ConsumablesFactory.smallPotion());
			 player.getInventory().addItem(ConsumablesFactory.smallPotion());

			 player.getInventory().addItem(ConsumablesFactory.smallManaPotion());
			 player.getInventory().addItem(ConsumablesFactory.smallManaPotion());
			 
			
			}
		
		private void startGame() {
			System.out.println("=====================================");
			System.out.println("|| Welcome to the world of Eldoria ||");
			System.out.println("=====================================");
			System.out.println();
			
			System.out.println("The world has changed...");
			scanner.nextLine();
			System.out.println("Monsters grow stronger every day");
			scanner.nextLine();
			System.out.println("If nobody stands against the darkness...");
			scanner.nextLine();
			System.out.println("...Eldoria will fall.");
			scanner.nextLine();
			
			classSelection();
			System.out.println("Press enter to Start! ");
			scanner.nextLine();
		}
			
				
		//character creation
		
		private void createCharacter(CharacterClass characterClass) {
			while(true) {
				System.out.print("Enter name: ");
				String name = scanner.nextLine();
				
				if(nameChecker(name)) {
					continue;
				}
				
				switch(characterClass) {
					case SWORDMAN -> player = new SwordMan(name);
					case ARCHER -> player = new Archer(name);
					case MAGE -> player = new Mage(name);
					case SAINT -> player = new Saint(name);
					case TANK -> player = new Tank(name);
				}
				
				System.out.println();
		        System.out.println("Character Created!");
		        System.out.println();
				
				break;
			}
				
		}
		
		private boolean nameChecker(String name) {
			if(name.trim().isEmpty()) {
				System.out.println("Name must not be empty! ");
				return true;
			}
			
			return false;
		}
}
			
		
