import java.util.Scanner;

import exceptions.DateFormatException;

public interface UserInput {
	public Addkind getKind();

	public void setKind(Addkind kind);

	public String getDate();
		
	public void setDate(String date) throws DateFormatException;

	public String getContent();

	public void setContent(String content);

	public int getPrice();

	public void setPrice(int price);
	
	public int getBalance();

	public void setBalance(int balance);
	
	public int getIndex();

	public void setIndex(int index);
	
	public void setUserDate(Scanner input);
	
	public void setUserContent(Scanner input);
	
	public void setUserPrice(Scanner input);
	
}
