package Week2;
import java.util.*;
public class Valid_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "()[]{}";
		System.out.println(isValid(s));
	}
	public static boolean isValid(String s) {
        int n=s.length();
        if(n==1)return false;
        Stack<Character> st=new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch == '(' || ch=='{' || ch=='[')st.push(ch);
            else{
                if(st.isEmpty())return false;
                else if((st.peek() =='(' && ch==')') || (st.peek()=='[' && ch==']')||(st.peek()=='{' && ch=='}') )st.pop();
                else return false;
            }
        }
        // not return only true b/c all brackets are open
        return st.isEmpty();
    }
}
