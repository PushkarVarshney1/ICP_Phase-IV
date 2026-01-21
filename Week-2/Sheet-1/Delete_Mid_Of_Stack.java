package Week2;
import java.util.*;
public class Delete_Mid_Of_Stack {
	
//	Input: s = [10, 20, 30, 40, 50]
//	Output: [50, 40, 20, 10]
//			
//	Input: s = [10, 20, 30, 40]
//	Output: [40, 30, 10]
	
	public static void main(String[] args) {
		// TODO Auto-generated method 
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		deleteMid(st);
	}
	public static void deleteMid(Stack<Integer> s) {
        // code here
        Stack<Integer> st = new Stack<>();
        int mid = s.size()/2;
        for(int i=1; i<=mid; i++){
            st.push(s.pop());
        }
        s.pop();
        while(!st.isEmpty()){
            s.push(st.pop());
        }
        System.out.println(s);
    }
}
