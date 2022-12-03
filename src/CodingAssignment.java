//Coding Assignment for Weeks 3 & 4
import java.util.Arrays;

public class CodingAssignment {

	public static void main(String[] args) {
		//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		//Initialize new array using given parameters.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		//a. Programmatically subtract the value of the first element in the array from the value in the last
		//element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		//Subtract [0] (which is the first element) from [length - 1](which is the last element of the array).
		int subtractAge = ages[ages.length-1]-ages[0];
		System.out.println(ages[ages.length-1]+" - "+ages[0]+" = "+subtractAge);
		//b.******Add a new age to your array and repeat the step above to ensure it is dynamic (works for 
		//arrays of different lengths). 
		int n = ages.length;
		int[] newAges = new int[n+1];
		System.arraycopy(ages, 0, newAges, 0, n);
		newAges[n]=100;
		subtractAge = newAges[newAges.length-1]-newAges[0];
		System.out.println(newAges[newAges.length-1]+" - "+newAges[0]+" = "+subtractAge);
		
		//c.Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		//Initialize value to hold total.
		int total =0;
		//Iterate through the array to calculate their total. 
		for(int age :ages) 
			total+=age;
		//Print value / the length to calculate the average.
		System.out.println("The average age is: "+total/ages.length);

		//2.Create an array of String called names that contains the following values: 
		//“Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		//Initialize new array using given parameters
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		//a. Use a loop to iterate through the array and calculate the average number of letters per name. 
		//Print the result to the console.
		//Reset previous used total to 0.
		total =0;
		//Iterate through the array and add the length each element to the total variable .
		for(String name :names) 
			total+=name.length();		
		//Print value / the length to calculate the average.
		System.out.println("The average name length is: "+total/names.length);
		//b. Use a loop to iterate through the array again and concatenate all the names together, separated 
		//by spaces, and print the result to the console.
		//Initialize the string to contain our new string.
		String concatenateNames="";
		//Iterate through our array to get each value.
		//If we are on element 1 we just add the string the value, as we don't want a " " at beginning.
		for(int i=0; i<names.length-1;i++) 
			if(i == 0)
				concatenateNames=names[i];
			else
				concatenateNames=concatenateNames+" "+names[i];
		System.out.println(concatenateNames);

		//3. How do you access the last element of any array?
		System.out.println(ages[ages.length-1]+" is the last elemement");

		//4. How do you access the first element of any array?
		System.out.println(ages[0]+" is the first elemement");

		//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created 
		//names array and add the length of each name to the nameLengths array.
		//New array to hold the lengths.
		int[] nameLengths = new int [names.length];
		//Iterate through the names array to get each strings length and assign  that value to the element in namesLength array.
		for(int i =0;i<=names.length-1;i++) 
			nameLengths[i]=names[i].length();
		System.out.println("The lenghts of the names are "+Arrays.toString(nameLengths));


		//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array.
		//Print the result to the console.
		//Initialize value to hold our sum.
		int nameLenghtsSum =0;
		//Iterate through the array and add each elements int to our nameLenghtsSum.
		for(int nameLength:nameLengths)
			nameLenghtsSum+=nameLength;
		System.out.println("The sum of the lenghts of the names are "+nameLenghtsSum);

		//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated 
		//to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		System.out.println(repeatWord("Hello",3));

		//8. Write a method that takes two Strings, firstName and lastName, and returns a full name 
		//(the full name should be the first and the last name as a String separated by a space).
		System.out.println(fullName("Devon","Geertsen"));

		//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is 
		//greater than 100.
		//Test Case for True. Using ages array which sum >100.
		System.out.println(isArrayGreaterThan100(ages));
		//Test Case for False. Sum < 100
		int[] fours = {4,8,12,16,20,24};
		System.out.println(isArrayGreaterThan100(fours));

		//10. Write a method that takes an array of double and returns the average of all the elements in the array.
		//create array of doubles
		double[] myDoubles = {4,8,12,16,20,24};
		System.out.println("Average of double is: "+averageOfDoubleArray (myDoubles));
		
		//11. Write a method that takes two arrays of double and returns true if the average of the elements in the 
		//first array is greater than the average of the elements in the second array.
		//False test. MY doubles = my doubles, so it can't be greater.
		System.out.println("Double Compare: "+doubleCompare (myDoubles,myDoubles));
		
		//True test.
		double[] years = {3};
		System.out.println("Double Compare: "+doubleCompare (myDoubles,years));
		
		
		//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
		//and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		//Test cases for false.
		System.out.println("Will I buy a drink (true, false) "+willBuyDrink (true,10.50));
		System.out.println("Will I buy a drink (false, true) "+willBuyDrink (false,10.51));
		System.out.println("Will I buy a drink (false, false) "+willBuyDrink (false,10.50));
		//Test case for true.
		System.out.println("Will I buy a drink (true, true) "+willBuyDrink (true,10.51));
		
		//13. Create a method of your own that solves a problem. In comments, write what the method does and 
		//why you created it.
		//50% for Must Haves
		//30% Wants
		//20% debt repayments
		System.out.println(myBudget(3570));
		
	}

	



	//Method takes an int and string. It then concatenates the string x number of times, where x = the int passed.
	static String repeatWord(String userWord, int numTimes) {
		//empty string, to hold my value
		String myString="";
		//for loop to, concatenate userWord, numTimes.
		for(int i = 0; i < numTimes; i++)
			myString += userWord;
		return "Repeat word N Times: "+ myString;
	}
	
	//Method that concatenates first and last name to return full name.
	static String fullName(String firstName, String string) {
		return "Full Name: "+firstName + " "+string;


	}
	
	//Passes an array of type int, calculates sum and compares to 100
	static boolean isArrayGreaterThan100 (int[] integers) {
		int sum=0;
		//Iterates through array, adding each element to sum
		for(int integer: integers) {
			sum+=integer;
		}
		//Compares sum to 100
		if (sum >100)
			return true;
		else
			return false;

	}

	//Passes array of type double and returns average.
	static double averageOfDoubleArray (double[] numbers) {
		double total=0;
		//Add each element of the array to total & return the average.
		for(double number:numbers)
			total+=number;
		return total/numbers.length;
	}
	
	//Compares two arrays of type double. REturns true based on average values. Uses averageOfDoubleArray method
	static boolean doubleCompare (double[] arrayOne, double[] arrayTwo) {
		return (averageOfDoubleArray(arrayOne)>averageOfDoubleArray(arrayTwo));
	}
	
	//Returns a boolean based on boolean and Double
	static boolean willBuyDrink (boolean isHotOutside,double moneyInPocket) {
		return (isHotOutside == true && moneyInPocket>10.50);
	}
	public static String myBudget(int salary) {
		// TODO Auto-generated method stub
		return "Must haves: "+salary*.50
				+"\nWants: "+salary*.30
				+"\nDebt: "+salary*.20;
		
	}
	
}

