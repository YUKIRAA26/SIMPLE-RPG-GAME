package GAME;

public class Armors extends Items{
	private int hp;
	private int defense;
	private ArmorTypes armorType;
	

	public Armors(String name,ArmorTypes armorType, int hp,int defense) {
		super(name, ItemType.ARMOR);
		this.setArmorType(armorType);
		this.setHp(hp);
		this.setDefense(defense);
		
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public int getDefense() {
		return defense;
	}


	public void setDefense(int defense) {
		this.defense = defense;
	}


	public ArmorTypes getArmorType() {
		return armorType;
	}


	public void setArmorType(ArmorTypes armorType) {
		this.armorType = armorType;
	}
}
