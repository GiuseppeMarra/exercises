package it.gm.algorithm.sorting.basic;

public class InsertionSort {
	
	
	//on place sorting (use the same vector)
	public static int[] sort (int[] unsorted){
		
		for (int j=1; j<unsorted.length; j++){ //j element to be inserted in the correct spot
			
			int i=j;
			int temp = unsorted[j]; //temp current element (j)

			while(i>0&&temp<unsorted[i-1]){
				unsorted[i]=unsorted[i-1];
				i--;
			}
			   
			unsorted[i]=temp;
		}
		
		
		return unsorted;
	}

}