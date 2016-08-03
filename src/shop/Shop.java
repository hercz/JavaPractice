package shop;

import java.util.Hashtable;

import milk.Milk;

public class Shop {
	private String shopName;
	private String shopAddress;
	private String shopOwner;
	private Hashtable<Long, Milk> milkBar;

	public Shop(String shopName, String shopAddress, String shopOwner) {
		this.shopName = shopName;
		this.shopAddress = shopAddress;
		this.shopOwner = shopOwner;
		new Hashtable<>();
	}

	public Shop(String shopName, String shopAddress, String shopOwner, Hashtable<Long, Milk> milkBar) {
		this.shopName = shopName;
		this.shopAddress = shopAddress;
		this.shopOwner = shopOwner;
		this.milkBar = milkBar;
	}

	public Hashtable<Long, Milk> getMilkBar() {
		return milkBar;
	}

	public String getShopName() {
		return shopName;
	}

	public String getShopAddress() {
		return shopAddress;
	}

	public String getShopOwner() {
		return shopOwner;
	}

	public boolean isThereMilk() {
		return !milkBar.isEmpty();
	}

	public Milk sellMilk(Milk m) {
		return milkBar.remove(m.getBarCode());
	}

	public void buyMilk(Milk m) {
		milkBar.put((long) m.getBarCode(), m);
	}

	@Override
	public String toString() {
		return "Shop [shopName=" + shopName + ", shopAddress=" + shopAddress + ", shopOwner=" + shopOwner + ", milkBar="
				+ milkBar + "]";
	}
}
