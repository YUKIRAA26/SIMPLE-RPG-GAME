package GAME;
import java.util.*;

public class AdventureMenu {
	 public static int displayAdventureMenu(Scanner scanner) {

	        while (true) {

	            System.out.println();
	            System.out.println("==================================================");
	            System.out.println("               🗺 ADVENTURE MENU");
	            System.out.println("==================================================");
	            System.out.println("1. 🌍 Explore");
	            System.out.println("   Search for monsters, treasures, and mysteries.");
	            System.out.println();

	            System.out.println("2. 🚶 Travel");
	            System.out.println("   Move to another location.");
	            System.out.println();

	            System.out.println("3. 📜 Quest Board");
	            System.out.println("   Accept quests from the Adventurer's Guild.");
	            System.out.println();

	            System.out.println("4. 🏕 Camp");
	            System.out.println("   Rest and recover HP & Mana.");
	            System.out.println();

	            System.out.println("5. 📖 Area Information");
	            System.out.println("   View monsters and dangers in this region.");
	            System.out.println();

	            System.out.println("6. ⬅ Return");
	            System.out.println("==================================================");
	            System.out.print("Choice: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine();

	            if (choice >= 1 && choice <= 6) {
	                return choice;
	            }

	            System.out.println();
	            System.out.println("Invalid choice!");
	        }
	    }
}
