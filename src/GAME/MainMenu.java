package GAME;
import java.util.Scanner;

public class MainMenu {
	
	public static int displayMainMenu(GameCharacter player, Scanner scanner) {
		
		while(true) {
			 System.out.println("\n=====================================");
		        System.out.println("      LEGENDS OF ELDORIA");
		        System.out.println("=====================================");
		        System.out.println("Hero : " + player.getName());
		        System.out.println("Class: " + player.getCharacterClass());
		        System.out.println("Lv   : " + player.getLevel());
		        System.out.println("Gold : " + player.getGold());
		        System.out.println("=====================================");
		        System.out.println("1. 🗺 Adventure");
		        System.out.println("2. 🎒 Inventory");
		        System.out.println("3. 👤 Character");
		        System.out.println("4. 🛒 Shop");
		        System.out.println("5. ⚒ Blacksmith");
		        System.out.println("6. 💾 Save Game (Coming soon)");
		        System.out.println("7. 🚪 Exit");
		        System.out.println("=====================================");
		        System.out.print("Choice: ");
		        int choice = scanner.nextInt();
		        scanner.nextLine();
		      
		        return choice;
		}
		
		       
	}
}
