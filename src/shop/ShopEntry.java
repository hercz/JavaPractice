package shop;

import milk.Milk;

public class ShopEntry {
	private Milk milk;
	private int quantity;
	private int price;

	public ShopEntry(Milk milk, int quantity, int price) {
		this.milk = milk;
		this.quantity = quantity;
		this.price = price;
	}

	public Milk getMilk() {
		return milk;
	}

	public void setMilk(Milk milk) {
		this.milk = milk;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void addToQuantity(int quant) {
		this.quantity += quant;
	}

	public void removeFromQuantity(int quant) {
		this.quantity -= quant;
	}

}
