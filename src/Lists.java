import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayLists are Dynamic
		List<String> sports = new ArrayList<String>();
		sports.add("Wrestling");
		sports.add("Soccer");
		sports.add("Football");
		sports.remove(0);
		
		for (int i=0;i<sports.size();i++)
			System.out.println(sports.get(i));
		
		for(String sport : sports)
			System.out.println(sport);
		sports.remove(0);

		

	}
	
}
