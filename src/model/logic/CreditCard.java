package model.logic;
import java.util.Date;

public class CreditCard 
{
	private model.CreditCard _creditCard;
	public CreditCard(model.CreditCard creditCard)
	{
			this._creditCard = creditCard;
			
	}
	
	public String DeductFromBalance(double amount) throws InvalidCreditCardException
	{
		Date date = new Date();
		if(amount < this._creditCard.get_balance())
		{
			double currentBalance = SubtractFromBalance(amount);
			return "Successful! Your Current Balance as of " + date.toString() + "\n is " + currentBalance;	
		}
		else
		{
			throw new InvalidCreditCardException("Amount is Greater than Balance");
		}
		
	}
	
	private double SubtractFromBalance(double amount)
	{
		this._creditCard.set_balance(this._creditCard.get_balance() - amount);
		return this._creditCard.get_balance();
		
	}
	
	
}
