package it.gm.strutturedati.bst;

import java.util.Vector;

public class Test {

	public static void main(String[] args){
		Vector<Integer> v = new Vector<Integer>();
		BST<Integer> abr = new BST<Integer>(12);
		v.add(5);
		v.add(18);
		v.add(2);
		v.add(15);
		v.add(19);
		v.add(13);
		v.add(17);
		v.add(10);
		v.add(8);
		v.add(9);
		

		
		
		for(Integer i: v){
			try {
				abr.insert(i);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println();
		Vector<String> res = abr.prettyPrint(50);
		for(String s:res) {
			System.out.println(s);
			System.out.println();
			System.out.println();
			
		}
		

		
		Vector<Integer> v2 = abr.inOrderTreeWalk();
		System.out.println("In-Order Tree Walk");

		for(Integer i:v2){
			System.out.print(i+", ");

		}
		System.out.println();
		System.out.println();
		
		
		Vector<Integer> v5 = abr.preOrderTreeWalk();
		System.out.println("Pre-Order Tree Walk");

		for(Integer i:v5){
			System.out.print(i+", ");

		}
		System.out.println();
		System.out.println();
		
		
		Vector<Integer> v6 = abr.postOrderTreeWalk();
		System.out.println("Post-Order Tree Walk");

		for(Integer i:v6){
			System.out.print(i+", ");

		}
		System.out.println();
		System.out.println();

//		
//		System.out.println("Altezza Albero");
//		System.out.println(abr.height());
//		System.out.println();
//
//		
//		System.out.println("Ordine di comparsa nell'albero");
//		Vector<Integer> v3 = abr.toVector();
//		System.out.println("dimensione dell'array: "+v3.size());
//		
//		for(Integer i:v3){
//			System.out.print(i+", ");
//
//		}
//		
//		System.out.println("minimum: "+abr.minimumValue(abr.search(10)));
//		
//		abr.remove(5);
//		System.out.println();
//		res = abr.prettyPrint(50);
//		for(String s:res) {
//			System.out.println(s);
//			System.out.println();
//			System.out.println();
//			
//		}
		
		
		
	}
}
