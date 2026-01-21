package Week2;
import java.util.*;
public class Backspace_String_Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ab#c";
		String t = "ad#c";
		System.out.println(backspaceCompare(s,t));
	}
	public static boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch != '#'){
                st1.push(ch);
            }
            else{
                if(!st1.isEmpty())st1.pop();
            }
        }
        s="";
        while(!st1.isEmpty()){
            s+=st1.pop();
        }
        for(char ch : t.toCharArray()){
            if(ch != '#'){
                st2.push(ch);
            }
            else{
                if(!st2.isEmpty())st2.pop();
            }
        }
        t="";
        while(!st2.isEmpty()){
            t+=st2.pop();
        }
        return s.equals(t);
    }
}
