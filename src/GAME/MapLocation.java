package GAME;


public enum MapLocation {
	VILLAGE("Village"),
    FOREST("Forest"),
    CAVE("Cave"),
    DUNGEON("DUNGEON"),
    CASTLE("CASTLE"),
    DEMON_KING_CASTLE("DEMON KING CASTLE"),
    RETURN("return");
    

    private final String mapName;
    
    MapLocation(String mapName) {
		this.mapName = mapName;
		}
    
    
    public String getMapName() {
    	return mapName;
    }
}
