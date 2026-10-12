package GAME;

public class Swords extends Weapon {
	
	public Swords(String Name, int attack, int criticalChance,int criticalDamage) {
		super(Name,
			WeaponTypes.SWORD,
			attack,
			0,
			0,
			0,
			0,
			0,
			criticalChance,
			criticalDamage
			);
	}
}
