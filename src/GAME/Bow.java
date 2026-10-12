package GAME;

public class Bow extends Weapon {
	
	public Bow(String Name,int agility, int criticalChance,int criticalDamage) {
		super(Name,
			WeaponTypes.BOW,
			0,
			0,
			agility,
			0,
			0,
			0,
			criticalChance,
			criticalDamage
			);
	}
}
