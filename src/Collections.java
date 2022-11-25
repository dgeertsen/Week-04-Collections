import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List
			//Allows duplicates
			//Ordered by index
			//Allows null values
			//Common implementations: ArrayList, LinkedList & Vector
		
		//Set
			//Doesn't allow duplicates
			//Unordered
			//Allows null value
			//Common implementations: HashSet, LinkedHashSet & TreeSet
		Set<String> states= new HashSet<String>();
		
		states.add("AL");
		states.add("AS");
		states.add("AZ");
		states.add("AK");
		states.add("CA");
		
		for(String state: states)
			System.out.println(state);
		
		//Map
			//Key value pairs (dictionary)
			//Values can can be duplicates but not keys
			//Common implementations: HashMap, LinkedHashMap, TreeMap & Hashtable
		Map<Integer, String> racerPlacements = new HashMap<Integer, String>();
		racerPlacements.put(1, "Tommy");
		racerPlacements.put(2, "Kimmy");
		racerPlacements.put(3, "John");
		
		System.out.println(racerPlacements.get(1));
		System.out.println(racerPlacements.get(1));
		
		Set<Integer> racerKeys=racerPlacements.keySet();
		for(Integer key: racerKeys)
			System.out.println(key +" : "+racerPlacements.get(key));
		
		Collection<String> racers = racerPlacements.values();
		for(String racer: racers)
			System.out.println(racer);
		
		
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Augment", "make something greater");
		dictionary.put("Diminish", "make less");
		dictionary.put("Ostentatious", "designed to attract");
		
		
		
		
	}

}
