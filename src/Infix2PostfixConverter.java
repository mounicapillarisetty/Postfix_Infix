import java.util.Scanner;
import java.util.StringTokenizer;

/* 
 * This part of the assignment is an converter from infix to postfix. 
 * 
 * Infix2PostfixConverter to implement an infix calculator using the class StackReferenceBased. 
 * 
 * The Infix2PostfixConverter accepts infix expressions from the user, 
 * covert the infix expression to postfix expression (method convertPostfix), 
 * and evaluate the resulting postfix expression (method getPostfix).
 * Used some work from a project I did over the summer, which was a collaborated work
 * 
 * @author Mounica Pillarisetty
 * @version 101041499
 * 
 * 3 of 4
 */
public class Infix2PostfixConverter {

	//local variables
	private static StringTokenizer operation;
	private static StringBuffer postfix;
	private static char c;
	private static Scanner scanner;
	private static int operand1;
	private static int operand2;

	// @param char			c is a character that is used to initialize the operations (+-*/)
	// @return boolean		returns true if the operation is valid or false otherwise
	public static boolean isOperator(char c){
		return (c == '+' || c == '-' || c == '*' || c == '/' || c == '(' || c == ')');
	}

	// @param operation1	operation1 is a character that is used to initialize the operations (+-*/) and compared to operation2 so the precedence is found
	// @param operation2	operation2 is a character that is used to initialize the operations (+-*/) and compared to operation1 so the precedence is found
	// @return boolean		returns true if the operation is ahead in precedence or false otherwise
	public static boolean isPrecedence(char operation1, char operation2){
		if(operation1 == '+' || operation1 == '-'){
			return !(operation2 == '+' || operation2 == '-');
		}else if(operation1 == '*' || operation1 == '/'){
			return operation2 == '(';
		}else if(operation1 == '('){
			return true;
		}
		return false;
	}

	// @param infix 		infix is a String that is going to be converted into a postfix
	// @return String		the postfix of the infix given by the user after conversion 
	public static String convertPostfix (String infix) {
		operation = new StringTokenizer(infix, "+-*/()", true);
		postfix = new StringBuffer(infix.length());

		while(operation.hasMoreTokens()) {
			String str = operation.nextToken();
			c = str.charAt(0);

			if (isOperator(c) && str.length() == 1) {
				while(!StackReferenceBased.isEmpty() && !isPrecedence(StackReferenceBased.peek().toString().charAt(0), c)) {
					postfix.append(StackReferenceBased.pop().toString() + " ");
				} 
				if(c == ')') {
					String a = StackReferenceBased.pop().toString();
					while(a.charAt(0) != '(') {
						postfix.append(a + " ");
						a = StackReferenceBased.pop().toString();
					}
				} else {
					StackReferenceBased.push(str);
				}
			} else {
				postfix.append(str +" ");
			}
		}
		while(!StackReferenceBased.isEmpty()){
			postfix.append(StackReferenceBased.pop().toString() + " ");
		}
		return postfix.toString();
	}

	// @param postfix 		postfix is a String that is converted into a postfix
	// @return int			the evaluated answer to the postfix expression  
	public static int getPostfix(String postfix){
		scanner = new Scanner(postfix);
		while (scanner.hasNext()) {
			if (scanner.hasNextInt()) {
				StackReferenceBased.push(scanner.nextInt());
			} else {
				String opr = scanner.next();
				operand2 = (int) StackReferenceBased.pop();
				operand1 = (int) StackReferenceBased.pop();
				if (opr.equals("+")) {
					StackReferenceBased.push(operand1 + operand2);
				} else if (opr.equals("-")) {
					StackReferenceBased.push(operand1 - operand2);
				} else if (opr.equals("*")) {
					StackReferenceBased.push(operand1 * operand2);
				} else {
					StackReferenceBased.push(operand1 / operand2);
				}
			}
		}
		return (Integer)StackReferenceBased.pop();
	}
}