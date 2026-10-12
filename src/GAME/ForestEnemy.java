package GAME;

public enum ForestEnemy {
	FOREST_WOLF("Forest Wolf"),
    WILD_BOAR("Wild Boar"),
    POISON_MUSHROOM("Poison Mushroom"),
    GIANT_BAT("Giant Bat"),
    VINE_SLIME("Vine Slime"),
    FOREST_SPIDER("Forest Spider"),
    GOBLIN_SCOUT("Gobline Scout"),
    BLACK_BEAR("Black Bear"),
    TREANT_SAPLING("Treant Sapling"),
    FOREST_GUARDIAN_STAG("Forest Guardian Stah]g");
	
	private final String name;
	
	ForestEnemy(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}


}
