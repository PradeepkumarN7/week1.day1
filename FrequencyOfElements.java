package WEEK1.DAY2.ASSIGNMENTS;

public class FrequencyOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {2,3,4,5,6,7,8,9,1,4,2};
		for(int i = 0; i<arr.length;i++) {
			int count = 0;
			for(int j = 0;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			System.out.println("THE FREQUENCY COUNT OF "+arr[i]+" is "+ count);
		}
	}
}
