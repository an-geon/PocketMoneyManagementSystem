import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		int num = 0;
		int Pmoney = 0;
		int balance = 0;
		Scanner input = new Scanner(System.in);
		
		while(num != 5) {
			System.out.println("*******PocketMoney Management System Menu*******");
			System.out.println("1. Income PocketMoney");
			System.out.println("2. Outlay PocketMoney");
			System.out.println("3. View PocketMoney List");
			System.out.println("4. Show a Menu ");
			System.out.println("5. Exit ");
			System.out.print("Select number 1~5 :");
			num = input.nextInt();
		
			if (num == 1) {
				System.out.print("Content :");
				String content = input.next();
				System.out.print("Price :");
				Pmoney = input.nextInt();
				balance = balance + Pmoney;
				System.out.println("balance : " + balance);
			}
			else if (num == 2) {
				System.out.print("Item :");
				String Item = input.next();
				System.out.print("Price :");
				Pmoney = input.nextInt();
				balance = balance - Pmoney;
				System.out.println("balance : " + balance);
			}
			else if (num == 3) {
				System.out.println("Content        Price         Balance");
				//cumulative income, outlay, content, balance    print
			}	
			else if (num == 4) 
				continue;		
			else
				break;
		}	
	}
}
