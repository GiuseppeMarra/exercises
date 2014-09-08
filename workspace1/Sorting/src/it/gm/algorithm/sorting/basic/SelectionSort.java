package it.gm.algorithm.sorting.basic;

public class SelectionSort {
	
	
	public static int[] sort (int[] unsorted){
		
		for(int i=0;i<unsorted.length-1;i++){
			
			int min=i;
			for(int j=i+1;j<unsorted.length;j++){
				if(unsorted[min]>unsorted[j])
					min=j;
				
			}
			int temp = unsorted[i];
			unsorted[i]=unsorted[min];
			unsorted[min]=temp;
			
		}
		
		
		return unsorted;
		
	}

}
