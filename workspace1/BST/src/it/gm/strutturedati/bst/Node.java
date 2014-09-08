package it.gm.strutturedati.bst;

public class Node<T extends Comparable<? super T>> {
	
	private T value;
	private Node<T> lchild;
	private Node<T> rchild;
	private Node<T> parent;
	
	public Node(){
		
	}
	
	public Node(T value){
		this.value=value;
	}
	
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public Node<T> getLchild() {
		return lchild;
	}
	public void setLchild(Node<T> lchild) {
		this.lchild = lchild;
	}
	public Node<T> getRchild() {
		return rchild;
	}
	public void setRchild(Node<T> rchild) {
		this.rchild = rchild;
	}
	public Node<T> getParent() {
		return parent;
	}
	public void setParent(Node<T> parent) {
		this.parent = parent;
	}
	
	public boolean isRoot(){
		if(parent==null) return true;
		else return false;
	}

}
