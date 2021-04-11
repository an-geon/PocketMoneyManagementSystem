import java.util.ArrayList;
import java.util.Scanner;

public class Pocketmoney {
	protected Addkind kind = Addkind.Income;
	protected String date;
	protected String content;
	protected int price;
	protected int balance;
	static int index = 0;
	
	public void pocketmoney() {
		
	}
	
	public void pocketmoney(String date, String content) {
		this.date = date;
		this.content = content;
	}
	
	public void pocketmoney(String date, String content, int price, int balance) {
		this.date = date;
		this.content = content;
		this.price = price;
		this.balance = balance;
	}
	
	public Addkind getKind() {
		return kind;
	}

	public void setKind(Addkind kind) {
		this.kind = kind;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Date :");
		String date = input.next();
		this.setDate(date);
		
		System.out.print("Content :");
		String content = input.next();
		this.setContent(content);
		
		System.out.print("Price :");
		int price = input.nextInt();
		this.setPrice(price);
	}
}
