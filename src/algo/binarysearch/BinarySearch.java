package algo.binarysearch;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int pos = binarysearch(a, 9);

		System.out.println(pos);

	}

	public static int binarysearch(int[] a, int x) {
		int p = 0;
		int r = a.length - 1;

		while (p <= r) {
			int q = (p + r) / 2;
			if (a[q] == x)
				return q;
			else if (a[q] > x)
				r = q - 1;
			else
				p = q + 1;
		}

		return -1;
	}
}
