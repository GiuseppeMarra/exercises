import java.util.Scanner;


public class Calendar {
	
	

	public static void main(String[] args) {

		System.out.print("Inserisci il giorno: ");
		Scanner s = new Scanner(System.in);
		int giorno =s.nextInt();
		System.out.print("Inserisci il mese: ");
		Scanner s1 = new Scanner(System.in);
		int mese = s1.nextInt();
		System.out.print("Inserisci l'anno: ");
		Scanner s2 = new Scanner(System.in);
		int anno = s2.nextInt();
		System.out.println();
		
		//totale giorni fino all'ultimo anno completo (il precedente)
		int giorno0=1;
		int mese0=1;
		int anno0=2012; //domenica
		int bisestile0=2012;
		int bisestili=0;
		int nonbisestili=0;
		int totalegiorniannoprima=0;
		if(anno-anno0!=0){
			bisestili=1+(anno-bisestile0-1)/4; //1 � l'anno d'origine, il -1 serve a non considerare l'anno corrente
			nonbisestili=anno-bisestile0-bisestili;
			totalegiorniannoprima=365*nonbisestili+366*bisestili;
			
		}
		System.out.println("bisestili: "+bisestili);
		
		System.out.println("nonbisestili: "+nonbisestili);

		System.out.println("totale giorni anno prima: "+totalegiorniannoprima);
		
		//totale giorni nell'ultimo anno escluso il mese corrente
		int annocorrente=0;
		for(int i=1; i<mese; i++){
			int giorni;
			if (i==11||i==4||i==6||i==9)
				giorni=30;
			else if (i==2){
				if(anno%4==0)
					giorni=29;
				else 
					giorni=28;
			}
			else{
				giorni=31;
			}
			annocorrente=annocorrente+giorni;
				
		}
		System.out.println("giorni ultimo anno escluso il mese corrente: "+annocorrente);
		
		//totale totale
		int totale=totalegiorniannoprima+annocorrente+giorno;
		
		int offset=(totale%7)-1;
		
		System.out.println(offset);		
	}

}
