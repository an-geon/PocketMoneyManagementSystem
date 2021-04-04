import java.util.ArrayList;
import java.util.Scanner;

public class PocketmoneyManager {
	Pocketmoney pocketmoney;
	Scanner input;
	PocketmoneyManager(Scanner input){
		this.input = input;
	}
	
	public void incomePocketmoney() {
		pocketmoney = new Pocketmoney();
		System.out.print("Date :");
		pocketmoney.date.add(input.next());
		System.out.print("Content :");
		pocketmoney.content.add(input.next());
		System.out.print("Price :");
		pocketmoney.price[pocketmoney.index] = input.nextInt();
		if(pocketmoney.index != 0)
			pocketmoney.balance[pocketmoney.index] = pocketmoney.balance[pocketmoney.index - 1]
				                                      + pocketmoney.price[pocketmoney.index];
		else
			pocketmoney.balance[pocketmoney.index]= pocketmoney.price[pocketmoney.index];
		pocketmoney.index++;
	}
	
	public void outlayPocketmoney() {
		System.out.print("Date :");
		pocketmoney.date.add(input.next());
		System.out.print("Content :");
		pocketmoney.content.add(input.next());
		System.out.print("Price :");
		pocketmoney.price[pocketmoney.index] = input.nextInt();
		if(pocketmoney.index != 0)
			pocketmoney.balance[pocketmoney.index] = pocketmoney.balance[pocketmoney.index - 1] 
				                                      - pocketmoney.price[pocketmoney.index];
		else
			pocketmoney.balance[pocketmoney.index]= pocketmoney.price[pocketmoney.index];
		pocketmoney.index++;
	}
	
	public void viewList() {
		pocketmoney.printlist();
	}
}
