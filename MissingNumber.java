package WEEK1.DAY2.ASSIGNMENTS;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 7, 8, 9 };
		int n = arr.length + 1;
		int sum = n * (n + 1) / 2;
		for (int i = 0; i < arr.length; i++) {
			sum = sum - arr[i];
		}
		System.out.println("Missing Number is " + sum);
	}

}
