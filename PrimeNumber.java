package week1.day1.assignment;

public class PrimeNumber {
	public static void main(String[] arg) {
		
		int number=13;
		boolean flag = false;
		for (int i=2; i<=number/2; ++i) {
			//to check non prime
			if(number% i==0) {
				flag= true;
				break;
			}
		}
		if (!flag)
			
			System.out.println(number + "is a prime number.");
		else
			System.out.println(number+"is not a prime number");
		
	}

}
