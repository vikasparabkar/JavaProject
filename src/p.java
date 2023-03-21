
public class p {

	public static void main(String[] args) {
		
		//print vowels in a string:
		
		String x="my name is vikas";
		String y="";
		int count=0;
		for(int i=0; i<x.length(); i++) {
			Character ch=x.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				//y=y+x.charAt(i);
				count++;
			}else {
				y=y+x.charAt(i);
			}
		}
		System.out.println(y);
		System.out.println(count);
	}

}
