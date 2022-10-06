package encap;

public class ClashofClans {
	private String loot;
	private int elixir;
	private int coins;
	
	//Jo set method hoga vo variables set karega
	public void setLoot(String newloot) {
		loot = newloot;
	}

	//Jo get method hoga vo variables dega
	public String getLoot() {
		return loot;
	}
	
	//Same to same elixir ke liye
	public void setElixir(int newElixir) {
		elixir = newElixir;
	}


	public int getElixir() {
		return elixir;
	}
	
	//And ye Coins ke liye
	public void setCoins(int newCoins) {
		coins = newCoins;
	}


	public int getCoins() {
		return coins;
	}
	
}
