package Week2;
import java.util.*;
public class BaseBall_Game {

	// Example :
	
//	Input: ops = ["5","-2","4","C","D","9","+","+"]
//	Output: 27
	
//	Explanation:
//			"5" - Add 5 to the record, record is now [5].
//			"-2" - Add -2 to the record, record is now [5, -2].
//			"4" - Add 4 to the record, record is now [5, -2, 4].
//			"C" - Invalidate and remove the previous score, record is now [5, -2].
//			"D" - Add 2 * -2 = -4 to the record, record is now [5, -2, -4].
//			"9" - Add 9 to the record, record is now [5, -2, -4, 9].
//			"+" - Add -4 + 9 = 5 to the record, record is now [5, -2, -4, 9, 5].
//			"+" - Add 9 + 5 = 14 to the record, record is now [5, -2, -4, 9, 5, 14].
//			The total sum is 5 + -2 + -4 + 9 + 5 + 14 = 27.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr = {"5","2","C","D","+"};
		System.out.println(calPoints(arr));
	}
	public static int calPoints(String[] arr) {
        Stack<Integer> st= new Stack<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("D")){
                st.push(st.peek()*2);
            }
            else if(arr[i].equals("C")) st.pop();
            else if(arr[i].equals("+")){
                int a=st.pop();
                int b=st.pop();
                st.push(b);
                st.push(a);
                st.push(a+b);
            }
            else{
                st.push(Integer.parseInt(arr[i])); // there must be an integer
            }
        }
        int ans=0;
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;
    }
}
