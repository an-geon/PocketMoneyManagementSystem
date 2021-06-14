package manager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PocketmoneyManager pocketmoneymanager = getObject("pocketmoneymanager.ser");
		if(pocketmoneymanager == null) {
			pocketmoneymanager = new PocketmoneyManager(input);
		}
		
		WindowFrame frame = new WindowFrame(pocketmoneymanager);
		selectMenu(pocketmoneymanager, input);
		putObject(pocketmoneymanager, "pocketmoneymanager.ser");
	}
	
	public static void selectMenu(PocketmoneyManager pocketmoneymanager, Scanner input) {
		int num = 0;		
		
		while(num != 4) {
			try {
				printMenu();
				num = input.nextInt();
				if (num == 1) {
					pocketmoneymanager.addPocketmoney();
					logger.log("add pocketmoney");
				}
				else if (num == 2) {
					pocketmoneymanager.editPocketmoney();
					logger.log("edit pocketmoney");
				}
				else if (num == 3) {
					pocketmoneymanager.viewList();
					logger.log("view pocketmoney list");
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
	
	public static PocketmoneyManager getObject(String filename) {
		PocketmoneyManager pocketmoneymanager = null;
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			pocketmoneymanager = (PocketmoneyManager) in.readObject();
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) { 
			return pocketmoneymanager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return pocketmoneymanager;
	}
	
	public static void putObject(PocketmoneyManager pocketmoneymanager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(pocketmoneymanager);
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) { 
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
}
