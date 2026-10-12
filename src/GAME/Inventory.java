package GAME;
import java.util.Scanner;

public class Inventory {
	 static Scanner scanner = new Scanner(System.in);
	 private Items[] items = new Items[20];
	 private int itemCount = 0;
	 
	 
	 public void addItem(Items item) {
		 if(itemCount >= items.length) {
			 System.out.println();
			 System.out.println("Full Capacity! ");
			 System.out.println();
			 return;
		 }
		 
		  for(int i = 0; i < itemCount; i++) {

		        if(items[i].getItemName().equals(item.getItemName())
		                && items[i].getItemType() == item.getItemType()) {

		            items[i].setQuantity(items[i].getQuantity() + 1);
		            return; 
		        }
		    }
		 
		 items[itemCount] = item;
		 itemCount++;
	 }
	 
	 public void equipWeapon(GameCharacter player) {
		 System.out.print("Enter item number to use: ");
		    int choice = scanner.nextInt();
		    scanner.nextLine();

		    choice--; // because inventory displays starting at 1

		    if(choice < 0 || choice >= itemCount) {
		        System.out.println("Invalid item!");
		        return;
		    }
		    
		    if(!(items[choice] instanceof Weapon)) {
	    		System.out.println("That item cannot be equip!");
	            return;
	    	}
		    
		    Weapon weapon = (Weapon) items[choice];
		    
		    player.setWeapon(weapon);
		    
		    if(choice != 0) {
		        Items temp = items[choice];

		        for(int i = choice; i > 0; i--) {
		            items[i] = items[i - 1];
		        }

		        items[0] = temp;
		    }
		    
		    System.out.println("Equipped " + weapon.getItemName() + "!");
	 }
	 
	 public void equipArmor(GameCharacter player) {
		 System.out.print("Enter item number to use: ");
		    int choice = scanner.nextInt();
		    scanner.nextLine();

		    choice--; // because inventory displays starting at 1

		    if(choice < 0 || choice >= itemCount) {
		        System.out.println("Invalid item!");
		        return;
		    }
		    
		    if(!(items[choice] instanceof Armors)) {
	    		System.out.println("That item cannot be equip!");
	            return;
	    	}
		    
		    Armors armor = (Armors) items[choice];
		    
		    player.setArmor(armor);
		    
		    if(choice != 0) {
		        Items temp = items[choice];

		        for(int i = choice; i > 0; i--) {
		            items[i] = items[i - 1];
		        }

		        items[0] = temp;
		    }
		    System.out.println("Equipped " + armor.getItemName() + "!");
	 }
	 
	 public Items getItem(int index) {
	        return items[index];
	    }
	 
	 public void useItem(GameCharacter player) {
		 System.out.print("Enter item number to use: ");
		    int choice = scanner.nextInt();
		    scanner.nextLine();

		    choice--; // because inventory displays starting at 1

		    if(choice < 0 || choice >= itemCount) {
		        System.out.println("Invalid item!");
		        return;
		    }
		    
		    	if(!(items[choice] instanceof Consumables)) {
		    		System.out.println("That item cannot be used!");
		            return;
		    	}
		    		Consumables consumables = (Consumables) items[choice];
		    		
		    		if(consumables.getHealAmount() > 0) {
		    	        player.heal(consumables.getHealAmount());
		    	        System.out.println("Used " + consumables.getItemName() + "!");
		    	        System.out.println("+" + consumables.getHealAmount() + " HP");
		    		}
		    		
		    		if(consumables.getManaAmount() > 0) {
		    			player.addMana(consumables.getManaAmount());
		    			System.out.println("Used " + consumables.getItemName() + "!");
		    			System.out.println("+" + consumables.getManaAmount() + " Mana");
		    		}
		    		
		    		consumables.setQuantity(consumables.getQuantity() - 1);
		    		
		    		if(consumables.getQuantity() <= 0) {
		    		    for(int i = choice; i < itemCount - 1; i++) {
		    		        items[i] = items[i + 1];
		    		    }

		    		    items[itemCount - 1] = null;
		    		    itemCount--;
		    		}
		    		
		    		
	 }
	 
