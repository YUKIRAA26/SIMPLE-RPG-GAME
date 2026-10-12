package GAME;
import java.util.*;

public class ExploreMenu {
	
	public static MapLocation displayExplore(Scanner scanner) {
			   while (true) {

		            System.out.println();
		            System.out.println("==================================================");
		            System.out.println("                  🌍 EXPLORE");
		            System.out.println("==================================================");
		            System.out.println("Choose a location to explore:");
		            System.out.println();

		            System.out.println("1. 🌲 Enchanted Forest");
		            System.out.println("   Difficulty : Easy");
		            System.out.println();

		            System.out.println("2. 🕳 Whispering Cave");
		            System.out.println("   Difficulty : Normal");
		            System.out.println();

		            System.out.println("3. 🏰 Forgotten Dungeon");
		            System.out.println("   Difficulty : Hard");
		            System.out.println();

		            System.out.println("4. 🏯 Ancient Castle");
		            System.out.println("   Difficulty : Extreme");
		            System.out.println();

		            System.out.println("5. 👑 Demon King's Castle");
		            System.out.println("   Difficulty : Divine");
		            System.out.println();

		            System.out.println("6. ⬅ Return");
		            System.out.println("==================================================");
		            System.out.print("Choice: ");

		            int choice = scanner.nextInt();
		            scanner.nextLine();

		            switch (choice) {
		                case 1 -> { return MapLocation.FOREST; }
		                case 2 -> { return MapLocation.CAVE; }
		                case 3 -> { return MapLocation.DUNGEON; }
		                case 4 -> { return MapLocation.CASTLE; }
		                case 5 -> { return MapLocation.DEMON_KING_CASTLE; }
		                case 6 -> { return MapLocation.RETURN; }
		            }
		            
		            System.out.println();
		            System.out.println("Invalid choice!");
		           
		}
	}
}
