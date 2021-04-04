import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PocketmoneyManager pocketmoneymanager = new PocketmoneyManager(input);
		int num = 0;		
		
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
					pocketmoneymanager.incomePocketmoney();
			}
			else if (num == 2) {
					pocketmoneymanager.outlayPocketmoney();
			}
			else if (num == 3) {
				pocketmoneymanager.viewList();
			}	
			else if (num == 4) 
				continue;		
			else
				break;
		}	
	}
	
}
