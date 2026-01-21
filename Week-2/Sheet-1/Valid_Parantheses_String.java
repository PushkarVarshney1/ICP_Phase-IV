package Week2;
import java.util.*;
public class Valid_Parantheses_String {
	
//			Given a string s containing only three types of Integers: '(', ')' and '*', return true if s is valid.
//			The following rules define a valid string:
//
//			Any left parenthesis '(' must have a corresponding right parenthesis ')'.
//			Any right parenthesis ')' must have a corresponding left parenthesis '('.
//			Left parenthesis '(' must go before the corresponding right parenthesis ')'.
//			'*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".
//			 
//
//			Example 1:				Example 2:					Example 3:
//
//			Input: s = "()"		Input: s = "(*)"			Input: s = "(*))"
//			Output: true		Output: true				Output: true
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		String s = sc.next();
		System.out.println(valid(s));
	}
	public static boolean valid(String s) {
		Stack<Integer> open = new Stack<>();
		Stack<Integer> ast = new Stack<>();
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == '(')open.push(i);
			else if(ch == '*')ast.push(i);
			else {
				if(!open.isEmpty())open.pop();
				else if(!ast.isEmpty())ast.pop();
				else return false;
			}
		}
		while(!open.isEmpty() && !ast.isEmpty()) {
			if(open.pop() > ast.pop())return false;
		}
		return open.isEmpty();
	}

}
