package GAME;
import java.util.Scanner;

public class Shop {
	static Scanner scanner = new Scanner(System.in);
	//weapon
	static Weapon[] weapon = {
			WeaponFactory.AegisOfEldoria(),
			WeaponFactory.hunterBow(),
			WeaponFactory.ironSword()
	};
	
	static int[] prices = {
			100,200,300
	};
	
 //armor
	
	static Armors[] armor = {
			ArmorFactory.angelicVestment(),
			ArmorFactory.apprenticeRobe(),
			ArmorFactory.knightArmor()
	};
	
	static int[] price = {
			100,200,300
	};
	
	//consumables
	
	static Consumables[] consumable = {
			ConsumablesFactory.smallPotion(),
			ConsumablesFactory.smallManaPotion(),
			ConsumablesFactory.elixir()
	};
	
	static int[] consumablePrice = {
			30,30,150
	};
	
	//invetory
	

	
	public static void open(GameCharacter player) {
		while(true) {
			displayShop.displayShops();
			
			int choice = scanner.nextInt();
			
			if(choice == 5) {
				return;
			}
			
			switch(choice) {
			 case 1 -> buyWeapon(player);
			 case 2 -> buyArmor(player);
			 case 3 -> buyConsumables(player);
			 case 4 -> sellItem(player);
			}
		}
	}
	
	
	private static void buyWeapon(GameCharacter player) {
		while(true) {
			displayShop.displayWeapon(weapon,prices);
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			if(choice == 4) {
				break;
			}
			
			System.out.println("buy " + weapon[choice - 1].getItemName() + "?");
			System.out.println("price: " + prices[choice - 1] + " gold");
			System.out.println("1. Confirm ");
			System.out.println("2. Cancel ");
			int choice1 = scanner.nextInt();
			scanner.nextLine();
			
			if(choice1 == 1) {
				if(player.getGold() < prices[choice - 1]) {
					System.out.println("Not enough Gold!");
					continue;
				}
				
				player.setGold(player.getGold() - prices[choice - 1]);
				player.getInventory().addItem(weapon[choice - 1]);
				System.out.println("-" + prices[choice - 1] + "Gold");
				System.out.println("Succesfully bought " + weapon[choice - 1].getItemName() + "!");
				break;
			}
			
		}
	
	}
	
	private static void buyArmor(GameCharacter player) {
		while(true) {
			displayShop.displayArmor(armor , price);
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			if(choice == 4) {
				break;
			}
			
			System.out.println("buy " + armor[choice - 1].getItemName() + "?");
			System.out.println("price: " + prices[choice - 1] + " gold");
			System.out.println("1. Confirm ");
			System.out.println("2. Cancel ");
			int choice1 = scanner.nextInt();
			scanner.nextLine();
			
			if(choice1 == 1) {
				if(player.getGold() < price[choice - 1]) {
					System.out.println("Not enough Gold!");
					continue;
				}
				
				player.setGold(player.getGold() - price[choice - 1]);
				player.getInventory().addItem(armor[choice - 1]);
				System.out.println("-" + prices[choice - 1] + "Gold");
				System.out.println("Succesfully bought " + armor[choice - 1].getItemName() + "!");
				break;
			}
			
		}
	
	}
	
	private static void buyConsumables(GameCharacter player) {
		while(true) {
			displayShop.displayConsumables(consumable, consumablePrice);
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			if(choice == 4) {
				break;
			}
			
			System.out.println("buy " + consumable[choice - 1].getItemName() + "?");
			System.out.println("price: " + prices[choice - 1] + " gold");
			System.out.println("1. Confirm ");
			System.out.println("2. Cancel ");
			int choice1 = scanner.nextInt();
			scanner.nextLine();
			
			if(choice1 == 1) {
				if(player.getGold() < prices[choice - 1]) {
					System.out.println("Not enough Gold!");
					continue;
				}
				
				player.setGold(player.getGold() - prices[choice - 1]);
				player.getInventory().addItem(consumable[choice - 1]);
				System.out.println("-" + prices[choice - 1] + "Gold");
				System.out.println("Succesfully bought " + consumable[choice - 1].getItemName() + "!");
				break;
			}
			
		}
	
	}
	
	private static void sellItem(GameCharacter player) {
		while(true) {
			Inventory inventory = player.getInventory();
			displayShop.sellItems(inventory);
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			if(choice == 4) {
				break;
			}
			Items item = inventory.getItem(choice - 1);
			System.out.println("sell " + inventory.getItem(choice - 1).getItemName() + "?");
			System.out.println("price: " + prices[choice - 1] + " gold");
			System.out.println("1. Confirm ");
			System.out.println("2. Cancel ");
			int choice1 = scanner.nextInt();
			scanner.nextLine();
			
			if(choice1 == 1) {
				if(player.getWeapon() == inventory.getItem(choice - 1)) {
					System.out.println("unequip Weapon first ");
					continue;
				}else if(player.getArmor() == inventory.getItem(choice - 1)) {
					System.out.println("unequip Armor first ");
					continue;
				}
				
				player.setGold(player.getGold() + prices[choice - 1]);
				player.getInventory().removeItem(choice - 1);
				System.out.println("+" + prices[choice - 1] + "Gold");
				System.out.println("Succesfully sold " + item.getItemName() + "!");
				break;
			}
			
		}
	
	}
	
	
	
}
