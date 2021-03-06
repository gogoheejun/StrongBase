package udemyInterview.algo;

public class Fibo {
	public static void main(String[] args) {
		
		System.out.println(iter(6));
		System.out.println(recur(6));
	}
	
	public static int iter(int n) {
		int[] arr = new int[n+1];
		arr[0] = 0;
		arr[1] = 1;
		for(int i=2; i<=n; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		return arr[n];
	}
	
	public static int recur(int n) {
		if(n<2) {
			return n;
		}
		return recur(n-1)+recur(n-2);
	}
}
