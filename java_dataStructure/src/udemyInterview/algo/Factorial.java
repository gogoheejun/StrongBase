package udemyInterview.algo;

public class Factorial {
	
	public static void main(String[] args) {
		
//		int ans = recursive(5, 1);
		int ans = recursive2(5); //이게 모범답안임.
//		int ans = iter(5);
		System.out.println(ans);
	}
	
	public static int recursive(int number,int result) {
		if(number == 1) {
			return result;
		}
		result = result*(number--);
		return recursive(number,result);
	}
	
	public static int recursive2(int number) {
		if(number <= 2) {
			return number;
		}
		
		return number*recursive2(number-1);

	}
	
	public static int iter(int number) {
		int result = 1;
		for(int i=number; i>0; i--) {
			result = result*(number--);
		}
		return result;
	}
}












