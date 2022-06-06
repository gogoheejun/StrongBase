package udemyInterview.algo;

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println(reverseString("abcd"));
	}
	
	public static String reverseString(String str) {
		StringBuilder rStr = new StringBuilder();
		addToArray(str, rStr);
		return rStr.toString();
	}
	
	public static void addToArray(String str, StringBuilder rStr) {
		int len = str.length();
		if(len>0) {
			rStr.append(str.substring(len-1));
			addToArray(str.substring(0,len-1), rStr);
		}
	}
}
