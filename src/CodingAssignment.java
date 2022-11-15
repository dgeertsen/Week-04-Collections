//Coding Assignment for Weeks 3 & 4
import java.util.Arrays;

public class CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
			int[] ages = new int [] {3, 9, 23, 64, 2, 8, 28, 93};
			
//		a.	Programmatically subtract the value of the first element in the array from the value in the last
//			element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
			int subtractAge = ages[ages.length-1]-ages[0];
			System.out.println("93 - 3 = "+subtractAge);
			
//		b.	******Add a new age to your array and repeat the step above to ensure it is dynamic (works for 
//			arrays of different lengths). 
			
			
//		c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
			int total =0;
			for(int age :ages) 
				total+=age;
			System.out.println("The average age is: "+total/ages.length);
			
//		2.	Create an array of String called names that contains the following values: 
//			“Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
			String[] names = new String [] {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
			
//		a.	Use a loop to iterate through the array and calculate the average number of letters per name. 
//			Print the result to the console.
			total =0;
			for(String name :names) 
				total+=name.length();		
			System.out.println("The average name length is: "+total/names.length);
			
//		b.	Use a loop to iterate through the array again and concatenate all the names together, separated 
//			by spaces, and print the result to the console.
			String concatenateNames="";
			for(int i=0; i<names.length-1;i++) 
				if(i == 0)
					concatenateNames=names[i];
				else
					concatenateNames=concatenateNames+" "+names[i];
			System.out.println(concatenateNames);
			
//		3.	How do you access the last element of any array?
			System.out.println(ages[ages.length-1]+" is the last elemement");
			
//		4.	How do you access the first element of any array?
			System.out.println(ages[0]+" is the first elemement");
			
//		5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created 
//			names array and add the length of each name to the nameLengths array.
			int[] nameLengths = new int [names.length];
			for(int i =0;i<=names.length-1;i++) 
				nameLengths[i]=names[i].length();
			System.out.println("The lenghts of the names are "+Arrays.toString(nameLengths));
			
			
//		6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array.
//			Print the result to the console.
			int nameLenghtsSum =0;
			for(int nameLength:nameLengths)
				nameLenghtsSum+=nameLength;
			System.out.println("The sum of the lenghts of the names are "+nameLenghtsSum);
			
//		7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated 
//			to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
			System.out.println(repeatWord("Hello",3));
			
//		8.	Write a method that takes two Strings, firstName and lastName, and returns a full name 
//			(the full name should be the first and the last name as a String separated by a space).
			System.out.println(fullName("Devon","Geertsn"));
			
//		9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is 
//			greater than 100.
//		10.	Write a method that takes an array of double and returns the average of all the elements in the array.
//		11.	Write a method that takes two arrays of double and returns true if the average of the elements in the 
//			first array is greater than the average of the elements in the second array.
//		12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
//			and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
//		13.	Create a method of your own that solves a problem. In comments, write what the method does and 
//			why you created it.

	}
	
	static String repeatWord(String userWord, int numTimes) {
		// Write your code in here 
	    String myString="";
	    
	    for(int i = 0; i < numTimes; i++){
	         myString += userWord;
	    }
       

         return myString;
	

	}
	
	static String fullName(String firstName, String string) {
		 return firstName + " "+string;
	

}
}