	 public void dropItem(GameCharacter player) {

		 System.out.print("Enter item number to drop: ");
		    int choice = scanner.nextInt();
		    scanner.nextLine();

		    choice--; // because inventory displays starting at 1

		    if(choice < 0 || choice >= itemCount) {
		        System.out.println("Invalid item!");
		        return;
		    }
		    
		    if(items[choice] == player.getWeapon()) {
		        System.out.println("Unequip your weapon first!");
		        return;
		    }

		    if(items[choice] == player.getArmor()) {
		        System.out.println("Unequip your armor first!");
		        return;
		    }

		    System.out.println("Dropped " + items[choice].getItemName());

		    for(int i = choice; i < itemCount - 1; i++) {
		        items[i] = items[i + 1];
		    }

		    items[itemCount - 1] = null;
		    itemCount--;
	    }
	 
	 public void removeItem(int index) {

		    if(index < 0 || index >= itemCount) {
		        return;
		    }

		    Items item = items[index];

		    if(item.getQuantity() > 1) {
		        item.setQuantity(item.getQuantity() - 1);
		        return;
		    }

		    for(int i = index; i < itemCount - 1; i++) {
		        items[i] = items[i + 1];
		    }

		    items[itemCount - 1] = null;
		    itemCount--;
		}
	 
	
	public void displayInventory(GameCharacter player) {
		System.out.println("===================");
		System.out.println("     INVENTORY");
		System.out.println("===================");
		System.out.println("Hero: " + player.getName());
		System.out.println("Gold: " + player.getGold());
		System.out.println("Capacity: " + itemCount + "/" + items.length);
		System.out.println("===================");
		System.out.println();
		System.out.println("WEAPONS: ");
		System.out.println("----------------------");
		for(int i = 0; i < itemCount;i++) {
			
			if(items[i] instanceof Weapon) {
				Weapon weapon = (Weapon) items[i];
				
				System.out.println((i + 1) + ". " + items[i].getItemName());
				if(items[i] == player.getWeapon()) {
					System.out.print(" [Equipped]");
				}
				
				System.out.println();
				System.out.println("+" + weapon.getAttack() + " Attack");
				System.out.println("+" + weapon.getCriticalChance() + "% Crit Chance");
				System.out.println("+" + weapon.getCriticalDamage() + "% Crit Damage");
				System.out.println();
			}
			
		}
		System.out.println();
		System.out.println("ARMORS: ");
		System.out.println("----------------------");
		for(int i = 0; i < itemCount;i++) {
			
			if(items[i] instanceof Armors) {
				Armors armor = (Armors) items[i];
				
				System.out.println((i + 1) + ". " + items[i].getItemName());
				if(items[i] == player.getArmor()) {
					System.out.print(" [Equipped]");
				}
				System.out.println();
				System.out.println("+" + armor.getHp() + " Hp");
				System.out.println("+" + armor.getDefense() + " Defense");
				System.out.println();
			}		
	   }
		
		System.out.println();
		System.out.println("CONSUMABLES: ");
		System.out.println("----------------------");
		for(int i = 0; i < itemCount;i++) {
			
			if(items[i] instanceof Consumables) {
				Consumables consumables = (Consumables) items[i];
				System.out.println((i + 1) + ". " + items[i].getItemName() + " " + consumables.getQuantity() + "x");
				
				if(consumables.getHealAmount() > 0) {
					System.out.println("  Restores " + consumables.getHealAmount() + " HP");
					System.out.println();
				}
				
				if(consumables.getManaAmount() > 0) {
					System.out.println("  Restores " + consumables.getManaAmount() + " Mana");
					System.out.println();
				}
			}		
	   }
		
		System.out.println();
		System.out.println("MATERIALS: ");
		System.out.println("----------------------");
		for(int i = 0; i < itemCount;i++) {
			
			if(items[i] instanceof Materials) {
				Materials materials = (Materials) items[i];
				
				System.out.println((i + 1) + ". " + items[i].getItemName() + " " + materials.getQuantity() + "x");
				System.out.println();
			}		
	   }
		
		System.out.println("================================");
		System.out.println("1. Use Item");
		System.out.println("2. Equip Weapon");
		System.out.println("3. Equip Armor");
		System.out.println("4. Drop Item");
		System.out.println("5. Back");
		System.out.println("================================");
		System.out.print("Choice: ");
		
	}
	
	public int getItemCount() {
		return itemCount;
	}
}
