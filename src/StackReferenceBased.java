
/* 
 * This part of the assignment is a stack reference-based 
 * A program that is from the scratch without using the implementations in the Java Collections Framework
 * 
 * @author Mounica Pillarisetty
 * @version 101041499
 * 
 * 2 of 4
 */
public class StackReferenceBased {
	
	//local variables
	private static Node top;
	//private static int items;
	
	public StackReferenceBased(){
		createStack();
	}
	
	public static void createStack(){
		top = null;
		//items = 0;
	}
	
	public static void popAll(){
		top = null;
		//items = 0;
	}
	
	// @return boolean		returns true if the stack is empty 
	public static boolean isEmpty(){
		return (top == null);
	}
	
	// @param obj		an Object type that is initialized to the item object
	public static void push(Object obj){
		top = new Node(obj, top);
		//items++;
	}
	
	// @return obj		an Object that is to popped is returned 
	public static Object pop(){
		Object obj = top.getItem();
		top = top.getNext();
		//items--;
		return obj;
	}
	
	// @return obj		an Object that is to peeked is returned 
	public static Object peek(){
		return top.getItem();
	}
}