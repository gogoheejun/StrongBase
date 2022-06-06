package udemy.mergeSort;

public class prac2 {
	public static void main(String[] args) {
		 int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		
		mergeSort(intArray,0,intArray.length );
		for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
	}
	
	public static void mergeSort(int[] input, int start, int end) {
		
		int mid = (start+end)/2;
		mergeSort(input, start, mid);
		mergeSort(input, mid,end);
		merge(input,start,mid, end);
	}
	
	public static void merge(int[] input, int start,int mid, int end) {
		
		int i = start;
		int j = mid;
		int[] temp = new int[end-start];
		int tempIndex = 0;
		
		while(i<mid && j<end) {
			temp[tempIndex++] = input[i]<=input[j]?input[i++]:input[j++];
		}
		
		System.arraycopy(input, i, input, start+tempIndex, mid-i);
		System.arraycopy(temp, tempIndex, input, start, tempIndex);
	}
	
}













