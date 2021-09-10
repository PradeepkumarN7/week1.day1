package WEEK1.DAY1.ASSIGNMENTS;

public class FIbbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 5, first = 0, second = 1;
		System.out.println("Fibbonacci series for first " + range + " terms are: ");
		for (int i = 1; i <= range; i++) {
			System.out.println(first + ", ");
			int sum = first + second;
			first = second;
			second = sum;
		}
	}

}
