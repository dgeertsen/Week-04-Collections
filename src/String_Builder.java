
public class String_Builder {



	public static void main(String[] args) {
		//StringBuilder append method. Example 1
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" World");
        System.out.println(sb.toString());
        
        //StringBuilder append method. Example 2
        System.out.println(multiplyString("HelloWorld",3));
        
        //StringBuilder charAt method. Example 1
        System.out.println(sb.charAt(6));
        
        //StringBuilder deleteCharAt method. Example 1
        System.out.println(sb.deleteCharAt(6));
        
        //StringBuilder delete method. Example 1
        //Note 1st one is inclusive and 2nd is exclusive
        System.out.println(sb.delete(1,3)); 
        
        //StringBuilder indexOf method. Example 1
        sb = new StringBuilder("Hello World");
        System.out.println(sb.indexOf("ll"));
        
        //Replace Method
        System.out.println(sb.replace(0, 5, "Goodbye"));
        
        //Replace Method
        System.out.println(sb.reverse());
        
        //Replace Method
        System.out.println(sb);
        
	}
	//StringBuilder append method. Example 2
	public static String multiplyString(String str, int num) {
		StringBuilder result = new StringBuilder();
		for (int i =0; i<num; i++)
			result.append(str);
		return result.toString();
	}
	
}
