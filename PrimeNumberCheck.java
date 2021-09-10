package WEEK1.DAY1.ASSIGNMENTS;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num= 9;
		boolean isPrime = false;
		for (int count = 2;count <num/2;count++) {
			if (num % count == 0) {
				isPrime = true;
				break;
			}
		}
		if(!isPrime) {
			System.out.println(num + "is a Prime Number");
		}else {
			System.out.println(num + " is Not a Prime Number ");
		}

	}

}
