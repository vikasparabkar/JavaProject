import java.util.HashMap;

public class StringPrograms {

	public static void main(String[] args) {
		
		//Reverse a string
		String a="My Space Class";
		String y="";
		
		for(int i=a.length()-1; i>=0; i--) {
			y=y+a.charAt(i);			
		}
		System.out.println(y);
		
		//Occurance of characters
		
		HashMap<Integer, String>hashmap=new HashMap<Integer, String>();
		hashmap.put(1, "Viaks");
		hashmap.put(2, "Kranti");
		hashmap.put(3, "Rahul");
		hashmap.put(4, "Amey");
		hashmap.put(5, "Viashal");
		
		System.out.println(hashmap);
	}

}
