package it.gm.datastructure.graphs.simple.core.model;

import java.util.List;

public class Vertex {
	
	private String name;  //vertex name
	private List<Edge> adj;  //adjacency list
	private double dist;   //shortest path distance
	private Vertex prev;  //previous vertex in the shortestpath
	private int scratch;  //exploied in some algorithms
	
	
	public Vertex(String name, List<Edge> adj, double dist, Vertex prev) {
		super();
		this.name = name;
		this.adj = adj;
		this.dist=dist;
		this.prev=prev;
	}
	public Vertex(String vertexName) {
		this.name=vertexName;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Edge> getAdjacencyList() {
		return adj;
	}
	public void setAdjacencyList(List<Edge> adj) {
		this.adj = adj;
	}
	public double getDist() {
		return dist;
	}
	public void setDist(double dist) {
		this.dist = dist;
	}
	public Vertex getPrev() {
		return prev;
	}
	public void setPrev(Vertex prev) {
		this.prev = prev;
	}
	public int getScratch() {
		return scratch;
	}
	public void setScratch(int scratch) {
		this.scratch = scratch;
	}
	
	public void reset(){
		dist = Graph.INFINITY; 
		prev = null; 
		scratch = 0; 
	}
	
	
	

}