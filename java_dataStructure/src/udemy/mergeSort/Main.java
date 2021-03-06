package udemy.mergeSort;


public class Main {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        mergeSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    // { 20, 35, -15, 7, 55, 1, -22 }
    public static void mergeSort(int[] input, int start, int end) {

        if (end - start < 2) {//한개면 리턴
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    // { 20, 35, -15, 7, 55, 1, -22 }
    public static void merge(int[] input, int start, int mid, int end) {

        if (input[mid - 1] <= input[mid]) {//왼쪽이랑 오른쪽은 이미 각각 정렬되어있으므로.
            return;
        }

        int i = start;//왼쪽 파트 시작점
        int j = mid;//오른쪽 파트 시작점
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        //왼쪽파트가 남은 경우임...오른쪽은 고려안함. 오른쪽이 남았단 건 이미 정렬되어있단 거니..
        System.arraycopy(input, i, input, start + tempIndex, mid - i);//input앞에 있는애들은 뒤로 빼주고..안남아있으면 어차피 mid-i란 길이때매 작동안함
        System.arraycopy(temp, 0, input, start, tempIndex);//temp에 복사한 애들은 앞에 넣어주고


    }

}









