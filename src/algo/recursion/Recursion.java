package algo.recursion;

public class Recursion {
	public static void main(String[] args) {
		// ReduceByOne(5);

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		//int pos = RecursiveLinearSearch(a, 0, 9);
		int pos = RecursiveBinarySearch(a, 0, a.length-1, 9);

		System.out.println(pos);
		
	}

	public static void ReduceByOne(int n) {
		if (n >= 0) { // this condition is known as BaseCase
			ReduceByOne(n - 1);
		}
		System.out.println("Completed call : " + n);
	}

	public static int RecursiveLinearSearch(int[] a, int i, int x) {
		if (i > a.length - 1)
			return -1;
		else if (a[i] == x)
			return i;
		else {
			System.out.println("index at : " + i);
			return RecursiveLinearSearch(a, i+1, x);
		}
	}
	
	public static int RecursiveBinarySearch(int[] a, int p, int r, int x) {
		System.out.println("[ "+ p + " ... " + r + " ]");
		if(p > r)
			return -1;
		else {
			int q = (p + r)/2;
			if(a[q] == x)
				return q;
			else if(a[q] > x )
				return RecursiveBinarySearch(a, p, q-1, x);
			else
				return RecursiveBinarySearch(a, q+1, r, x);
		}
	}
}
