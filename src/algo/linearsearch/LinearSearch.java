package algo.linearsearch;

public class LinearSearch {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int pos = linearsearch(a, 4);

		System.out.println(pos);
	}

	public static int linearsearch(int[] a, int x) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x)
				return i;
		}
		return -1;
	}
}
