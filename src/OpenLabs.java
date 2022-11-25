import java.util.ArrayList;
import java.util.List;

public class OpenLabs {

	public static void main(String[] args) {
		//Question 1
		//Create a List of Factors: Create a loop that finds all the (positive) factors of the 
		//value of userNumber and stores them as elements of a new list. Note: All values of userNumber 
		//will have two (2) possible factors at a minimum: one (1) and userNumber. Then print the list to the console
		int userNumber=50;
		List<Integer> factors = new ArrayList<Integer>();
		for(int i = 1;i<=userNumber;i++)
		    if (userNumber%i==0)
		        factors.add(i);
		System.out.println(factors.toString());
		
		//Question 2
		//Every other: Given a List of five (5) words entered by the user, create a new List called 
		//newList that contains every other List item from the original list starting with the first item.
		//Print (to the console) the old List using "The old list is: ", and the new List using "The new list is: "
		List<String> hisList = new ArrayList<String>();
		hisList.add("RPG");
		hisList.add("Java");
		hisList.add("JS");
		hisList.add("React");
		hisList.add("CSS");
		
		List<String> newList = new ArrayList<String>();
		for(int i = 0;i<hisList.size();i++)
			if(i%2==0)
				newList.add(hisList.get(i));
		System.out.println("The new list is: "+newList.toString());
		
		//Question 4
		//Create a new List of String: Given a List called tenWords that contains ten (10) different words, 
		//write a program that takes integer values stored in num1, num2, and num3 and use that information to
		//find the value stored in the particular positions in the List. Take these three (3) words and 
		//create a new List called threeWords. Print out the List stored in threeWords to the console.
		
		
		//Question 5 
		//Create a List of integers from one (1) to the value stored in endNum. 
		//After the List has been created, then print it to the console.
		List<Integer> myInts=new ArrayList<Integer>();
		for(int i=1;i<=10;i++)
			myInts.add(i);
		System.out.println(myInts);
		System.out.println(myInts.get(0));
	}

}
