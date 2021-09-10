package WEEK1.DAY2.ASSIGNMENTS;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123;
		int temp = 0, rem = 0;
		int result = 0;
		temp = num;
		while(temp>0) {
			rem = temp%10;
			result = result+(rem*rem*rem);
			temp = temp/10;
			
		}
        if(num== result) {
        	System.out.println(num+ " Is an armstrong number");
        }else {
        	System.out.println(num+ " Is not an armstrong number");
        }
	}

}
