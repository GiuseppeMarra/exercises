package it.gm.algorithm.sorting.basic;

public class MergeSort {
	
	
	public static int[] sort(int[] unsorted){
		
		mergeSort(unsorted, 0, unsorted.length-1);
			
		return unsorted;
	}
	
	
	private static void mergeSort(int[] array, int from, int to){
		
		int len=to-from+1;
		if(len!=1){
				int mid = len/2;
				
								
				mergeSort(array, from,from+mid-1);				
				mergeSort(array,from+mid, to);
				merge(array, from, from+mid-1, to);
				}
		
	}
	
	
	private static void merge(int[] array, int first, int mid, int last){
		
		Integer[] left = new Integer[mid-first+1+1];
		for(int i=0; i<mid-first+1; i++){
			left[i]=array[i+first];
		}
		left[mid-first+1]=Integer.MAX_VALUE;
		
		Integer[] right = new Integer[last-mid+1];
		for(int i=0; i<last-mid; i++){
			right[i]=array[i+mid+1];
		}
		right[last-mid]=Integer.MAX_VALUE;
		
		int i=0;
		int j=0;
		int z=first;
		while(i<(mid-first+1)||(j<(last-mid))){
			if(left[i]<right[j]){
				array[z]=left[i];
				i++;
			}
			else{
				array[z]=right[j];
				j++;
			}
			z++;
		}
		
		
		
		
	}
	
	
	public static void main(String[] args){
		
		int[] test = new int[2];
		test[0]=7;
		test[1]=6;
//		test[2]=23;
//		test[3]=42;
//		test[4]=43;
//		test[5]=9;
//		test[6]=13;
//		test[7]=33;
//		test[8]=42;
//		test[9]=50;
//		
		merge(test,0,0,1);
		
		for(int i:test){
			System.out.println(i+" ");
		}
	}

}
