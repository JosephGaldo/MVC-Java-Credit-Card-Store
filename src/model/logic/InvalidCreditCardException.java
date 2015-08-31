package model.logic;
import java.lang.Exception;

public class InvalidCreditCardException extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("unused")
	private String _creditCardNumber;
	public InvalidCreditCardException()
	{
		super("Invalid Credit Card Exception");
	}
	
	public InvalidCreditCardException(String message)
	{
		super("Invalid Credit Card Exception : " + message);
		
	}
	
	
	
	
	
}
