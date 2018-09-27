package algo.insertionsort;

public class InsertionSort {
	
	public static void main(String[] args) {
		int [] array = InsertionSort(new int[] {9,8,3,13,87,12,93});
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
}
	
	public static int [] InsertionSort(int a[]) {
		for(int i = 1; i < a.length-1; i++) {
			int element = a[i];
			int j = i-1;
			while( j >= 0 && a[j] > element ) {
				a[ j+1] = a[j];
				j--;
			}
			a[j+1] = element;
		}
		return a;
	}
}
