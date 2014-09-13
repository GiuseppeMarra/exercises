
public class BruteForceApproach {
	
	
	public static void main(String[] args){
		
		int n = 100000;
		int[] A = new int[n];
		for(int i=0; i<n;i++){
			A[i]= (int) (Math.random()*100000);
			//System.out.print(A[i]+", ");
		}
		
//		A[0]=7;
//		A[1]=2;
//		A[2]=3;
//	    A[3]=1;
//	    A[4]=8;
//	    A[5]=6;
//	    A[6]=4;
//	    A[7]=5;
		
		long init=System.currentTimeMillis();
		long count=0;
		for(int i=0; i<A.length;i++){
			for(int j=i+1;j<A.length;j++){
				if (A[i]>A[j])
					count++;
			}
		}

		System.out.println(count);
	    long end =System.currentTimeMillis();
		System.out.println("Tempo impiegato= "+ (end-init)+"ms");
		
		
	}

}
