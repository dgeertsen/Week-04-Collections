import java.util.ArrayList;
import java.util.List;

public class Lab {

	public static void main(String[] args) {
		//why would we use a StringBuilder instead of a String?
		//Used when an object is changed many times
		
		//instantiate a new StringBuilder and append the characters 0 through 9 to it separated by dashes
		//make sure no dash appears at the end of the StringBuilder
		StringBuilder sb =new StringBuilder();
		for(int i=0;i<10;i++)
			if(i!=9)
				sb.append(i+"-");
			else
				sb.append(i);
		System.out.println(sb.toString());
		
		//create a list of Strings and add 5 Strings to it, each with a different length
		List<String> strings=new ArrayList<String>();
		strings.add("Kim");
		strings.add("Devon");
		strings.add("Mikaela");
		strings.add("Michaela");
		strings.add("Tierra");
	
		//write and test a method that takes a list of strings and returns the shortest string
		System.out.println(shortestString(strings));
				
		//write and test a method that takes a list of strings and returns the list with the first and last element switched
		System.out.println(switched(strings));
				
		//write and test a method that takes a list of strings and returns a string with all the list elements concatenated to each other,
		//separated by a comma
		System.out.println(joinedList(strings));
				
				
		//write and test a method that takes a list of strings and a string and returns a new list with all strings from the original list
		//containing the second string parameter (i.e. like a search method)
		
				
		//write and test a method that takes a list of integers and returns a List<List<Integer>> where the first list in the returned value
		//contains any number from the input list that is divisible by 2, the second list contains values from the input list that are divisible
		//by 3, the third divisible by 5, and the fourth all numbers from the input list not divisible by 2, 3, or 5
	
				
		//write and test a method that takes a list of strings and returns a list of integers that contains the length of each string
		
				
		//create a set of strings and add 5 values
				
		//write and test a method that takes a set of strings and a character and returns a set of strings consisting of all the strings in the
		//input set that start with the character parameter.
			
				
		//write and test a method that takes a set of strings and returns a list of the same strings
	
				
				
		//write and test a method that takes a set of integers and returns a new set of integers containing only even numbers from the original set
		
				
		//create a map of string and string and add 3 items to it where the key of each is a word and the value is the definition of the word
	
		
		//write and test a method that takes a Map<String, String> and a string and returns the value for a key in the map that matches the 
		//string parameter (i.e. like a language dictionary lookup)
			
				
		//write and test a method that takes a List<String> and returns a Map<Character, Integer> containing a count of all the strings that start
		//with a given character

	}

	private static String joinedList(List<String> strings) {
		// TODO Auto-generated method stub
		StringBuilder output = new StringBuilder();
		for(int i=0; i<strings.size();i++) {
			if(i!=strings.size()-1)
					output.append(strings.get(i)+", ");
			else
				output.append(strings.get(i)+", ");
		}
		return output.toString();
	}

	private static String switched(List<String> strings) {
		String temp=strings.get(0);
		strings.set(0,strings.get(strings.size()-1));
		strings.set(strings.size()-1,temp);
		
		
		
		
		return strings.toString();
	}

	public static String shortestString(List<String> list) {
		String shortest = list.get(0);
		for(String string:list) {
			if(string.length()<shortest.length())
				shortest=string;
		}
			
		return shortest;
		
		
	}

}
;
