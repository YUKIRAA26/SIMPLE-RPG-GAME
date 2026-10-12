package GAME;

public abstract class Items {
	private String itemName;
	private ItemType itemType;
	private int quantity = 0;
	
	
	public Items(String itemName, ItemType itemType) {
		this.itemName = itemName;
		this.itemType = itemType;
		quantity = 1;
	}
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public ItemType getItemType() {
		return itemType;
	}
	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
