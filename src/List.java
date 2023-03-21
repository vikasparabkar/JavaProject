import java.util.ArrayList;
import java.util.Collections;
public class List {

	public static void main(String[] args) {
		
		ArrayList<String>list=new ArrayList<String>();
		list.add("Vikas");
		list.add("Rahul");
		list.add("Vishal");
		list.add("Amey");
		list.add("Kranti");
		list.add("rohini");
		
		System.out.println(list);
		
		Collections.sort(list);
		//System.out.println(list);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
