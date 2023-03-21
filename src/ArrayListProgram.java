import java.util.ArrayList;

public class ArrayListProgram {

	public static void main(String[] args) {
		
		ArrayList<Object>list=new ArrayList<Object>();
		list.add("Vikas");
		list.remove(0);
		list.add("Vikas");
		list.add(143);
		
		System.out.println(list);
	}

}
