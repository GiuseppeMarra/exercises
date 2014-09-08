package it.gm.algorithm.sorting.basic;

public class BubbleSort {

	public static int[] sort(int[] unsorted) {

		boolean swap = true;

		for (int i = 0; i < unsorted.length; i++) {
			if (!swap)
				return unsorted;
			else {
				swap = false;
				for (int j = 0; j < unsorted.length - i - 1; j++) {

					if (unsorted[j] > unsorted[j + 1]) {
						int temp = unsorted[j];
						unsorted[j] = unsorted[j + 1];
						unsorted[j + 1] = temp;
						swap = true;

					}
				}
			}

		}

		return unsorted;

	}

}
