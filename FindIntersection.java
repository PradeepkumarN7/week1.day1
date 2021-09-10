package WEEK1.DAY2.ASSIGNMENTS;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr1 = {3,4,5,6,7,8,9};
int[] arr2 = {1,2,3,4,5,8,10};
System.out.println("THE INTERSECTING ELEMENTS ARE: ");

for (int i = 0; i < arr1.length; i++) {
	for (int j = 0; j < arr2.length; j++) {
		if (arr1[i] == arr2[j]) 
			System.out.println(arr2[j] + " ");
		}
	}
}
	}


