package GAME;

public class Shields extends Weapon {
	public Shields(String Name, int attack, int defense, int hp) {
		super(Name,
			WeaponTypes.SHIELD,
			attack,
			0,
			defense,
			0,
			hp,
			0,
			0,
			0
			);
	}
}
