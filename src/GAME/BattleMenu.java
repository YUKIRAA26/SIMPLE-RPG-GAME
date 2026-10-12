package GAME;

public class BattleMenu {
	
	
	
	public static void displayBattleMenu(GameCharacter player,Enemy enemy) {
		 System.out.println();
	        System.out.println("==========================================================");
	        System.out.println("                    ⚔ BATTLE ⚔");
	        System.out.println("==========================================================");

	        System.out.printf("👤 %-20s 🐺 %s%n",
	                player.getName(),
	                enemy.getName());

	        System.out.printf("Class : %-14s Lv : %d%n",
	                player.getCharacterClass(),
	                player.getLevel());

	        System.out.printf("Enemy Lv : %d%n", enemy.getLevel());

	        System.out.println("----------------------------------------------------------");

	        System.out.printf("❤️ HP   : %d/%d%n",
	                player.getHp(),
	                player.getMaxHp());

	        System.out.printf("🔷 Mana : %d/%d%n",
	                player.getMana(),
	                player.getMaxMana());

	        System.out.println();

	        System.out.printf("❤️ Enemy HP : %d/%d%n",
	                enemy.getHp(),
	                enemy.getMaxHp());

	        System.out.println("----------------------------------------------------------");

	        System.out.println("1. ⚔ Attack");
	        System.out.println("2. ✨ Skills");
	        System.out.println("3. 🎒 Heal");
	        System.out.println("4. 🛡 Defend");
	        System.out.println("5. 🏃 Run");

	        System.out.println("==========================================================");
	        System.out.print("Choice: ");
	       
	}
}
