package it.gm.algorithm.sorting.advanced;

public class Test {

	
	public static void main(String[] args){
		
		
		int n = 10000;
		Integer[] unsorted = new Integer[n];
		System.out.print("Non Ordinato: ");
		for(int i=0; i<n;i++){
			unsorted[i]=(int) (Math.random()*100000);
			System.out.print(unsorted[i]+", ");
		}
		System.out.println();
		long init=System.currentTimeMillis();
		
		
		Integer[] sorted=null;
		sorted = InsertionSort.sort(unsorted); 
		//sorted = SelectionSort.sort(unsorted);
		//sorted = BubbleSort.sort(unsorted);

		
		
		
		long end =System.currentTimeMillis();
		System.out.print("Ordinato: ");
		for(Integer i:sorted) System.out.print(i+", ");
		System.out.println();
		System.out.println("Tempo impiegato= "+ (end-init)+"ms");
		
	
	}
	
	
	
}
