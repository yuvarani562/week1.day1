package week1.day1.assignment;

public class Fibonacciseries {
	public static void Main(String[] args) {
		
		int range=8;
		int firstNum=0;
				int secNum=1;
				System.out.println("fibonaci series: "+range);
				for (int i=2; i<range; ++i) {
					System.out.println(firstNum +",");
					int nextNum=firstNum+secNum;
					firstNum=secNum
					secNum=nextNum;
					
				}
				
	}

}
