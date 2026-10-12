package GAME;
import java.util.Random;

public class EnemyFactory {
	
	public static Enemy getRandomEnemy(MapLocation location) {
		Random random = new Random();
		
		switch(location) {
			case FOREST -> {
				if(random.nextInt(100) < 20) {
					return new ForestGuardianStag();
				}
				
				 return switch(random.nextInt(8)) {
	                case 0 -> new ForestWolf();
	                case 1 -> new WildBoar();
	                case 2 -> new ForestSpider();
	                case 3 -> new GiantBat();
	                case 4 -> new PoisonMushroom();
	                case 5 -> new GoblinScout();
	                case 6 -> new BlackBear();
	                case 7 -> new TreantSapling();
	                default -> new VineSlime();
				 };
			}
			default -> {
				return null;
			}
		   
		}
	}
}
