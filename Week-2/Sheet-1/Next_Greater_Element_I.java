package Week2;

import java.util.*;

public class Next_Greater_Element_I {

	//Input : arr[] ={4 ,5, 2, 10} 
	
	//Output : [5, 10, 10, -1]
	
		public static void main (String args[]) {
			// TODO Auto-generated method stub
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int []arr = new int[n];
	        for(int i=0;i<n;i++){
	            arr[i]=sc.nextInt();
	        }
	        
	        Stack<Integer> st=new Stack<>();
	        int []ans=new int[n];
	        for(int i=0;i<n;i++){
	            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
	                ans[st.pop()]=arr[i];
	            }
	            st.push(i);
	        }
	        while(!st.isEmpty()){
	            ans[st.pop()]=-1;
	        }
	        System.out.print(Arrays.toString(ans));
	        sc.close();
	    }

}
