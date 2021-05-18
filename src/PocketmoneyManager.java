import java.util.ArrayList;
import java.util.Scanner;

public class PocketmoneyManager {
	ArrayList <Pocketmoney> pocketmoney1 = new ArrayList <Pocketmoney>();
	Scanner input;
	PocketmoneyManager(Scanner input){
		this.input = input;
	}
	
	public void addPocketmoney() {
		int kind = 0;
		Pocketmoney pocketmoney;
		int index;
		while(kind != 1 && kind !=2) {
			System.out.println("Select number between 1(income) or 2(outlay)");
			kind = input.nextInt();
			
			if (kind == 1) {
				pocketmoney = new Income();
				pocketmoney.setUserDate(input);
				pocketmoney.setUserContent(input);
				pocketmoney.setUserPrice(input);
				index = pocketmoney.getIndex();
				
				if(index == 0) {
					pocketmoney.setBalance(pocketmoney.getPrice());
					pocketmoney.setIndex(index+1);
				}
				
				else {
					pocketmoney.setBalance(pocketmoney1.get(pocketmoney.getIndex()-1).getBalance() 
							                                                    + pocketmoney.getPrice());
					pocketmoney.setIndex(index+1);
				}
				
				pocketmoney.setKind(Addkind.Income);
				pocketmoney1.add(pocketmoney);
				break;
			}
			
			else if (kind == 2) {
				pocketmoney = new Outlay();
				pocketmoney.setUserDate(input);
				pocketmoney.setUserContent(input);
				pocketmoney.setUserPrice(input);
				index = pocketmoney.getIndex();
				
				if(index == 0) {
					pocketmoney.setBalance(pocketmoney.getPrice());
					pocketmoney.setIndex(index+1);
				}
				
				else {
					pocketmoney.setBalance(pocketmoney1.get(pocketmoney.getIndex()-1).getBalance() 
							                                                    + pocketmoney.getPrice());
					pocketmoney.setIndex(index+1);
				}
				
				pocketmoney.setKind(Addkind.Outlay);
				pocketmoney1.add(pocketmoney);
			}
			
			else
				System.out.println("please input between 1(income) or 2(outlay)");
		}
	}
	
	public void editPocketmoney() {
		int index = 0;
		System.out.print("Input the date you want change : ");
		String date = input.next();
		
		for (int i = 0; i < pocketmoney1.size(); i++) {
			if (pocketmoney1.get(i).equals(date)) {
				index = i;
			}
		}
		
		Pocketmoney pocketmoney = pocketmoney1.get(index);
		
		printEditMenu();
		int num = input.nextInt();
	
		if (num == 1) {
			setNewContent(pocketmoney);
		}
		
		else if (num == 2) {
			setNewPrice (pocketmoney);
			
			if(index == 0) {
				pocketmoney.balance = pocketmoney.price;
				resetBalance(pocketmoney1);
				return;
			}
			
			pocketmoney.balance = pocketmoney1.get(index-1).getBalance() + pocketmoney.price;
			resetBalance(pocketmoney1);
		}
	}
	
	public void printEditMenu() {
		System.out.println("***Edit menu***");
		System.out.println("1. Edit content");
		System.out.println("2. Edit price");
		System.out.print("Input the number :");
	}
	
	public void setNewContent(Pocketmoney pocketmoney) {
		System.out.print("Input the new content:");
		pocketmoney.setContent(input.next());
	}
	
	public void setNewPrice (Pocketmoney pocketmoney) {
		System.out.print("Input the new price:");
		pocketmoney.setPrice(input.nextInt());
	}
	
	public void resetBalance(ArrayList pocketmoney1) {
		for(int i = 1; i < pocketmoney1.size(); i++) {
			((Pocketmoney) pocketmoney1.get(i)).setBalance(((Pocketmoney) pocketmoney1.get(i-1)).getBalance() + ((Pocketmoney) pocketmoney1.get(i)).getPrice());
		}
	}
	
	public void viewList() {
		System.out.println("date\tcontent\tprice\tbalance");
		for(int i = 0; i < pocketmoney1.size(); i++)
			System.out.println(pocketmoney1.get(i).date + "\t"+pocketmoney1.get(i).content + "\t"
				                       +pocketmoney1.get(i).price +"\t"+ pocketmoney1.get(i).balance);
	}
}
