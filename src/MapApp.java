import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapApp {
	
	static Scanner sc = new Scanner(System.in);
	static Map<String, String> phoneBook=new HashMap<String, String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice =0;
		
		while(choice!=4) {
			printMenu();
			
			choice =getUserChoice();
			
			if (choice==1)
				displayPhoneBook();
			else if (choice==2)
				addContact();
			else if (choice==3)
				deleteContact();
			else if (choice==4)
				System.out.println("Goodbye!");
			else
				System.out.println("Please pick a valid option!");
			
		}
	}
	public static void printMenu() {
		System.out.println("1) Display Phonebook");
		System.out.println("2) Add New Contact");
		System.out.println("3) Delete Contact");
		System.out.println("4) Exit");
		System.out.println("----------------------");
		
	}
	public static int getUserChoice() {
		return sc.nextInt();
	}
	public static void deleteContact() {
		System.out.print("Enter Phone Number to Delete: ");
		String phoneNumber=sc.next();
		System.out.println("Removed: "+phoneNumber+": "+phoneBook.remove(phoneNumber));
		
		
	}
	public static void addContact() {
		System.out.print("Enter Phone Number: ");
		String phoneNumber=sc.next();
		System.out.print("Enter Name: ");
		String name=sc.next();
		phoneBook.put(phoneNumber, name);
		System.out.println("Added "+phoneNumber+": "+name);
	}
	public static void displayPhoneBook() {
		Set<String> phoneNumbers = phoneBook.keySet();
		for(String phoneNumber: phoneNumbers)
			System.out.println(phoneNumber +": "+phoneBook.get(phoneNumber));
		
	}

}
