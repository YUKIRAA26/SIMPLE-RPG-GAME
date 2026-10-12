package GAME;

public class WeaponFactory {
	
	
	//swordMan
	public static Weapon rustySword() { //can be obtain in forest adventure
		return new Swords("Rusty Sword", 15,2,10);
	}
	
	public static Weapon ironSword() { //can be obtain forest rare+ monster
		return new Swords("Iron Sword",25,5,20);
	}
	
	public static Weapon knightSword() { //can be obtain forest rare+ monster
		return new Swords("Knight Sword",40,8,35);
	}
	
	public static Weapon steelClaymore() {	//obtained by defeating the mini boss in forest
		return new Swords("Steel Claymore",55,10,50);
	}
	
	public static Weapon silverBlade() { //craftable
		return new Swords("Silver Blade",70,12,60);
	}
	
	public static Weapon crimsonSlayer() { //1% chance of getting in the next location after the forest mini boss
		return new Swords("Crimson Slayer",90,15,80);
	}
	
	public static Weapon dragonFang() { //can be bought by shop
		return new Swords("Dragon Fang",120,18,100);
	}
	
	public static Weapon shadowReaver() { //can be obtain by crafting
		return new Swords("Shadow Reaver",145,22,130);
	}
	
	public static Weapon pheonixGreatsword() { //can be obtain by crafting
		return new Swords("Phoenix Greatsword",180,25,160);
	}
	
	public static Weapon excalibur() { //can be obtain by crafting
		return new Swords("Excalibur",230,30,200);
	}
	
	//archer
	
	public static Weapon hunterBow() { //can be obtain in forest adventure
		return new Bow("Hunter Bow",12,10,18);
	}
	
	public static Weapon oakLongBow() { //can be obtain forest rare+ monster
		return new Bow("Oak Longbow",22,12,25);
	}
	
	public static Weapon elvenBow() {	//obtained by defeating the mini boss in forest
		return new Bow("Elven Bow",35,15,40);
	}
	
	public static Weapon steelRecurve() { //craftable
		return new Bow("Steel Recurve",50,18,55);
	}
	
	public static Weapon windRunner() { //1% chance of getting in the next location after the forest mini boss
		return new Bow("Windrunner",65,22,70);
	}
	
	public static Weapon moonlightBow() { //can be bought by shop
		return new Bow("Moonlight Bow",85,25,90);
	}
	
	public static Weapon dragonBow() { //can be obtain by crafting
		return new Bow("Dragon Bow",110,28,120);
	}
	
	public static Weapon phantomBow() { //can be obtain by crafting
		return new Bow("Phantom Bow",140,30,150);
	}
	
	public static Weapon celestialBow() { //can be obtain by crafting
		return new Bow("Celestial Bow",175,33,180);
	}
	
	public static Weapon worldPiercer() { //can be obtain by crafting
		return new Bow("World Piercer",220,38,220);
	}
	
	//mage
	
	public static Weapon woodenStaff() { //can be obtain in forest adventure
		return new Staff("Wooden Staff",5,15,20);
	}
	
	public static Weapon apprenticeStaff() { //can be obtain forest rare+ monster
		return new Staff("Apprentice Staff",8,25,30);
	}
	
	public static Weapon crystalStaff() {	//obtained by defeating the mini boss in forest
		return new Staff("Crystal Staff",10,40,40);
	}
	
	public static Weapon sageStaff() { //craftable
		return new Staff("Sage Staff",15,60,50);
	}
	
	public static Weapon arcaneStaff() { //1% chance of getting in the next location after the forest mini boss
		return new Staff("Arcane Staff",18,85,60);
	}
	
	public static Weapon infernoStaff() { //can be bought by shop
		return new Staff("Inferno Staff",22,110,75);
	}
	
	public static Weapon frozenStaff() { //can be obtain by crafting
		return new Staff("Frozen Staff",25,140,90);
	}
	
	public static Weapon stormStaff() { //can be obtain by crafting
		return new Staff("Storm Staff",30,175,110);	
	}
	
	public static Weapon ancientStaff() { //can be obtain by crafting
		return new Staff("Ancient Staff",35,220,140);
	}
	
	public static Weapon staffOfEternity() { //can be obtain by crafting
		return new Staff("Staff of Eternity",40,300,180);
	}
	
	//saint
	
	public static Weapon blessedStaff() { //can be obtain in forest adventure
		return new HolyStaff("Blessed Staff",10,20,20);
	}
	
	public static Weapon priestStaff() { //can be obtain forest rare+ monster
		return new HolyStaff("Priest Staff",15,30,30);
	}
	
	public static Weapon angelStaff() {	//obtained by defeating the mini boss in forest
		return new HolyStaff("Angel Staff",20,45,40);
	}
	
	public static Weapon divineRod() { //craftable
		return new HolyStaff("Divine Rod",30,60,55);
	}
	
	public static Weapon holyScepter() { //1% chance of getting in the next location after the forest mini boss
		return new HolyStaff("Holy Scepter",40,80,70);
	}
	
	public static Weapon archangel() { //can be bought by shop
		return new HolyStaff("Archangel Staff",55,100,90);
	}
	
	public static Weapon sacredRelic() { //can be obtain by crafting
		return new HolyStaff("Sacred Relic",70,125,110);
	}
	
	public static Weapon heavenStaff() { //can be obtain by crafting
		return new HolyStaff("Heaven Staff",90,160,140);	
	}
	
	public static Weapon lightBringer() { //can be obtain by crafting
		return new HolyStaff("Light Bringer",120,210,170);
	}
	
	public static Weapon staffOfSalvation() { //can be obtain by crafting
		return new HolyStaff("Staff of Salvation",150,280,220);
	}
	
	//shield
	
	public static Weapon woodenShield() { //can be obtain in forest adventure
		return new Shields("Wooden Shield",5,25,0);
	}
	
	public static Weapon ironShield() { //can be obtain forest rare+ monster
		return new Shields("Iron Shield",10,40,0);
	}
	
	public static Weapon knightShield() {	//obtained by defeating the mini boss in forest
		return new Shields("Knight Shield",15,55,0);
	}
	
	public static Weapon steelBulwark() { //craftable
		return new Shields("Steel Bulwark",20,75,0);
	}
	
	public static Weapon guardianShield() { //1% chance of getting in the next location after the forest mini boss
		return new Shields("Guardian Shield",30,95,5);
	}
	
	public static Weapon titanShield() { //can be bought by shop
		return new Shields("Titan Shield",40,120,10);
	}
	
	public static Weapon dragonShield() { //can be obtain by crafting
		return new Shields("Dragon Shield",55,145,15);
	}
	
	public static Weapon holyAegis() { //can be obtain by crafting
		return new Shields("Holy Aegis",70,170,20);		
	}
	
	public static Weapon fortressShield() { //can be obtain by crafting
		return new Shields("Fortress Shield",90,210,25);
	}
	
	public static Weapon AegisOfEldoria() { //can be obtain by crafting
		return new Shields("Aegis of Eldoria",120,260,35);
	}
	
	
	
	
	
	
	
	
	

}
