import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PocketmoneyManager pocketmoneymanager = new PocketmoneyManager(input);
		
		selectMenu(pocketmoneymanager, input);
	}
	
	public static void selectMenu(PocketmoneyManager pocketmoneymanager, Scanner input) {
		int num = 0;		
		
		while(num != 4) {
			try {
				printMenu();
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
			catch(InputMismatchException e) {
				System.out.println("Input the integer between 1 ~ 4");
				if(input.hasNext())
					input.next();
				num = 0;
			}
		}	
	}
	
	public static void printMenu() {
		System.out.println("*******PocketMoney Management System Menu*******");
		System.out.println("1. Add PocketMoney");
		System.out.println("2. Edit PocketMoney");
		System.out.println("3. View PocketMoney List");
		System.out.println("4. Exit ");
		System.out.print("Select number 1~4 :");
	}
}
