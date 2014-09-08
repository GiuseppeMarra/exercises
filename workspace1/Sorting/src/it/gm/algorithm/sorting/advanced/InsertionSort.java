package it.gm.algorithm.sorting.advanced;

public class InsertionSort {

	/**
	 * Simple insertion sort.
	 * 
	 * @param a
	 *            an array of Comparable items.
	 */
	public static <AnyType extends Comparable<? super AnyType>> AnyType[] sort(AnyType[] a)

	{
		int i;
		for (int j = 1; j < a.length; j++) {
			AnyType tmp = a[j];
			for (i = j; i > 0 && tmp.compareTo(a[i - 1]) < 0; i--)
				a[i] = a[i - 1];
			a[i] = tmp;
		}
		
		return a;
	}

}
