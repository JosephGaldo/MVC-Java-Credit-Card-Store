package model.logic;

public class Item 
{
	private model.Item _item;
	public Item(model.Item item)
	{
		this._item = item;
		
	}
	public double GetNetPrice()
	{
		return this._item.get_price() + this.GetEvatPrice();
	}
	
	public double GetEvatPrice()
	{
		return this._item.get_price() * 0.12;
	}
}
