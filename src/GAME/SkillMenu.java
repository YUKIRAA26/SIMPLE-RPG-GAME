package GAME;
import java.util.Scanner;

public class SkillMenu {
	
	public static void displaySkillMenu(GameCharacter player, Enemy enemy, Scanner scanner ) {
		while (true) {
			
			System.out.println("== Skills == ");
			System.out.println("1. Skill 1" );
			System.out.println("2. Skill 2" );
			System.out.println("3. Skill 3" );
			System.out.println("4. Back");
			System.out.print("Choice: ");
			int skillChoice = scanner.nextInt();
			scanner.nextLine();
			
			switch(skillChoice) {
				case 1 -> {
					player.skill1(enemy);
					return;
				}
				case 2 -> {
					player.skill2(enemy);
					return;
				}
				case 3 ->{
					player.skill3(enemy);
					return;
				}
				case 4 -> {
					return;
				}
				default -> System.out.println("Invalid Input!");
			}
			
			break;
			
			
		}
	}
}
