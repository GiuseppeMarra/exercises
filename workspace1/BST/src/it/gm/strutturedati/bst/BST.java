package it.gm.strutturedati.bst;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Vector;

public class BST<T extends Comparable<? super T>> {
	
	private Node<T> root;

	public Node<T> getRoot() {
		return root;
	}
	
	public BST (T root){
		this.root = new Node<T>();
		this.root.setValue(root);
	}
	
	private BST(Node<T> root){
		this.root=root;
	}
	
	public BST<T> getSubTree(Node<T> n){
		BST<T> res = new BST<T>(n);
		return res;
	}
	
	public int height(){
		
		if(this.root==null) return 0; //albero vuoto
		else{
			int lheight = this.getSubTree(root.getLchild()).height();
			int rheight = this.getSubTree(root.getRchild()).height();
			if (lheight>=rheight) return 1+lheight;
			else return 1+rheight;
		}
	}
	
	public Vector<T>  toVector(){
		
		Vector<T> res = new Vector<T>();
		res.add(null);
		Queue<Node<T>> pq = new LinkedList<Node<T>>();
		Queue<Integer> indexes = new LinkedList<Integer>();
		pq.add(root);
		indexes.add(1);
		Node<T> current;
		Integer currentindex;
		

		while(!pq.isEmpty()){
			current =pq.poll();
			currentindex=indexes.poll();
			if(current!=null){

				while(currentindex>res.size()) res.add(null);
				res.add(currentindex,current.getValue());
				pq.add(current.getLchild());
				indexes.add(currentindex*2);
				pq.add(current.getRchild());
				indexes.add(currentindex*2+1);
			}
		}

		return res;

			
		}
			
	public Vector<String> prettyPrint(int maxnumchar){
		
		
		Vector<String> res2 = new Vector<String>();
		Vector<T> v = this.toVector();
	
		
		for(int h=0; h<this.height(); h++){
			String res="";
			int temp= maxnumchar/((int) Math.pow(2, h));
			for(int i=0; i<((int) Math.pow(2, h)); i++){
				
				for(int j=0; j<temp-i; j++) 
					res=res.concat(" ");
				
				if(((int) Math.pow(2, h)+i)<v.size()&&v.get((int) Math.pow(2, h)+i)!=null)
					res=res.concat("["+v.get((int) Math.pow(2, h)+i).toString()+"]");
				else 
					res=res.concat("[-]");
				
				for(int j=0; j<temp-i; j++) 
					res=res.concat(" ");					
			}
			res2.add(res);
		}

		
		
		
		return res2;
	}

	public void insert(T value) throws Exception{
		Node<T> current = root;
		Node<T> parent=null;

		//cerco la posizione in cui inserire il nuovo nodo (mi salvo parent) che sarà un null pointer alla fine
		while(current!=null){
			parent=current;
			if(value.compareTo(current.getValue())<0){
				current=current.getLchild();
			}
			else{
				current=current.getRchild();

			}


		}


		Node<T> newNode = new Node<T>(value);
		newNode.setParent(parent);

		if(parent==null) 
			System.out.println("L'albero era vuoto e il nuovo nodo è diventato la sua radice.");
		else if(value.compareTo(parent.getValue())<0) 
			parent.setLchild(newNode);
		else 
			parent.setRchild(newNode);
	}
	
	public Vector<T> inOrderTreeWalk(){
		Node<T> n = this.root;
		Vector<T> res = new Vector<T>();
		if (n!=null){
			res.addAll(this.getSubTree(n.getLchild()).inOrderTreeWalk());
			res.add(n.getValue());
			res.addAll(this.getSubTree(n.getRchild()).inOrderTreeWalk());

			
		}
		return res;
	}
	
	public void remove(Node<T> node){
		Node<T> parent=node.getParent();		
		
		//il nodo è una foglia
		if(node.getLchild()==null&&node.getRchild()==null)
		{
			if(node.getValue().compareTo(parent.getValue())<0)
				parent.setLchild(null);
			else
				parent.setRchild(null);
			node.setParent(null);
		}
		//il nodo da rimuovere ha solo un figlio destro
		else if(node.getLchild()==null&&node.getRchild()!=null){
			if(node.getValue().compareTo(parent.getValue())<0)
				parent.setLchild(node.getRchild());
			else
				parent.setRchild(node.getRchild());
			
			
		}
		//il nodo da rimuovere ha solo un figlio sinistro

		else if (node.getLchild()!=null&&node.getRchild()==null){
			if(node.getValue().compareTo(parent.getValue())<0)
				parent.setLchild(node.getLchild());
			else
				parent.setRchild(node.getLchild());
			
		}
		
		//il nodo da rimuovere ha entrambi i figli
		else{
			Node<T> min= minimum(node.getRchild());
			T val=node.getValue();
			node.setValue(min.getValue());
			remove(min);
		}
		
	}
	public void remove(T value){
		
		Node<T> node=this.search(value);
		Node<T> parent=node.getParent();		
		
		//il nodo è una foglia
		if(node.getLchild()==null&&node.getRchild()==null)
		{
			if(node.getValue().compareTo(parent.getValue())<0)
				parent.setLchild(null);
			else
				parent.setRchild(null);
			node.setParent(null);
		}
		//il nodo da rimuovere ha solo un figlio destro
		else if(node.getLchild()==null&&node.getRchild()!=null){
			if(node.getValue().compareTo(parent.getValue())<0)
				parent.setLchild(node.getRchild());
			else
				parent.setRchild(node.getRchild());
			
			
		}
		//il nodo da rimuovere ha solo un figlio sinistro

		else if (node.getLchild()!=null&&node.getRchild()==null){
			if(node.getValue().compareTo(parent.getValue())<0)
				parent.setLchild(node.getLchild());
			else
				parent.setRchild(node.getLchild());
			
		}
		
		//il nodo da rimuovere ha entrambi i figli
		else{
			Node<T> min= minimum(node.getRchild());
			node.setValue(min.getValue());
			remove(min);
		}
		
	}

	private Node<T> minimum(Node<T> root){
		
		Node<T> res;
		if(root.getLchild()==null&&root.getRchild()==null)
			res =root;
		else if(root.getLchild()==null){
			res=minimum(root.getRchild());
			if(res.getValue().compareTo(root.getValue())>0) res=root;
		}
			else
				res= minimum(root.getLchild());
		
		return res;
			
	}
	
	public T minimumValue(Node<T> root){
		return minimum(root).getValue();
	}
	public Node<T> search(T value){

		return search(this.root, value);
	}
 	
	private Node<T> search(Node<T> root, T value) {
		
		Node<T> res;
		if(value.compareTo(root.getValue())<0)
			res=search(root.getLchild(), value);
		else if((value.compareTo(root.getValue())>0))
			res=search(root.getRchild(), value);
		else
			res=root;
		
		return res;
		
	}
	
	public Vector<T> preOrderTreeWalk(){
		Node<T> n = this.root;
		Vector<T> res = new Vector<T>();
		if (n!=null){
			res.add(n.getValue());
			res.addAll(this.getSubTree(n.getLchild()).preOrderTreeWalk());
			res.addAll(this.getSubTree(n.getRchild()).preOrderTreeWalk());			
		}
		return res;
	}
	
	
	public Vector<T> postOrderTreeWalk(){
		Node<T> n = this.root;
		Vector<T> res = new Vector<T>();
		if (n!=null){
			res.addAll(this.getSubTree(n.getLchild()).postOrderTreeWalk());
			res.addAll(this.getSubTree(n.getRchild()).postOrderTreeWalk());
			res.add(n.getValue());
		}
		return res;
	}
	
	


}
