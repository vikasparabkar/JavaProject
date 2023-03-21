
public class PrimeNumberOrNot {

	public static void main(String[] args) {
		
//		for(int i=5; i>=0; i--) {
//			for(int j=0; j<i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		System.out.println("Print given number is prime number or not");
		int count=0;
		int num=11;
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				count=count+1;
			}
		}
		if(count==2) {
			System.out.println(num);
			System.out.println("Prime number");
		}else {
			System.out.println("Not prime number");
		}
		
		System.out.println("********To print all prime numbers upto given number********");
		for(int i=2; i<=num; i++) {
			count=0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					count=count+1;
				}
			}
			if(count==2) {
				System.out.print(i+" ");
				}
		}
	}

}
