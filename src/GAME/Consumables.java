package GAME;

public class Consumables extends Items{
	private int healAmount;
	private int manaAmount;
	
	public Consumables(String name, int healAmount, int manaAmount) {
		super(name, ItemType.CONSUMABLES);
		
		this.healAmount = healAmount;
		this.manaAmount = manaAmount;
	}
	
	public int getHealAmount() {
        return healAmount;
    }

    public int getManaAmount() {
        return manaAmount;
    }
}
