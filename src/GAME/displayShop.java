package GAME;


public class displayShop {
	
	public static void displayShops() {
		System.out.println("====================");
		System.out.println("    Village Shop  ");
		System.out.println("====================");

		System.out.println("1. Buy Weapons");
		System.out.println("2. Buy Armor");
		System.out.println("3. Buy Consumables");
		System.out.println("4. Sell Items");
		System.out.println("5. Back");
		System.out.print("Choice: ");
		
	}
	
	public static void displayWeapon(Weapon[] weapon, int[] prices) {
		
	    System.out.println("====================");
	    System.out.println("      WEAPONS");
	    System.out.println("====================");
	    
	    for(int i = 0 ; i < weapon.length;i++) {
	    	System.out.println((i+1) + ". " + weapon[i].getItemName() + " - " + prices[i] + " Gold");
	    }
	    
	    System.out.println((weapon.length + 1) + ". Back");
	    System.out.print("Choice: ");
	}
	
	public static void displayArmor(Armors[] armor, int[] prices) {
		
		
	    System.out.println("====================");
	    System.out.println("      ARMORS");
	    System.out.println("====================");
	    
	    for(int i = 0 ; i < armor.length;i++) {
	    	System.out.println((i+1) + ". " + armor[i].getItemName() + " - " + prices[i] + " Gold");
	    }
	    
	    System.out.println((armor.length + 1) + ". Back");
	    System.out.print("Choice: ");
	}
	
	public static void displayConsumables(Consumables[] consumable, int[] prices) {
		
		
	    System.out.println("====================");
	    System.out.println("      ARMORS");
	    System.out.println("====================");
	    
	    for(int i = 0 ; i < consumable.length;i++) {
	    	System.out.println((i+1) + ". " + consumable[i].getItemName() + " - " + prices[i] + " Gold");
	    }
	    
	    System.out.println((consumable.length + 1) + ". Back");
	    System.out.print("Choice: ");
	}
	
	public static void sellItems(Inventory inventory) {
		
		
	    System.out.println("====================");
	    System.out.println("      Consumables");
	    System.out.println("====================");
	    
	    for (int i = 0; i < inventory.getItemCount(); i++) {
	        Items item = inventory.getItem(i);

	        System.out.println((i + 1) + ". " + item.getItemName());
	    }
	    
	    System.out.println((inventory.getItemCount() + 1) + ". Back");
	    System.out.print("Choice: ");	
	}

}


