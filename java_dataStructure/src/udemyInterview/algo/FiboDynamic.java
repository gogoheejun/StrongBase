package udemyInterview.algo;

public class FiboDynamic {
	
	static long[] memo;
	public static void main(String[] args) {
		memo = new long[100];
		long ans = fibo(30);
		System.out.println(ans);
	}
	
	public static long fibo(int n) {
		if(n<2) {
			return n;
		}
		
		if(memo[n] != 0) {
			return memo[n];
		}else {
			return memo[n] = fibo(n-1)+fibo(n-2);
		}
	}
}
