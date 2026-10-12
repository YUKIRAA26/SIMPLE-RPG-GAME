package GAME;

public class ConsumablesFactory {
	 // HP Potions
    public static Consumables smallPotion() {
        return new Consumables("Small Potion", 20, 0);
    }

    public static Consumables mediumPotion() {
        return new Consumables("Medium Potion", 50, 0);
    }

    public static Consumables largePotion() {
        return new Consumables("Large Potion", 100, 0);
    }

    // Mana Potions
    public static Consumables smallManaPotion() {
        return new Consumables("Small Mana Potion", 0, 20);
    }

    public static Consumables mediumManaPotion() {
        return new Consumables("Medium Mana Potion", 0, 50);
    }

    public static Consumables largeManaPotion() {
        return new Consumables("Large Mana Potion", 0, 100);
    }

    // Mixed Potion
    public static Consumables elixir() {
        return new Consumables("Elixir", 100, 100);
    }
}
