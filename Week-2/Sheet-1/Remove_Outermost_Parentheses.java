package Week2;
import java.util.*;
public class Remove_Outermost_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(()())(())(()(()))";
		System.out.println(removeOuterParentheses(s));
	}
	public static String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(Character ch:s.toCharArray()){
            if(ch == '('){
                if(st.size() > 0) sb.append(ch);
                st.push(ch);
            }
            else{
                st.pop();
                if(st.size() > 0) sb.append(ch);
            }
        }
        return sb.toString();
    }
}
