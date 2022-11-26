import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentNamesMenuApp {
	static Scanner sc = new Scanner(System.in);
	static List<String> students = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		int choice = 0;
		
		while(choice!=4) {
			showMenu();
			choice=getUserChoice();
			if (choice==1)
				printStudentNames();
			else if (choice==2)
				addNewStudent();
			else if (choice==3)
				deleteStudent();
			else if(choice==4)
				System.out.println("Goodbye!");
			else 
				System.out.println("Please Select a valid option");
			
			
		}
			
		
				

	}
	public static int getUserChoice() {
		// TODO Auto-generated method stub
		return sc.nextInt();
	}
	public static void deleteStudent() {
		System.out.print("Enter the index of the student you would like to delete: ");
		int index=getUserChoice();
		if(index<students.size())
			students.remove(index);
		
		
		
	}
	public static void addNewStudent() {
		// TODO Auto-generated method stub
		System.out.print("Enter name you would like to add: ");
		String name =sc.next();
		students.add(name);
		System.out.println("Student added: "+name);
		
	}
	public static void printStudentNames() {
		for(String student: students)
			System.out.println(student);
		
	}
	public static void showMenu() {
		System.out.println("1) Print Student Names");
		System.out.println("2) Add New Student");
		System.out.println("3) Delete Student at Position");
		System.out.println("4) Exit");
		System.out.println("-----------------------------");
	}

}
