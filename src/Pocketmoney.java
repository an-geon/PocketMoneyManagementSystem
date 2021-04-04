import java.util.ArrayList;

public class Pocketmoney {
	ArrayList <String> date = new ArrayList();
	ArrayList <String> content = new ArrayList();
	int [] price = new int[20];
	int [] balance = new int[20];
	int index = 0;
	
	public void pocketmoney() {
		
	}
	
	public void pocketmoney(ArrayList date, ArrayList content) {
		this.date = date;
		this.content = content;
	}
	
	public void pocketmoney(ArrayList date, ArrayList content, int [] price, int [] balance) {
		this.date = date;
		this.content = content;
		this.price = price;
		this.balance = balance;
		
	}
	public void printlist() {
		System.out.println("date\tcontent\tprice\tbalance");
		for(int i = 0; i < date.size(); i++)
		System.out.println(date.get(i) + "\t" + content.get(i) +"\t" + price[i] + "\t" + balance[i]);
	}
}
