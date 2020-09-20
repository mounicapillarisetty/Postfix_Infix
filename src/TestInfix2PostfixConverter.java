
/* 
 * This is the main function that tests the Infix2PostfixConverter
 * 
 * @author Mounica Pillarisetty
 * @version 101041499
 * 
 * 4 of 4
 */

public class TestInfix2PostfixConverter extends Infix2PostfixConverter {
	
	//private static Scanner userInput; //used when user input is required
	private static String infix;
	private static String postfix;

		public static void main(String[] arg) {
			// Using user input, commented out for evaluation purposes
			/* 
			System.out.print("infix: ");
			userInput = new Scanner(System.in);
			String infix = userInput.nextLine();
			userInput.close(); 
			String postfix = convertPostfix(infix);
			System.out.println("postfix: " + postfix);
			System.out.println("result: " + getPostfix(postfix)); 
			*/
			
			// Test Case 1
			infix = "(10 + 3 * 4 / 6)" ;
			System.out.println("infix: " + infix);
			postfix = convertPostfix(infix); 
			System.out.println("postfix: " + postfix);            
			System.out.println("result: " + getPostfix(postfix));	      
			System.out.println();
			
			// Test Case 2
			infix = "12*3 - 4 + (18 / 6)" ;
			System.out.println("infix: " + infix);
			postfix = convertPostfix(infix); 
			System.out.println("postfix: " + postfix);            
			System.out.println("result: " + getPostfix(postfix));	
			System.out.println();

			// Test Case 3
			infix = "35 - 42* 17 /2 + 10" ;
			System.out.println("infix: " + infix);
			postfix = convertPostfix(infix); 
			System.out.println("postfix: " + postfix);            
			System.out.println("result: " + getPostfix(postfix));	
			System.out.println();

			// Test Case 4
			infix = "3 * (4 + 5)" ;
			System.out.println("infix: " + infix);
			postfix = convertPostfix(infix); 
			System.out.println("postfix: " + postfix);            
			System.out.println("result: " + getPostfix(postfix));	
			System.out.println();

			// Test Case 5
			infix = "3 * ( 17 - (5+2))/(2+3)" ;
			System.out.println("infix: " + infix);
			postfix = convertPostfix(infix); 
			System.out.println("postfix: " + postfix);            
			System.out.println("result: " + getPostfix(postfix));	
			System.out.println();
			
		}
}
