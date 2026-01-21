package Week2;
import java.util.*;
public class Reverse_Using_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="GeeksforGeeks";
		System.out.println(reverse(s)); // Recursion
		System.out.println(fun1(s));  // Stack
	}
			// Using Recursion 
	
	//  Time Complexity : O(n) → each character processed once.
	// Space Complexity : O(n) → recursion call stack stores n calls.


	public static String reverse(String S) {
        // code here
        return fun(S , S.length()-1);
    }
    public static String fun(String s,int idx){
        if(idx < 0){
            return "";
        }
        return s.charAt(idx) + fun(s,idx-1) ;
    }
    
    		// Using Stack
    // Time Complexity : O(n) → pushing and popping each character once.
    // Space Complexity : O(n) → explicit stack stores n characters.

    public static String fun1(String s) {
    	Stack<Character> st = new Stack<>();
    	String ans = "";
    	for(char ch : s.toCharArray()) {
    		st.push(ch);
    	}
    	while(!st.isEmpty()) ans += st.pop();
    	return ans;
    }
}
