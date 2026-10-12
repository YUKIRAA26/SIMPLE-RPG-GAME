package GAME;

public class ArmorFactory {
	
	
	//swordman
	public static Armors leatherArmor() {
	    return new Armors("Leather Armor", ArmorTypes.LIGHT_ARMOR, 8, 30);
	}

	public static Armors ironArmor() {
	    return new Armors("Iron Armor", ArmorTypes.HEAVY_ARMOR, 15, 60);
	}

	public static Armors steelArmor() {
	    return new Armors("Steel Armor", ArmorTypes.HEAVY_ARMOR, 25, 100);
	}

	public static Armors knightArmor() {
	    return new Armors("Knight Armor", ArmorTypes.HEAVY_ARMOR, 35, 140);
	}

	public static Armors dragonArmor() {
	    return new Armors("Dragon Armor", ArmorTypes.HEAVY_ARMOR, 50, 200);
	}
	
	//archer
	
	public static Armors hunterVest() {
	    return new Armors("Hunter Vest", ArmorTypes.LIGHT_ARMOR, 5, 20);
	}

	public static Armors rangerVest() {
	    return new Armors("Ranger Vest", ArmorTypes.LIGHT_ARMOR, 10, 35);
	}

	public static Armors shadowVest() {
	    return new Armors("Shadow Vest", ArmorTypes.LIGHT_ARMOR, 18, 55);
	}

	public static Armors windWalkerArmor() {
	    return new Armors("Wind Walker Armor", ArmorTypes.LIGHT_ARMOR, 25, 80);
	}

	public static Armors phantomArmor() {
	    return new Armors("Phantom Armor", ArmorTypes.LIGHT_ARMOR, 35, 120);
	}
	
	//mage
	
	public static Armors apprenticeRobe() {
	    return new Armors("Apprentice Robe", ArmorTypes.ROBE, 3, 20);
	}

	public static Armors mysticRobe() {
	    return new Armors("Mystic Robe", ArmorTypes.ROBE, 6, 40);
	}

	public static Armors arcaneRobe() {
	    return new Armors("Arcane Robe", ArmorTypes.ROBE, 10, 70);
	}

	public static Armors celestialRobe() {
	    return new Armors("Celestial Robe", ArmorTypes.ROBE, 15, 100);
	}

	public static Armors archmageRobe() {
	    return new Armors("Archmage Robe", ArmorTypes.ROBE, 22, 150);
	}
	
	//saint
	
	public static Armors holyRobe() {
	    return new Armors("Holy Robe", ArmorTypes.ROBE, 5, 25);
	}

	public static Armors priestVestment() {
	    return new Armors("Priest Vestment", ArmorTypes.ROBE, 10, 45);
	}

	public static Armors blessedVestment() {
	    return new Armors("Blessed Vestment", ArmorTypes.ROBE, 15, 70);
	}

	public static Armors divineVestment() {
	    return new Armors("Divine Vestment", ArmorTypes.ROBE, 22, 110);
	}

	public static Armors angelicVestment() {
	    return new Armors("Angelic Vestment", ArmorTypes.ROBE, 30, 170);
	}
	
	//tank
	public static Armors woodenShieldArmor() {
	    return new Armors("Wooden Guard Armor", ArmorTypes.HEAVY_ARMOR, 15, 50);
	}

	public static Armors fortressArmor() {
	    return new Armors("Fortress Armor", ArmorTypes.HEAVY_ARMOR, 30, 100);
	}

	public static Armors guardianArmor() {
	    return new Armors("Guardian Armor", ArmorTypes.HEAVY_ARMOR, 45, 170);
	}

	public static Armors titanArmor() {
	    return new Armors("Titan Armor", ArmorTypes.HEAVY_ARMOR, 60, 240);
	}

	public static Armors immortalArmor() {
	    return new Armors("Immortal Armor", ArmorTypes.HEAVY_ARMOR, 80, 320);
	}
}
