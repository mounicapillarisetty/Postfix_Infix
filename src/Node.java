
/* 
 * This part of the assignment is a node class 
 * A program that is from the scratch without using the implementations in the Java Collections Framework
 * 
 * @author Mounica Pillarisetty
 * @version 101041499
 * 
 * 1 of 4
 */

public class Node {
	
	// variables needed to create a node
	private Object item;
	private Node next;
	
	// @param obj		an Object type that is initialized to the item object
	public Node (Object obj){
		item = obj;
		next = null;
	}
	
	// @param obj		an Object type that is initialized to the item object
	// @param node		a Node type that is initialized to the node
	public Node(Object obj, Node node){
		item = obj;
		next = node;
	}
	
	// @return item 	returns the item at a position
	public Object getItem(){
		return item;
	}
		
	// @return next		returns the next node 
	public Node getNext(){
		return next;
	}
	
	//@param obj		an Object type that is initialized to the item object
	public void setItem(Object obj){
		item = obj;
	}
	
	// @param node		a Node type that is initialized to the node
	public void setNext(Node node){
		next = node;
	}
}	