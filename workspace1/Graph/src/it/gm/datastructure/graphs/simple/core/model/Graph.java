package it.gm.datastructure.graphs.simple.core.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class Graph {
	
	public static final double INFINITY = Double.MAX_VALUE;
	private Map<String,Vertex> vertexMap = new HashMap<String,Vertex>( );

	
	
	private Vertex getVertex(String vertexName) {
		
		/**If vertexName is not present, add it to vertexMap.
		 * In either case, return the correspondent Vertex.
		 */
		Vertex v= this.vertexMap.get(vertexName);
		if(v==null){
			v=new Vertex(vertexName);
			vertexMap.put(vertexName, v);
		}
		
		return v;

	
	}
	
	
	public void addEdge(String sourceName, String destName, double cost) {

		/**
		 * Add a new Edge to the graph
		 */
		
		Vertex source =this.vertexMap.get(sourceName);
		Vertex dest = this.vertexMap.get(destName);
		List<Edge> adj =source.getAdjacencyList();
		adj.add(new Edge(dest, cost));
		
	}
	
	
	private void clearAll(){
		
		for(Vertex v:this.vertexMap.values()){
			v.reset();
			
		}
	}

	
	private void printPath(Vertex dest)
	{
		
		/**
		 * Recursive routine to print shortest path to dest 
		 * after running shortest path algorithm. The path is
		 * known to exist.
		 */
		if(dest.getPrev()!=null){
			
			printPath(dest.getPrev());
			System.out.print(" to ");
			
		}
		System.out.print(dest.getName());
	}

	
	public void printPath(String destName) {
		/**
		 * Driver routine to handle unreachable nodes and print total cost.
		 * It calls recursive routine to print shortest path to destName
		 * after a shortest path algorithm has run.
		 */
		Vertex w = vertexMap.get( destName );
		if(w==null)
			throw new NoSuchElementException( );
		else if( w.getDist() == INFINITY )
			System.out.println( destName + " is unreachable" );
		else
		{
			System.out.print( "(Cost is: " + w.getDist() + ") " );
			printPath( w );
			System.out.println( );
		}


	}

	
	public void unweighted(String startName) {
		// TODO Auto-generated method stub

	}

	
	public void dijkstra(String startName) {
		// TODO Auto-generated method stub

	}

	
	public void negative(String startName) {
		// TODO Auto-generated method stub

	}

	
	public void acyclic(String startName) {
		// TODO Auto-generated method stub

	}

}
