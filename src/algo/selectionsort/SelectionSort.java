package algo.selectionsort;

public class SelectionSort {

	public static void main(String[] args) {
		int [] array = SelectionSort(new int[] {9,8,3,13,87,12,93});
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static int [] SelectionSort(int a[]) {
		for(int i=0; i<a.length; i++) {
			int min = i;
			for(int j=i+1; j<a.length; j++) {
				if ( a[j] < a[min] ) {
					min = j;
				}
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp; 
		}
		return a;
	}
}
