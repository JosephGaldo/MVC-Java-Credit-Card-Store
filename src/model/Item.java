package model;

public class Item 
{
	private String _itemName;

	public String get_itemName() {
		return _itemName;
	}

	public void set_itemName(String itemName) {
		this._itemName = itemName;
	}
	
	private double _price;

	public double get_price() {
		return _price;
	}

	public void set_price(double price) {
		this._price = price;
	}
	
	private int _quantity;

	public int get_quantity() {
		return _quantity;
	}

	public void set_quantity(int quantity) {
		this._quantity = quantity;
	}

}
