import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PocketmoneyManager pocketmoneymanager = new PocketmoneyManager(input);
		int num = 0;		
		
		while(num != 4) {
			System.out.println("*******PocketMoney Management System Menu*******");
			System.out.println("1. Add PocketMoney");
			System.out.println("2. Edit PocketMoney");
			System.out.println("3. View PocketMoney List");
			System.out.println("4. Exit ");
			System.out.print("Select number 1~4 :");
			num = input.nextInt();
		
			if (num == 1) {
					pocketmoneymanager.addPocketmoney();
			}
			else if (num == 2) {
					pocketmoneymanager.editPocketmoney();
			}
			else if (num == 3) {
				pocketmoneymanager.viewList();
			}		
			else
				break;
		}	
	}
	
}
